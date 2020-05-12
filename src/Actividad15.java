/**
 * Crear un vector V numérico de 50 elementos y otro P de 20 elementos.
 * A continuación genera M (50,20) de tal forma que M (i, j) es igual a V (y) * P (j).
 */
public class Actividad15 {

    public static void main(String[] args) {

        int[] myVector50 = new int[50];
        int[] myVector20 = new int[20];

        getRandomVector(myVector50,myVector20);
    }

    public static void showAll(){


    }

    public static void getRandomVector(int[] myVector50, int[] myVector20){


        int M = 50;
        int N = 20;


        for (int i = 0; i < myVector50.length; i++) {
            int valorAleatorio = (int) Math.floor(Math.random() * (N - M + 1) + M);  // Valor entre M y N, ambos incluidos.
            myVector50[i] = valorAleatorio;

        }

        for (int i = 0; i < myVector20.length; i++) {
            int valorAleatorio = (int) Math.floor(Math.random() * (N - M + 1) + M);  // Valor entre M y N, ambos incluidos.
            myVector20[i] = valorAleatorio;

        }
    }
}
