public class Actividad14 {

    public static void main(String[] args, int sumCollumn, int averageCollumn) {

        int [][] matrix = {{5,6,7,3,1},
                        {8,9,6,2,1},
                        {1,9,31,7,21},
                        {4,2,5,12,11},
                        {44,17,13,21,20}
        };

        showAll(matrix);
        int[][] matrix7x7 = createNew7x7(matrix);
        showAll(matrix7x7);
        /* fillSumCollumn(matrix7x7, 5);*/
       /* fillAverageCollumn(matrix7x7, sumCollumn, averageCollumn);*/
    }

    public static void showAll(int[][] matrix){

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {

                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n"+"\b");
        }
    }

    public static int[][] createNew7x7 (int[][] matrix){

        int[][]matrix7x7 =new int[matrix.length][7];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < 5 ; j++) {
                matrix7x7[i][j] =matrix[i][j];

            }
        }

       return matrix7x7;


    }

    /*public static void fillSumCollumn(int[][]matrix ,int sumCollumn ){

        for (int i = 0; i < matrix.length ; i++) {
            int totalCollumn =0;

            if (j < sumCollumn){
                totalCollumn+= matrix[i][j];
            }else if(j == sumCollumn){
                matrix[i][j] = totalCollumn;
            }
        }


    }*/

    /*public static void fillAverageCollumn(int[][] matrix, int averageCollumn, int sumCollumn){


        for (int i = 0; i < matrix.length ; i++) {
            for
            int totalCollum=0;
            if (i < sumCollumn){
                totalCollum+= matrix[i][j];
            }else if(i == sumCollumn){
                matrix[i][j] = totalCollum / (averageCollumn - 1);
            }
        }
    }*/

}
