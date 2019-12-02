public class Ejercicios{
    public static void main(String[] args) {
        int MyVar = Integer.parseInt(args[0]);
        if ((MyVar % 2) == 0) {
        System.out.println(args[0] + "  is an EVEN NUMBER");
        } else{
            System.out.println(args[0] + "  is an ODD NUMBER");
        }
    }    
}