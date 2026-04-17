package Capitulos.capitulo_02;

import java.util.Arrays;

public class OrdenacaoPorSelecao {
    
    public static void main(String[] args) {
    int[] numeros = {1, 4, 6, 3, 2, 10, 69, 21, 45};
    
    OrdenacaoPorSelecao op = new OrdenacaoPorSelecao();
    
    int[] ArrayOrdenada = op.ordenar(numeros);
    
    System.out.println("Array Ordenada: " + Arrays.toString(ArrayOrdenada));
    }

    public int[] ordenar(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            
            
            int indiceMenor = encontrarIndiceMenor(numeros, i); // Chamada  do for interno | O i passa ser o menor, se não percorreria os elementos já ordenados novamente.

            // Troca para ordenação
            int temp = numeros[i];
            numeros[i] = numeros[indiceMenor];
            numeros[indiceMenor] = temp;
        }
        return numeros; 
    }
    // for interno
    private int encontrarIndiceMenor(int[] numeros, int inicio) { // inicio = posicão do i no for do ordernar
        int menor = inicio; 
        for (int j = inicio; j < numeros.length; j++) {
            if (numeros[j] < numeros[menor]) {
                menor = j;
            }
        }
        return menor;
    }
}