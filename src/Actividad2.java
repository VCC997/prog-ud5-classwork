import java.util.Scanner;
/**
 * Escribe un método que, dado un string,
 * Devuelva otro objeto string en el que se cambian todas las vocales minúsculas del original por la letra 'a'.
 * Escribe un programa que permita comprobar el funcionamiento.
 */
public class Actividad2 {

    public static void main(String[] args) {

        System.out.println("Escribe una frase:"+"\n");
        Scanner scanner = new Scanner(System.in);
        String cadena1 = scanner.nextLine();

        System.out.printf("Sin cambio de vocales minúsculas:"+"\t"+" ");
        System.out.println(cadena1);

        changeVowel(cadena1);

    }
    public static void changeVowel(String cadena1){

        cadena1 = cadena1.replace('e','a').replace('i','a')
                .replace('o','a').replace('u','a');

        System.out.printf("Con cambio de vocales minúsculas:"+"\t"+" ");
        System.out.println(cadena1);
    }
}
