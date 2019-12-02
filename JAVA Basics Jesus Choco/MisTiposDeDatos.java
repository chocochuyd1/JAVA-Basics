public class MisTiposDeDatos {

    public static void main(String[] args) {
        // Tipos de Datos 
        int edad = 25;
        short peso = 90;
        String nombre = "JAVA PROGRAMMING";
        float valorR = 12.5f;
        boolean esVIP = false;
        boolean tieneCredencial = false;

        boolean puedeVotar = ((edad > 18) && tieneCredencial);

        System.out.println("Bienvenido a: " + nombre);
        System.out.println("Tu Edad es : " + edad);
        System.out.println("Tu numero Flotante : " + precio);
        if (esVIP) {
            System.out.println("Eres usuario VIP");
        } else {
            System.out.println("No eres usuario VIP");
        }
        if (tieneCredencial) {
            System.out.println("Tienes Credencial");
            } else {
                System.out.println("No tienes credencial");
            }
        if (puedeVotar) {
            System.out.println("Puedes votar");
            } else {
                System.out.print("No puedes votar porque: ");
                if (!tieneCredencial) {
                        System.out.println("No tienes credencial");
                    }
                if (edad < 18) {
                        System.out.println("Eres menor de 18" + "(" + edad + ")");
                    }
            }
    }
}