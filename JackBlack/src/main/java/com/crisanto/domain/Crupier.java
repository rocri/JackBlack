package com.crisanto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rocri on 14/05/2017.
 */
public class Crupier {
    private List<Carta> cartas;
    private Integer sumaPuntos;


    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Integer getSumaPuntos() {
        return sumaPuntos;
    }

    public void setSumaPuntos(Integer sumaPuntos) {
        this.sumaPuntos = sumaPuntos;
    }

    public void cerrarRondaDeApuetas() {
        System.out.println("No va mas");
    }


    public void recibirCarta(Carta carta) {
        if(cartas == null){
            cartas = new ArrayList<>();
        }
        cartas.add(carta);
    }

    public void mostrarCarta(){
        cartas.stream().forEach(carta -> {
            System.out.println(carta.getValor() + " DE " + carta.getPalo());
        });

    }

    public void sumarPuntos(){
        sumaPuntos = 0;

        for(Carta carta : cartas){
            if (carta.getPuntos() == null || carta.getPuntos().isEmpty()){
                sumaPuntos += carta.getPunto();
            }else{
                sumaPuntos +=11;
                if(sumaPuntos > 21){
                    sumaPuntos -= 11;
                    sumaPuntos +=1;
                }
            }
        }
        System.out.println("puntos :" + sumaPuntos);
    }

}
