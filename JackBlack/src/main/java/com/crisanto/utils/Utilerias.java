package com.crisanto.utils;

/**
 * Created by rocri on 16/05/2017.
 */
public class Utilerias {
     public static final int OPCION_PLANTARSE = 1;
     public static final int OPCION_PEDIR_CARTA = 2;
     public static final int OPCION_DOBLAR = 3;
     public static final int OPCION_RETIRAR = 4;
     public static final int OPCION_ASEGURAR = 5;

    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();

    }
}

