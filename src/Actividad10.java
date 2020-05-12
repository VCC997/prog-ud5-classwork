import java.util.Random;

/**
 * Escribe un programa que genere 50 números aleatorios del 1 al 200 y los guarde en un array.
 * Calcula y imprime la suma de aquellos elementos con contenido par.
 */
public class Actividad10 {

    public static void main(String[] args) {

        int [] matrix = fillRandomArray(1, 200, 50);
        System.out.println("Suma Pares:");
        sumPairElemets(matrix);
        System.out.println("Array sin suma:");
        showAll(matrix);

    }

    public static void showAll(int[] matrix){

        for (int i = 0; i < matrix.length ; i++) {
                System.out.print(matrix[i]+"\t");
        }
        System.out.print("\n"+"\b");
    }

    public static int [] fillRandomArray(int desde, int hasta, int tam){
        int[] numeros = new int[tam];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;
    }
    public static void sumPairElemets(int [] matrix){

        int suma1 =0 ;

        for (int i = 0; i < matrix.length; i++)
        {
            if( matrix[i]%2==0)
            {
                suma1 = suma1 + i;

                System.out.printf("  " + matrix[i] + ","+"\n");
            }
        }
    }
}

