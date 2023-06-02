/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_luisvarela;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Luis Andres Varela
 */
public class Lab7P1_LuisVarela {

    static Scanner lea = new Scanner(System.in);
    static Random ran = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = true;
        while (salir) {
            System.out.println("\n1.She shoot, she scores!:");
            System.out.println("no termine el 1");
            System.out.println("2.Ejercicio práctico 2 – Pierda, papel o..:");
            System.out.println("3.Salir:");
            int opciones = lea.nextInt();
            switch (opciones) {
                case 1: {
                    int num2 = 0;
                    int num1 = 0;
                    System.out.println("Ingrese un numero:");
                    num1 = lea.nextInt();
                    System.out.println("Ingrese otro numero:");
                    num2 = lea.nextInt();
                    while (num1 * num2 <= 0) {
                        System.out.println("Ingrese numero positivos:");
                        System.out.println("Ingrese un numero:");
                        num1 = lea.nextInt();
                        System.out.println("Ingrese otro numero:");
                        num2 = lea.nextInt();
                    }
                    System.out.println("Ingrese la cantidad de balas:");
                    int balas = lea.nextInt();
                    while (balas <= 0) {
                        System.out.println("Numero no valido:");
                        System.out.println("Ingrese la cantidad de balas:");
                        balas = lea.nextInt();
                    }
                    int[][] matrizz = matrizz(num1, num2);
                    imprimir(num1, num2, matrizz);
                }

                break;
                case 2: {
                    System.out.println("Elija que quiere usar:");
                    System.out.println("1.scissor");
                    System.out.println("2.paper");
                    System.out.println("3.rock");
                    System.out.println("4.lizard");
                    System.out.println("5.spock");
                    int opciones_j = lea.nextInt();
                    switch (opciones_j) {
                        case 1: {
                            int num_b = num_R();
                            switch (num_b - 1) {
                                case 0:
                                    System.out.println("La máquina eligió scissor");
                                    break;
                                case 1:
                                    System.out.println("La máquina eligió paper");
                                    break;
                                case 2:
                                    System.out.println("La máquina eligió rock");
                                    break;
                                case 3:
                                    System.out.println("La máquina eligió lizard");
                                    break;
                                default:
                                    System.out.println("La máquina eligió spock");
                                    break;
                            }
                            matriz(opciones_j, num_b);
                        }
                        break;
                        case 2: {
                            int num_b = num_R();
                            switch (num_b - 1) {
                                case 0:
                                    System.out.println("La máquina eligió scissor");
                                    break;
                                case 1:
                                    System.out.println("La máquina eligió paper");
                                    break;
                                case 2:
                                    System.out.println("La máquina eligió rock");
                                    break;
                                case 3:
                                    System.out.println("La máquina eligió lizard");
                                    break;
                                default:
                                    System.out.println("La máquina eligió spock");
                                    break;
                            }
                            matriz(opciones_j, num_b);
                        }
                        break;
                        case 3: {
                            int num_b = num_R();
                            switch (num_b - 1) {
                                case 0:
                                    System.out.println("La máquina eligió scissor");
                                    break;
                                case 1:
                                    System.out.println("La máquina eligió paper");
                                    break;
                                case 2:
                                    System.out.println("La máquina eligió rock");
                                    break;
                                case 3:
                                    System.out.println("La máquina eligió lizard");
                                    break;
                                default:
                                    System.out.println("La máquina eligió spock");
                                    break;
                            }
                            matriz(opciones_j, num_b);
                        }
                        break;
                        case 4: {
                            int num_b = num_R();
                            switch (num_b - 1) {
                                case 0:
                                    System.out.println("La máquina eligió scissor");
                                    break;
                                case 1:
                                    System.out.println("La máquina eligió paper");
                                    break;
                                case 2:
                                    System.out.println("La máquina eligió rock");
                                    break;
                                case 3:
                                    System.out.println("La máquina eligió lizard");
                                    break;
                                default:
                                    System.out.println("La máquina eligió spock");
                                    break;
                            }
                            matriz(opciones_j, num_b);
                        }
                        break;
                        case 5: {
                            int num_b = num_R();
                            switch (num_b - 1) {
                                case 0:
                                    System.out.println("La máquina eligió scissor");
                                    break;
                                case 1:
                                    System.out.println("La máquina eligió paper");
                                    break;
                                case 2:
                                    System.out.println("La máquina eligió rock");
                                    break;
                                case 3:
                                    System.out.println("La máquina eligió lizard");
                                    break;
                                default:
                                    System.out.println("La máquina eligió spock");
                                    break;
                            }
                            matriz(opciones_j, num_b);
                        }
                        break;
                        default:
                            System.out.println("error");
                    }

                }
                break;
                case 3: {
                    salir = false;
                }
                break;
                default:
                    System.out.println("Error");
            }
        }
        // TODO code application logic here
    }

    public static void matriz(int opciones_j, int num_b) {
        int[][] matriz = {
            {2, 1, 0, 1, 0},
            {0, 2, 1, 0, 1},
            {1, 0, 2, 1, 0},
            {0, 1, 0, 2, 1},
            {1, 0, 1, 0, 2}};
        int resultado = matriz[opciones_j - 1][num_b - 1];
        switch (resultado) {
            case 1:
                System.out.println("¡Jugador Gana!");
                break;
            case 0:
                System.out.println("¡La máquina Gana!");
                break;
            case 2:
                System.out.println("Empate");
                break;
            default:
                break;
        }
    }

    public static int num_R() {
        int num = 0;
        num = ran.nextInt(5) + 1;
        return num;
    }

    public static int[][] matrizz(int n, int m) {
        int num;
        int contador = 0;
        int contador1 = 0;
        int[][] matrizz = new int[n][m];
        boolean salir = true;
        boolean suma = false;
        while (salir) {
            num = ran.nextInt(79) + 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrizz[i][j] == num) {
                        suma = true;
                    }
                }
            }
            if (suma) {
                matrizz[contador][contador1]=num;
                contador1++;
            }
            if(contador1==m){
                contador++;
                contador1=0;
            }
        }

//        for (int a = 1; 1 <= n * m; a++) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    num = ran.nextInt(80 - 1) + 1;
//                    if (matrizz[i][j] != num) {
//                        matrizz[contador1][contador] = num;
//                    }
//                }
//            }
//            if (contador == m - 1) {
//                contador1++;
//                contador = 0;
//            }
//            contador++;
//        }
        return matrizz;
    }

    public static void imprimir(int n, int m, int[][] matrizz) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrizz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
