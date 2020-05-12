import java.util.Scanner;

public class Actividad8 {

    public static void main(String[] args) {

        char[] charList = new char[10];

        String c = String.valueOf(' ');

        System.out.printf("Muestra array alfanúmerico los que sean par. ");

    }
        public static char[] oddMethod(char[] charList, char c){
            Scanner scanner = new Scanner(System.in);
             if(c<charList.length) {

                 if(charList[c]%2==0) {

                 System.out.println("El valor " +charList[c]+" es par"); }
             }
                return charList;
        }

        public static char[] evenMethod(char[] charList, char c){
            Scanner scanner = new Scanner(System.in);
                 if(c<charList.length) {
                     if(charList[c]%2!=0) {
                    System.out.println("El valor "+charList[c]+" es impar");
                 }
             }
                 return charList;
        }
}






