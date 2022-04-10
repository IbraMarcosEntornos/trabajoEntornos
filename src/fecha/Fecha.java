/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fecha;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Fecha {

    //Dejo el scanner aqui para no instanciarlo durante todo el programa
    static Scanner entrada = new Scanner(System.in);

    public static double anioAhora() { //Pide el año actual y valida que solo se introduzca el 2022
        int anioHoy = 0;
        do {
            System.out.print("Escribe el año actual:");
            anioHoy = entrada.nextInt();
        } while (anioHoy != 2022);
        return anioHoy; //Mando al main el año
    }

    public static String mesActual() {//Pide el mes actual y con switch paso el numero a letra y lo envio en el return
        int mesHoy = 0;
        String mesLetra = "";
        boolean salida=false;

        do {
            System.out.print("Escribe el mes en numero:");
            mesHoy = entrada.nextInt();
            if (mesHoy > 1 || mesHoy < 12) {
                salida = true;
            } else {
                System.out.println("Introduzca un mes valido");
            }
        } while (salida==false);
        switch (mesHoy) {
            case 1:
                mesLetra = "Enero";
                break;
            case 2:
                mesLetra = "Febrero";
                break;
            case 3:
                mesLetra = "Marzo";
                break;
            case 4:
                mesLetra = "Abril";
                break;
            case 5:
                mesLetra = "Mayo";
                break;
            case 6:
                mesLetra = "Junio";
                break;
            case 7:
                mesLetra = "Julio";
                break;
            case 8:
                mesLetra = "Agosto";
                break;
            case 9:
                mesLetra = "Septiembre";
                break;
            case 10:
                mesLetra = "Octubre";
                break;
            case 11:
                mesLetra = "Noviembre";
                break;
            case 12:
                mesLetra = "Diciembre";
                break;
        }

        return mesLetra;
    }

    public static int diaActual() { //Pido el dia actual y valido que se encuentre entre 1 y 31 dias
        int diaHoy = 0;
        do {
            System.out.print("Escribe el dia actual:");
            diaHoy = entrada.nextInt();
        } while ((diaHoy < 1) || (diaHoy > 31));
        return diaHoy;
    }

    public static void main(String[] args) {//recupero los datos y los printeo
        double anioHoy;
        String mesHoy;
        int diaHoy;
        anioHoy = anioAhora();
        mesHoy = mesActual();
        diaHoy = diaActual();
        System.out.println("Hoy es: " + diaHoy + " de " + mesHoy + " de " + anioHoy);
    }
}
