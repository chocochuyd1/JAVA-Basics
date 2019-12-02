package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class ShouldIDoItAgain {
	static String respuesta;
	public static void main(String[] args) {
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa 2 numeros");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();

		System.out.println("la suma de " + firstNumber + " + " + secondNumber + " es: " + (firstNumber + secondNumber));
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Deseas Realizar otra Operacion? (si/no)");
		respuesta = scanner2.nextLine();
		}
		while (respuesta.equals("si") || respuesta.equals("SI"));
		}
}
