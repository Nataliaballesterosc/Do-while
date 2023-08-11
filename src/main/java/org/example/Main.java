package org.example;

import java.util.Random;
import java.util.Scanner;

// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       Scanner digita = new Scanner(System.in);
        Random aleatorio = new Random();

        Boolean esAdmin;
        Double tarifaEnergia = 0.0;
        Integer opcion;
        final String contrasena = "admin123*";
        String respuestaPerfil;
        String contrasenaAdmin;


        System.out.println("---------Bienvenido---------");
        System.out.println("----------------------------");
        System.out.print("Eres administrador: ");
        respuestaPerfil =digita.nextLine();

        //Proceso

        if (respuestaPerfil.equalsIgnoreCase("si")){

            //PERFIL ADMINISTRADOR (intentos solo 3)

            Integer intentos = 0;
            System.out.print("Digite su contraseña: ");

            do {
                contrasenaAdmin = digita.nextLine();

                if (contrasenaAdmin.equals(contrasena)){
                    System.out.println("Digite el valor de kw por hora: ");
                    tarifaEnergia = digita.nextDouble();
                    intentos = 3;
                }else {
                    System.out.print("vuelva a ingresar su contraseña");
                    intentos = intentos+1;
                }
            }while (intentos<3 );


            // Generando los datos para el consumo de 30 dias y los picos mayores de 300 en esos dias

            Integer calcularKwDias = 0;                 /* contadores  */
            Integer picoEnergia = 0;
            Integer numeroAleatorio =0;
            Integer sumadias = 0;

            do {
                calcularKwDias = calcularKwDias + 1;
                numeroAleatorio = aleatorio.nextInt(401);
                sumadias = sumadias + numeroAleatorio;

                if (numeroAleatorio>300){
                    picoEnergia = picoEnergia + 1;

                }else {

                }

            }while (calcularKwDias < 30);


            System.out.println("Bienvenido a menú empresa: ");
            System.out.println("--------------------------");
            System.out.println("1----Ver tarifa");
            System.out.println("2----Mostrar consumo promedio");
            System.out.println("3----Mostrar picos de consumo");
            System.out.println("4----Mostrar factura");
            System.out.println("5----Salir");

            do {
                System.out.println("Apreciado cliente, digita una opcion");
                opcion = digita.nextInt();

            }while (opcion != 5);

            switch  (opcion){

                case 1:
                    System.out.print("Su tarifa es: " +tarifaEnergia);
                break;

                case 2:
                    System.out.print("Promedio por dia es: " + sumadias/30+ "kw" );
                break;

                case 3:
                    System.out.print("Sus picos en este mes fueron: " +picoEnergia);
                 break;

                case 4:
                    System.out.print("El valor de su factura es $" +sumadias*tarifaEnergia);
                 break;

                case 5:
                    System.out.print("Salir");
                 break;

                default:
                System.out.println("eso no vayase para otro lado");
            }

        }else {

        }








    }
}