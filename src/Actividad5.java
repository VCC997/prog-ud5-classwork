import java.util.Scanner;

/**
 * Queremos calcular el lucky number (Número de la suerte) de una persona a partir de su fecha de nacimiento.
 * El número de la suerte se calcula reduciendo la fecha de nacimiento a un número de un único dígito.
 * Ejemplo: la fecha de nacimiento de una persona es la siguiente: 16-08-1973.
 * Si sumamos 1 + 6 + 0 + 8 + 1 + 9 + 7 + 3, el resultado es 35.
 * A continuación debemos sumar 3 + 5. Su número de la suerte es 8.
 * La fecha de nacimiento será tratada como un string, Con el formato dd-mm-aaaa, y será introducida por el usuario.
 * El número de la suerte será devuelto como un int.
 * Si necesitas convertir un carácter a int,
 * La clase Character dispone de un método llamado getNumericValue ()que realiza la conversión.
 */
public class Actividad5 {

    public static void main(String[] args) {

        int luckyNumber=0;

        System.out.println("Pon tu fecha de nacimiento day/Month/year en este formato:");

        Scanner input=new Scanner(System.in);
        String fechaCumple=input.nextLine();

        for(int i=0;i<fechaCumple.length();i++){

            if(fechaCumple.charAt(i)!='/'){
                luckyNumber=luckyNumber+Integer.parseInt(String.valueOf(fechaCumple.charAt(i)));
            }
        }

        System.out.println("Lucky Number: "+getOneDigit(luckyNumber));

    }

    public static int getOneDigit(Integer number){

        int result=number;

        while(number.toString().length()>1){
            result=0;

            for(int i=0;i<number.toString().length();i++){

                result=result+Integer.parseInt(String.valueOf(number.toString().charAt(i)));
            }
            number=result;
        }
        return result;
    }

}
