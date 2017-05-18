package com.crisanto.domain.enumerator;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rocri on 14/05/2017.
 */
public enum Valor {
    AS("AS", Arrays.asList(1, 11)),
    DOS("DOS",2),
    TRES("TRES",3),
    CUATRO("CUATRO",4),
    CINCO("CINCO",5),
    SEIS("SEIS",6),
    SIETE("SIETE",7),
    OCHO("OCHO",8),
    NUEVE("NUEVE",9),
    DIEZ("DIEZ",10),
    JOTA("JOTA",10),
    QUEEN("QUEEN",10),
    KING("KING",10);

    private String valor;
    private Integer punto;
    private List<Integer> puntos;

    private Valor(String valor, int punto) {
        this.valor = valor;
        this.punto = punto;
    }

    private Valor(String valor, List<Integer> puntos) {
        this.valor = valor;
        this.puntos = puntos;
    }

    public String getValor() {
        return valor;
    }

    public Integer getPunto() {
        return punto;
    }

    public List<Integer> getPuntos() {
        return puntos;
    }
}
