package model;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Nutricionista {

    private int i = Integer.MAX_VALUE;
    private int a, b;

    public int min(int a, int b) {
        return (b < a) ? b : a;
    }

    public int[][] calcular(int[] lista, int n, int c){
        int maxElem = n + 1;
        int maxCant = c + 1;
        int[][] tabla = new int[maxElem][maxCant];

        for (int i = 0; i < maxElem; i++) {
            tabla[i][0] = 0;
        }
        for (int i = 1; i < maxCant; i++) {
            tabla[0][i] = i;
        }

        for (int i = 1; i < maxElem; i++) {
            for (int j = 1; j < maxCant; j++) {
                a = tabla[i-1][j];
                if (lista[i-1] <= j) {
                    b = tabla[i - 1] [j - lista[i - 1]];
                    if (b < i) b+= lista[i-1];
                } else {
                    b = lista[i-1];
                }
                if (b >= j) {
                    tabla[i][j] = min(a,b);
                } else {
                    tabla[i][j] = i;
                }
            }
        }
        return tabla;
    }

    public Object[] resultado(int[][] t, int[] l, int n, int c) {
        List<Integer> r = new ArrayList<Integer>();
        int i = n;
        int j = c;

        while (i > 0 && j > 0) {
            if (t[i][j] == t[i-1][j]) {
                i--;
            } else {
                r.add(i-1);
                j -= l[i-1];
                i--;
            }
        }
        return r.toArray();
    }

    public void resolver(int[] lista, int c) {
        int tabla[][] = calcular(lista, lista.length, c);
        Formatter f = new Formatter();
        int suma = 0;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.println("["+tabla[i][j]+"]");
            }
            System.out.println();
        }
        Object[] r = resultado(tabla, lista, lista.length, c);

        System.out.println("Lista: ");
        for (int i : lista) {
            System.out.println("["+i+"]");
        }
        System.out.println();

        f.format("Total a consumir: %s calorias", c);
        System.out.println(f.toString());

        for (Object n: r) {
            int valor = (Integer)n;
            suma += lista[valor];
            Formatter f1 = new Formatter();
            f1.format("Plato %s = %s calorías", valor+1, lista[valor]);
            System.out.println(f1.toString());
        }
        Formatter f2 = new Formatter();
        f2.format("Total consumido:  %s calorías", suma);
        System.out.println(f2.toString());
    }



}
