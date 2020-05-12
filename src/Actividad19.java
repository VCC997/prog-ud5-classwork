import java.util.Random;
/**
 * Actividad 19
 * Escribe un programa que genere los 6 números aleatorios de la lotería primitiva (del 0 al 49).
 * No puede haber números repetidos, de tal forma que si el ordenador nos da un número que ja tenemos, se debe volver a generar un número aleatorio.
 * Los números deben aparecer ordenados.
 * Utiliza el método binarySearch de la clase java.utils.Arrays
 */

public class Actividad19 {

    public static void main(String[] args) {

        int[]vector50 = getRandomNumber(49);
        int counter = 0;
        showAll(vector50);
    }

    public static int[] getRandomNumber(int size){

        Random randomizer = new Random();
        int[]numberList = new int[size];

        for (int i = 0; i < size ; i++) {
            numberList[i] = randomizer.nextInt(49)+1;
        }
        return new int[]{size};
    }

    public static void showAll(int[] vector50){
        for (int i = 0; i < vector50.length; i++) {
            System.out.printf("%02d"+vector50[i]);
        }
        System.out.printf("\b\n");
    }

    public static void IsEqualsOrNot(int[]vector50, int counter,int rant, int repetido){

        for (int i = 0; i < vector50.length; i++) {
           /* counter = rant.nextInt(49 - 0);*/
           /* if (repetido(vector50, counter) == false) {
                vector50[i] = counter;
            }
        }*/
        }

    /*private static boolean repetido(int[] vector50, int counter) {
      if()
    }*/
  }
}
