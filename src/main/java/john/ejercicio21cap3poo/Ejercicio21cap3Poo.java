/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio21cap3poo;

import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio21cap3Poo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.println("Programa para el calculo de perimetro, semiperimetro y area de un triangulo");
	System.out.println("Ingrese el lado 1: ");
	double lado1 = in.nextDouble();
	System.out.println("Ingrese el lado 2: ");
	double lado2 = in.nextDouble();
	System.out.println("Ingrese el lado 3: ");
	double lado3 = in.nextDouble();

	double perimetro = lado1 + lado2 + lado3;
	System.out.println("Perimetro: " + perimetro);

	double semiP = (perimetro) / 2;
	System.out.println("Semiperimetro: " + semiP);

	double area = Math.sqrt((semiP * (semiP - lado1) * (semiP - lado2) * (semiP - lado3)));
	System.out.println("Area: " + area);
    }
}
