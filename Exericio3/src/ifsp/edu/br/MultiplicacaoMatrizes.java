package ifsp.edu.br;

import java.util.Arrays;
import java.util.stream.IntStream;


public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrizB = {
            {5, 6},
            {7, 8}
        };

        int[][] resultado = multiplicarMatrizes(matrizA, matrizB);
        System.out.println("Resultado da multiplicação:");
        for (int[] linha : resultado) {
            System.out.println(Arrays.toString(linha));
        }
    }

    public static int[][] multiplicarMatrizes(int[][] A, int[][] B) {
        int linhasA = A.length;
        int colunasA = A[0].length;
        int colunasB = B[0].length;

        if (colunasA != B.length) {
            throw new IllegalArgumentException("Número de colunas de A deve ser igual ao número de linhas de B.");
        }

        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                resultado[i][j] = IntStream.range(0, colunasA)
                                            .map(k -> A[i][k] * B[k][j])
                                            .sum();
            }
        }
        return resultado;
    }
}
