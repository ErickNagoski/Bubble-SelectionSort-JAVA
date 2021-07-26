/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadores_java.src;

/**
 *
 * @author erick
 */
public class Selection_Sort {

    private int[] array;

    public Selection_Sort(int nValores) {
        long mediaTempo = 0;
        for (int i = 0; i <= 1000; i++) {
            geraArray(nValores);
            mediaTempo = mediaTempo + selectionSort();//Executa 1000 vezes o Bubble sort com N itens
        }
        mediaTempo = mediaTempo / 1000; //média aritmética de tempo dos testes

        System.out.println("Média de tempo de execução Selection Sort : " + nValores + " itens");
        System.out.printf("%.3f ms%n", mediaTempo / 1000d);
    }

    private void geraArray(int tamanho) { //Gera um array de N itens inteiros
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = 1 + (int) (Math.random() * 100);
        }
        this.array = array;
    }

    private long selectionSort() { //Função Selection Sort com retorno do tempo de execução
        long tempoInicio, tempoFinal;
        int vetor[] = this.array;

        tempoInicio = System.currentTimeMillis(); //Começa a contar o tempo de execução

        // armazenam o menor valor e o índice do menor valor
        int menor, indiceMenor;

        for (int i = 0; i < vetor.length - 1; i++) {
            // antes de comparar, considera menor o valor atual do loop
            menor = vetor[i];
            indiceMenor = i;

            // compara com os outros valores do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }

            // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }
        tempoFinal = System.currentTimeMillis();

        long tempoExecucao = tempoFinal - tempoInicio; //Finalisa o tempo de execução

        return tempoExecucao;
    }

    public int[] getArray() {
        return this.array;
    }
}
