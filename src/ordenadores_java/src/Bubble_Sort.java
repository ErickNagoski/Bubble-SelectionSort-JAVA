package ordenadores_java.src;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author erick
 */
public class Bubble_Sort {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(reader);
    private int[] array;

    public Bubble_Sort(int nValores) {
        long mediaTempo = 0;
        
        for (int i = 0; i <= 1000; i++) {  //Executa 1000 vezes o Bubble sort com N itens
            geraArray(nValores);
            mediaTempo = mediaTempo + bubble(); //A cada iteração, chama o bubble sort com um novo array de N itens gerado e guarda o tempo de execução 
        }
        mediaTempo = mediaTempo/1000; //média aritmética de tempo dos testes
        
        System.out.println("Média de tempo de execução Bubble Sort : "+nValores+" itens");
        System.out.printf("%.3f ms%n",mediaTempo/1000d);
    }
   
    private void geraArray(int tamanho){ //Gera um array de N itens inteiros
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
           array[i] = 1 + (int) (Math.random() * 100);
        };
        this.array = array;
    }
        
    private long bubble(){ //Função Bubble Sort com retorno do tempo de execução
        long tempoInicio, tempoFinal;
        int[] array = this.array;
               
        boolean ordenado = false;
        
        tempoInicio = System.currentTimeMillis(); //Começa a contar o tempo de execução
        
        while(!ordenado) {  //Se o array não estiver ordenado
            ordenado = true;
            for (int pos = 0; pos < (array.length -1); pos++) {
                //Compara a dupla de itens
                if(array[pos]>array[pos+1]){
                    // Em caso de verdadeiro, troca os valores de posição
                    int aux = array[pos];
                    array[pos]=array[pos+1];
                    array[pos+1]=aux;
                    ordenado = false;
                };
            };
        };
        tempoFinal = System.currentTimeMillis();
        
        long tempoExecucao = tempoFinal-tempoInicio; //Finalisa o tempo de execução
        
        return tempoExecucao;
    }
    
    public int[] getArray(){
        return this.array;
    }
}
