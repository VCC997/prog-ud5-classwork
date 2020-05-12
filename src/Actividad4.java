import java.io.IOException;
import java.util.Scanner;

/**
 * Escribir un método que, dada una cadena de caracteres, cuente cuántas veces aparece en un texto.
 * Por ejemplo, para la cadena "En un lugar de la mancha, de cuyo nombre no quiero acordarme",
 * si se cuenta cuántas veces aparece "o",
 * o dicho de otra forma, cuántas palabras terminan en o, debería indicar que son 3.
 */
public class Actividad4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text= " ";
        String character = " ";
        int times = 0;

        do {
            System.out.println("Introduce texto: ");
            text = sc.nextLine();
        } while (text.isEmpty());
        System.out.print("Introduce un carácter: ");
        character =sc.nextLine();
        String.valueOf(character);
        times = characterCounter(text, character);
        System.out.println("El caracter " + character + " aparece " + times + " veces");
    }

    public static int characterCounter(String cadena, String caracter) {
        int position;
        int counter = 0;

        position = cadena.indexOf(caracter);
        while (position != -1) {
            counter++;

            position = cadena.indexOf(caracter, position + 1);
        }
        return counter;
    }
}
