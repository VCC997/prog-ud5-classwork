import java.util.Random;

public class Actividad17 {

    public static void main(String[] args) {


        int[] numberList1 = getRandomNumberList(50);
        showAll(numberList1);
        System.out.println("Ordeno intercambio");
        orderBySwap(numberList1);
        showAll(numberList1);

        int[] numberList2 = getRandomNumberList(50);
        showAll(numberList2);
        System.out.println("Ordeno posicionamiento");
        orderBySelection(numberList2);
        showAll(numberList2);
    }

    public static void showAll(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%02d"+numbers[i]);
        }
        System.out.printf("\b\n");
    }

    public static int[] getRandomNumberList(int size){

        Random randomizer = new Random();

        int[]numberList = new int[size];

        for (int i = 0; i < size ; i++) {
            numberList[i] = randomizer.nextInt(200)+1;
        }
        return new int[]{size};
    }

    public static void orderBySwap(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <  numbers.length; j++) {

                if (numbers[i] > numbers [j]){
                   swap(numbers, i ,j);
                }
            }
        }
    }

    private static void orderBySelection(int[] numbers) {

        for (int i =0; i <numbers.length; i++){

            int feverPosition = i;

            for (int j = i+1; j <numbers[feverPosition] ; j++) {

                if (numbers[j] <numbers[feverPosition]){
                    feverPosition = j;
                }

                if (i != feverPosition){
                    swap(numbers, i, feverPosition);
                }
            }
        }
    }

    private static void swap(int[] numbers, int element1, int element2) {

        int aux = numbers[element1];
        numbers[element1]= numbers[element2];
        numbers[element2]= aux;
    }
}
