package com.softtek.java.academy.exercises;

import java.util.stream.IntStream;

public class NaturalNumbers {
	static int suma;
	
    public static void main(String[] args) {
    	for (int i = 0; i < 100; i++) {
			if ((i % 3) == 0) {
				suma = suma + i;
				System.out.println(i);
			}if ((i % 5) == 0) {
				suma = suma + i;
				System.out.println(i);
			}
		}
    	System.out.println("La suma de los numeros es " + suma);
    }
}
