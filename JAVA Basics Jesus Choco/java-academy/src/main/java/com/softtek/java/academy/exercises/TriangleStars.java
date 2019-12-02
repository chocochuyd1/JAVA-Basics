package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class TriangleStars {
	public static void main(String[] args) {
		System.out.println("Ingresa el tamano de tu Triangulo");
		Scanner scanner = new Scanner(System.in);
		int tamano = scanner.nextInt();
		for (int i = 0; i < tamano; i++) {
			System.out.println("");
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		}
	}
}
