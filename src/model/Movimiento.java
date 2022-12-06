package model;

import java.util.ArrayList;

/**
 * The type Movimiento.
 */
public class Movimiento {

    private Liebre liebre;
    private CrearTablero crearTablero;
    private String[][] mov;

    /**
     * Instantiates a new Movimiento.
     */
    public Movimiento(){
        super();
        this.liebre = liebre;
        this.crearTablero = crearTablero;
        this.mov = mov;
    }

    /**
     * Casillalibre boolean.
     *
     * @param c the c
     * @param l the l
     * @return the boolean
     */
    public boolean casillalibre(Liebre c, Liebre l) {
        if (l != null && ! l.isLiebrepasado()) {
            return true;
        }
        return false;
    }


    /**
     * Rellenar matriz string [ ] [ ].
     *
     * @param f   the f
     * @param c   the c
     * @param ic  the ic
     * @param iff the iff
     * @param fc  the fc
     * @param ff  the ff
     * @return the string [ ] [ ]
     */
    public String[][] rellenarMatriz(int f, int c, int ic, int iff, int fc, int ff) {

        mov = new String[f][c];

        for (int i = 0; i < mov.length; i++) {
            for (int j = 0; j < mov.length; j++) {
                mov[i][j] = "X";
            }
            mov[ic][iff] = "L";
            mov[fc][ff] = "D";
        }
        return mov;
    }

    /**
     * Camino posibles.
     *
     * @param tablero the tablero
     * @param actual  the actual
     * @param camino  the camino
     * @param p       the p
     * @param q       the q
     * @param antes   the antes
     * @param saber   the saber
     * @param salto   the salto
     */
    public void caminoPosibles(CrearTablero tablero, Liebre actual, ArrayList<Liebre> camino, int p, int q, int antes, String saber, int[][] salto) {
        Liebre z;
        int x;
        int y;

        for (int i = 0; i < salto.length; i++) {
            x = actual.getX() + salto[i][0];
            y = actual.getY() + salto[i][1];
            z = tablero.posicion(x, y);

            if (casillalibre(actual, z)) {

                camino.add(z);
                actual.setLiebrepasado(true);
                algoritmo(tablero, z, camino, p, q, i, saber);
                actual.setLiebrepasado(false);
                camino.remove(z);

            }

        }
    }

    /**
     * Algoritmo.
     *
     * @param tablero  the tablero
     * @param actual   the actual
     * @param camino1  the camino 1
     * @param p        the p
     * @param q        the q
     * @param antes    the antes
     * @param direcion the direcion
     */
    public void algoritmo(CrearTablero tablero, Liebre actual, ArrayList<Liebre> camino1, int p, int q, int antes, String direcion) {

        if (actual.isTermino()) {
            tablero.mejorCamino((ArrayList<Liebre>) camino1.clone());

        } else {
            if (p != 0 && direcion.equals("q")) {
                p--;
                int[][] descripcion = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
                caminoPosibles(tablero, actual, camino1, p, q, antes, "p", descripcion);
            }
            if (q != 0 && direcion.equals("p")) {
                q--;
                if (antes == 0 || antes == 2) {

                    int[][] descripcion = {{0, 1}, {0, -1}};
                    caminoPosibles(tablero, actual, camino1, p, q, antes, "q", descripcion);

                } else {

                    int[][] descripcion = {{-1, 0}, {1, 0}};
                    caminoPosibles(tablero, actual, camino1, p, q, antes, "q", descripcion);

                }
            }
        }
    }

    /**
     * Movimiento liebre array list.
     *
     * @param f            the f
     * @param c            the c
     * @param libreiniciof the libreiniciof
     * @param libreinicioc the libreinicioc
     * @param librefinalf  the librefinalf
     * @param librefinalc  the librefinalc
     * @param p            the p
     * @param q            the q
     * @return the array list
     */
    public ArrayList<Liebre> movimientoLiebre(int f, int c, int libreiniciof, int libreinicioc, int librefinalf, int librefinalc, int p, int q) {

        Liebre[][] campo = new Liebre[f + 2][c + 2];

        for (int i = 1; i < (campo.length - 1); i++) {
            for (int j = 1; j < (campo.length - 1); j++) {
                campo[i][j] = new Liebre(i, j);
            }
        }

        campo[librefinalf][librefinalc].setTermino(true);
        ArrayList<Liebre> camino = new ArrayList<>();
        int pCamino = p;
        int qCaminos = q;
        int anterior = 0;
        CrearTablero trayectoria = new CrearTablero(campo);
        camino.add(campo[libreiniciof][libreinicioc]);
        algoritmo(trayectoria, campo[libreiniciof][libreinicioc], camino, pCamino, qCaminos, anterior, "q");
        return trayectoria.getEncontrarCamino();

    }

    /**
     * Camino full array list.
     *
     * @param f            the f
     * @param c            the c
     * @param libreiniciof the libreiniciof
     * @param libreinicioc the libreinicioc
     * @param librefinalf  the librefinalf
     * @param librefinalc  the librefinalc
     * @param p            the p
     * @param q            the q
     * @return the array list
     */
    public ArrayList<String[][]> caminoFull(int f, int c, int libreiniciof, int libreinicioc, int librefinalf, int librefinalc, int p, int q) {

        ArrayList<Liebre> lp = movimientoLiebre(f, c, libreiniciof, libreinicioc, librefinalf, librefinalc, p, q);
        ArrayList<String[][]> camino = new ArrayList<String[][]>();
        for (int i = 0; i < lp.size(); i++) {
            camino.add(rellenarMatriz(f + 2, c + 2, lp.get(i).getX(), lp.get(i).getY(), librefinalf, librefinalc));
        }
        return camino;
    }

    /**
     * Matriz liebre string.
     *
     * @param matrix the matrix
     * @return the string
     */
    public String matrizLiebre(String matrix[][]) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < (matrix.length - 1); i++) {
            for (int j = 1; j < (matrix.length - 1); j++) {
                builder.append("[" + matrix[i][j] + "]");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * Gets liebre.
     *
     * @return the liebre
     */
    public Liebre getLiebre() {
        return liebre;
    }

    /**
     * Sets liebre.
     *
     * @param liebre the liebre
     */
    public void setLiebre(Liebre liebre) {
        this.liebre = liebre;
    }

    /**
     * Gets crear tablero.
     *
     * @return the crear tablero
     */
    public CrearTablero getCrearTablero() {
        return crearTablero;
    }

    /**
     * Sets crear tablero.
     *
     * @param crearTablero the crear tablero
     */
    public void setCrearTablero(CrearTablero crearTablero) {
        this.crearTablero = crearTablero;
    }

    /**
     * Get mov string [ ] [ ].
     *
     * @return the string [ ] [ ]
     */
    public String[][] getMov() {
        return mov;
    }

    /**
     * Sets mov.
     *
     * @param mov the mov
     */
    public void setMov(String[][] mov) {
        this.mov = mov;
    }


}
