import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {

        int[] Elements = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {

            Elements[i] = scanner.nextInt();
            System.out.printf(String.valueOf(Elements[i]));
        }
    }
}
