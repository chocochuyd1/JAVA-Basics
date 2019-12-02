public class ejercicioString2 {
    public static void main(String[] args) {
        String cadena = args[0];
        int i = 0;
        int longitud = cadena.length();
        char letra;
        while (i < longitud) {
            letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I'
                    || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
                System.out.println("Tiene Vocal");
                break;
            } else {
                i++;
            }
        }
    }
}