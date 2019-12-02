import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 2 numeros");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("la suma de " + firstNumber + " + " + secondNumber + " es: " + (firstNumber + secondNumber));
        System.out
                .println("la resta de " + firstNumber + " - " + secondNumber + " es: " + (firstNumber - secondNumber));
        System.out.println(
                "la multiplicacion de " + firstNumber + " x " + secondNumber + " es: " + (firstNumber * secondNumber));
        System.out.println("la division de " + firstNumber + " / " + secondNumber + " es: "
                + (Float.intBitsToFloat(firstNumber) / Float.intBitsToFloat(secondNumber)));

    }

}