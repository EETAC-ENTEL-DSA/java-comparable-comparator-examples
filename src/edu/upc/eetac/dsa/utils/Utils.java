package edu.upc.eetac.dsa.utils;

import java.util.Arrays;

public class Utils {

    public static void sort(Object[] v) {
        print(v);
        Arrays.sort(v);
        print(v);
        System.out.println();
    }

    public static void sort(int[] v) {
        print(v);
        Arrays.sort(v);
        print(v);
        System.out.println();
    }


    public static void print(Object[] v) {
        for (Object o : v) {
            System.out.println(o+" ");
        }
        System.out.println();
    }

    public static void print(int[] v) {
        for (int i : v) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
