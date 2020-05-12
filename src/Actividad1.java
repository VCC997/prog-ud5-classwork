import java.util.Scanner;
/**
 * Escribe un programa que solicite tres cadenas de caracteres, una que se llame nombre, la otra apellido1 y la otra apellido2. El programa debe crear una cadena con el nombre completo y luego mostrar por pantalla:
 * • El nombre completo con todos los caracteres en minúscula, después en mayúscula y luego su longitud
 * • Los dos primeros caracteres de la cadena (sólo en el caso de que la longitud sea de dos o más caracteres)
 * • Los dos últimos caracteres de la cadena (sólo en el caso de que la longitud sea de dos o más caracteres)
 * • El número de ocurrencias en la cadena del último carácter
 * • La cadena con todas las ocurrencias del primer carácter en mayúscula
 * • La cadena con tres * por delante y por detrás
 * • La cadena invertida
 */
public class Actividad1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre:"+" ");

        String nombre = scanner.next();

        System.out.printf("Ingrese el primer apellido:"+" ");

        String apellido1 = scanner.next();

        System.out.printf("Ingrese el segundo apellido:"+ " ");

        String apellido2 = scanner.next();

        String completo = nombre.concat(apellido1).concat(apellido2);

        System.out.println("Nombre Completo Minúscula:" + " " + completo.toLowerCase());
        System.out.println("Nombre Completo Mayúsculas:" + " " + completo.toUpperCase());
        System.out.println("Nombre Completo Longitud:" + " " + completo.length());

    }

    public static void equalsIgnoreCase(String apellido1,String apellido2){

        if (apellido1.equalsIgnoreCase(apellido2)) {
            System.out.printf("Los apellidos son iguales sin tener en cuenta mayúsculas y minúsculas");
        } else {
            System.out.printf("Los apellidos son distintos sin tener en cuenta mayúsculas y minúsculas");
        }
    }
}
