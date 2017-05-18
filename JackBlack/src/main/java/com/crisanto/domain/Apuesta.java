package com.crisanto.domain;

/**
 * Created by rocri on 14/05/2017.
 */
public class Apuesta {

    private Integer apuestaInicial;
    private Integer apuestaActual;
    private Integer sumaApuesta;

    public Integer getApuestaInicial() {
        return apuestaInicial;
    }

    public void setApuestaInicial(Integer apuestaInicial) {
        this.apuestaInicial = apuestaInicial;
    }

    public Integer getApuestaActual() {
        return apuestaActual;
    }

    public void setApuestaActual(Integer apuestaActual) {
        this.apuestaActual = apuestaActual;
    }

    public Integer getSumaApuesta() {
        return sumaApuesta;
    }

    public void setSumaApuesta(Integer sumaApuesta) {
        this.sumaApuesta = sumaApuesta;
    }
}
