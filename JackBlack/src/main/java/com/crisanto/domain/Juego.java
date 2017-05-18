package com.crisanto.domain;

import com.crisanto.domain.enumerator.Palo;
import com.crisanto.domain.enumerator.Valor;
import com.crisanto.utils.Utilerias;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rocri on 14/05/2017.
 */
public class Juego {
    private Crupier crupier;
    private Apostador apostador;
    private Stack<Carta> mazo;
    private Carta[] cartas;

    public Crupier getCrupier() {
        return crupier;
    }

    public void setCrupier(Crupier crupier) {
        this.crupier = crupier;
    }

    public Apostador getApostador() {
        return apostador;
    }

    public void setApostador(Apostador apostador) {
        this.apostador = apostador;
    }

    public Stack<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(Stack<Carta> mazo) {
        this.mazo = mazo;
    }

    public void iniciar(){
        Scanner teclado = new Scanner (System.in);
        Scanner apuesta = new Scanner (System.in);

        System.out.println("**************************************************************************************************************");
        System.out.println("Bienvenido al Casino ROIAN");
        System.out.println("**************************************************************************************************************");
        System.out.println("Para iniciar presione cualquier tecla");
        Scanner sc = new Scanner(System.in);

        Utilerias.clearScreen();

        inicializarCarta();
        barajar();
        crupier = new Crupier();
        apostador = new Apostador();

        System.out.println("**************************************************************************************************************");
        System.out.println(" Se va a inicializar la " +"primera"+ " ronda");
        System.out.println(" Teclea tu apuesta ");
        apostador.setApuesta(apuesta.nextInt());
        System.out.println("**************************************************************************************************************");
        Utilerias.clearScreen();


        apostador.recibirCarta(mazo.pop());
        crupier.recibirCarta(mazo.pop());

        apostador.recibirCarta(mazo.pop());

        mostrarEstado();
        sc.nextLine();



        int opcion = 0;
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1.-Plantarse");
            System.out.println("2.-Pedir carta");

            opcion = teclado.nextInt();
            Utilerias.clearScreen();

            if(opcion != 2 && opcion != 1){
                System.out.println("Opción Incorrecta");
            }
            else{
                if(opcion ==2){
                apostador.recibirCarta(mazo.pop());
                mostrarEstado();
                sc.nextLine();
                }
                if(opcion == 1){
                    apostador.setPlantado(true);
                }
            }


        }
        while(opcion == 2 );

        do {
            crupier.recibirCarta(mazo.pop());
            mostrarEstado();
            sc.nextLine();
        }while(crupier.getSumaPuntos() <=16);
        conocerGanador(crupier,apostador);

    }



    private void inicializarCarta(){
        cartas = new Carta[52];
        int contador = 0;
        for(Palo palo : Palo.values()){
                for(Valor valor : Valor.values()){
                    cartas[contador] = new Carta(palo,valor.getValor(),valor.getPunto(),valor.getPuntos());
                    contador ++;
                }
            }
    }

    public void barajar()
    {
        Random numerosAleatorios = new Random();
        mazo = new Stack<Carta>();



        for ( int primera = 0; primera < cartas.length; primera++ )
        {
            int segunda = numerosAleatorios.nextInt(52);

            Carta temp = cartas[primera];

            cartas[primera] = cartas[segunda];
            cartas[segunda] = temp;
            mazo.push(cartas[primera]);

        }
    }

    private void conocerGanador(Crupier crupier, Apostador apostador){



        if(apostador.getSumaPuntos() <= 21 && crupier.getSumaPuntos() < apostador.getSumaPuntos() || crupier.getSumaPuntos()>21){
            System.out.println(" Felicidades has ganado " + apostador.getApuesta()*1.5);
        }
        else if(crupier.getSumaPuntos() == apostador.getSumaPuntos()){
            System.out.println(" Has empatado con el Crupier" );
        }
        else{
            System.out.println(" Jaaaaaaaa haaaaa has perdido ");

        }

    }

    private void mostrarEstado(){
        System.out.println("**************************************************************************************************************");
        System.out.println("Tus Cartas son:");
        apostador.mostrarCarta();
        if(!apostador.isPlantado()){
        apostador.sumarPuntos();
        }
        System.out.println("puntos :" + apostador.getSumaPuntos());
        System.out.println("**************************************************************************************************************");
        System.out.println("Las Cartas del Crupier son:");
        crupier.mostrarCarta();
        crupier.sumarPuntos();

    }
}
