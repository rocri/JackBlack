package com.crisanto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rocri on 14/05/2017.
 */
public class Apostador {
    private List<Carta> cartas;
    private Integer apuesta;
    private Integer sumaPuntos;
    private boolean plantado;

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Integer getApuesta() {
        return apuesta;
    }

    public void setApuesta(Integer apuesta) {
        this.apuesta = apuesta;
    }

    public Integer getSumaPuntos() {
        return sumaPuntos;
    }

    public void setSumaPuntos(Integer sumaPuntos) {
        this.sumaPuntos = sumaPuntos;
    }

    public boolean isPlantado() {
        return plantado;
    }

    public void setPlantado(boolean plantado) {
        this.plantado = plantado;
    }

    public void addCarta(Carta carta){
        if(cartas ==null){
            cartas = new ArrayList<>();
        }
        cartas.add(carta);
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
        Scanner teclado = new Scanner (System.in);

        for(Carta carta : cartas){
            if (carta.getPuntos() == null || carta.getPuntos().isEmpty()){
            sumaPuntos += carta.getPunto();
            }else{
                System.out.println("Que valor quiere para el AS: ");
                for(Integer punto : carta.getPuntos()){
                    System.out.println(punto);
                }
                sumaPuntos += teclado.nextInt();
            }
        }
    }

    public void doblar(){
        apuesta *= 2;
    }



}
