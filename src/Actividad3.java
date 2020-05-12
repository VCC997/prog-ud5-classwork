import java.util.Scanner;

/**
 * Escribe un método que, dada una cadena de caracteres, devuelva la mitad inicial de la cadena.
 * Escribe un programa que pruebe el método con las cadenas "Hola que tal" y "Adiós".
 */
public class Actividad3 {

    public static void main(String[] args) {

        System.out.printf("Cadena original:");
        Scanner scanner = new Scanner(System.in);
        String cadena1 = scanner.nextLine();
        System.out.println(cadena1);
        int endIndex = 0;
        int beginIndex = 0;
        substring(cadena1, beginIndex, endIndex);


    }
    public static void substring(String cadena1,int beginIndex, int endIndex){
        String sSubCadena = cadena1.substring(2,4);
        System.out.println(sSubCadena);
    }
}
