package az.edu.turing.module01.lesson04;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[][] matris = {
                {10, 25, 3},
                {8, 50, 14},
                {7, 8, 90}
        };
        int max = matris[0][0];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j] > max) {
                    max = matris[i][j];
                }

            }

        }
        System.out.println("matrisde en boyuk eded:" + max);
    }


}

