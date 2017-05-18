package com.crisanto.domain;

import com.crisanto.domain.enumerator.NumeroRonda;

import java.util.List;

/**
 * Created by rocri on 14/05/2017.
 */
public class Ronda {
    private NumeroRonda numeroRonda;
    private List<Apostador> apostadores;
    private Crupier crupier;

    public NumeroRonda getNumeroRonda() {
        return numeroRonda;
    }

    public void setNumeroRonda(NumeroRonda numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public List<Apostador> getApostadores() {
        return apostadores;
    }

    public void setApostadores(List<Apostador> apostadores) {
        this.apostadores = apostadores;
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public void setCrupier(Crupier crupier) {
        this.crupier = crupier;
    }

}
