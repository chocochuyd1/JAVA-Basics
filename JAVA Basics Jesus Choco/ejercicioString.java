import java.util.Scanner;

public class ejercicioString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cualquier texto");
        String textoIngresado = scanner.nextLine();
        if (textoIngresado.length() == 0) {
            System.out.println("\"\"");
            System.out.println("Debes ingresar texto");
            main(args);
        } else {
            if (textoIngresado.length() < 2) {
                String primerasLetras = textoIngresado.substring(0, 1);
                System.out.println(primerasLetras);
            } else {
                System.out.println("los primeros 2 caracteres de tu texto son");
                String primerasLetras = textoIngresado.substring(0, 2);
                System.out.println(primerasLetras);
            }
        }
    }

}