package com.crisanto.domain;


import com.crisanto.domain.enumerator.Palo;
import com.crisanto.domain.enumerator.Valor;

import java.util.List;
import java.util.Stack;

/**
 * Created by rocri on 14/05/2017.
 */
public class Carta {
    private Palo palo;
    private String valor;
    private Integer punto;
    private List<Integer> puntos;


    public Carta(Palo palo, String valor, Integer punto, List<Integer> puntos) {
        this.palo = palo;
        this.valor = valor;
        this.punto = punto;
        this.puntos = puntos;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getPunto() {
        return punto;
    }

    public void setPunto(Integer punto) {
        this.punto = punto;
    }

    public List<Integer> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Integer> puntos) {
        this.puntos = puntos;
    }
}
