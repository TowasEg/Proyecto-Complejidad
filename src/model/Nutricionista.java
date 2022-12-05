package model;

import view.View;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

/**
 * The type Nutricionista.
 */
public class Nutricionista {


    private static int I = Integer.MAX_VALUE;

    /**
     * Min int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    static int Min(int a, int b) {
        return (b < a) ? b : a;
    }

    /**
     * Calcular int [ ] [ ].
     *
     * @param lista the lista
     * @param N     the n
     * @param C     the c
     * @return the int [ ] [ ]
     */
    public static int[][] Calcular(int[] lista, int N, int C) {
        int MaxElem = N + 1;
        int MaxCant = C + 1;
        int[][] tabla = new int[MaxElem][MaxCant];

        for(int i = 0; i < MaxElem; i++) {
            tabla[i][0] = 0;
        }
        for(int i = 1; i < MaxCant; i++) {
            tabla[0] [i] = I;
        }

        int a, b;
        for(int i = 1; i < MaxElem; i++) {
            for(int j = 1; j < MaxCant; j++) {
                a = tabla[i - 1][j];
                if(lista[i - 1] <= j) {
                    b = tabla[i - 1] [j - lista[i - 1]];
                    if(b < I) b += lista[i - 1];
                } else {
                    b = lista[i - 1];
                }
                if(b >= j) {
                    tabla[i] [j] = Min(a, b);
                } else {
                    tabla[i] [j] = I;
                }
            }
        }
        return tabla;
    }
/**
 * Resultado construye la matriz de abajo ahcia arriba.
 * @param t
 * @param l
 * @param N
 * @param C
 *
 * */
    private static Object[] Resultado(int[][] t, int[] l, int N, int C) {
        List<Integer> r = new ArrayList<Integer>();
        int i = N;
        int j = C;

        while(i > 0 && j > 0) {
            if(t[i] [j] == t[i - 1] [j]) {
                i--;
            } else {
                r.add(i - 1);
                j -= l[i - 1];
                i--;
            }
        }
        return r.toArray();
    }

    /**
     * Resolver, resuelve el problema de forma dinamica.
     *
     * @param lista the lista
     * @param C     the c
     */
    public static void Resolver(int[] lista, int C) {
        int[][] tabla = Calcular(lista, lista.length, C);


        for (int i = 0; i < tabla.length; ++i) {
            for (int j = 0; j < tabla[0].length; ++j) {
                System.out.print("[" + tabla[i][j] + "]");
            }
            System.out.println();
        }
        Object[] r = Resultado(tabla, lista, lista.length, C);


        for (int i : lista) {
            System.out.print("[" + i + "]");
        }



        System.out.println();


        Formatter f = new Formatter();
        f.format("TOTAL CALORÍAS A CONSUMIR: %s CALORÍAS", C);
        System.out.println(f.toString());
        //f.toString();
        JOptionPane.showMessageDialog(null,f.toString());


        int suma = 0;


        Formatter f1 = null;
        int valor = 0;
        for (Object n : r) {
            valor = (Integer) n;
            suma += lista[valor];
            f1 = new Formatter();
            f1.format("PLATO %s = %s CALORÍAS", valor + 1, lista[valor]);
            System.out.println(f1.toString());
            JOptionPane.showMessageDialog(null,"**PLATOS QUE DEBE CONSUMIR PARA CUMPLIR SUS CALORÍAS**"+
                    "\n"+ f1.toString());
        }
        Formatter f2 = new Formatter();
        f2.format("TOTAL DE CALORÍAS CONSUMIDAS:  %s CALORÍAS", suma);
        System.out.println(f2.toString());
        JOptionPane.showMessageDialog(null,f2.toString());



    }




}
