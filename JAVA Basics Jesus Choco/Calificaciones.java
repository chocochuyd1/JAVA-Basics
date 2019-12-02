import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la Calificacion (1 - 10)");
        int calificacion = scanner.nextInt();
        if (calificacion >= 1 && calificacion <= 4) {
            i = 1;
        }
        if (calificacion == 5) {
            i = 2;
        }
        if (calificacion == 6) {
            i = 3;
        }
        if (calificacion == 7 || calificacion == 8) {
            i = 4;
        }
        if (calificacion == 9 || calificacion == 10) {
            i = 5;
        }

        switch (i) {
        case 1:
            System.out.println("Suspenso");
            break;
        case 2:
            System.out.println("Aprobado");
            break;
        case 3:
            System.out.println("Bien");
            break;
        case 4:
            System.out.println("Notable");
            break;
        case 5:
            System.out.println("Sobresaliente");
            break;
        default:
            System.out.println("Debes ingresar un valor valido (1 - 10)");
            break;
        }

    }

}