package exercicio01;

import java.util.Set;
import java.util.TreeSet;

public class Fibonacci {

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */
    public int[] getSequenciaFibonacciDe(int tamanho) {
        if(tamanho<=0){
            int[] lista = null;
            return lista;
        }
        int[] lista = new int[tamanho];
        lista[0]=1;
        if(tamanho==1){
            return lista;
        }
        lista[1]=2;
        if (tamanho==2){
            return lista;
        }
        for (int i=2;i<tamanho;i++){
            lista[i]=lista[i-1]+lista[i-2];
        }
        return lista;
    }
}
