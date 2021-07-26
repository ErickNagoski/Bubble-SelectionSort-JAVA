package ordenadores_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ordenadores_java.src.Bubble_Sort;
import ordenadores_java.src.Selection_Sort;

/**
 *
 * @author erick
 */
public class Ordenadores_JAVA {

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i+",");
        }
    }
    
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        int metodo = 0;
        boolean executa = true;

        while (executa) {

            System.out.println("Qual método você deseja utilizar?");
            System.out.println("1 - Bubble sort | 2 - Selection Sort");

            metodo = Integer.parseInt(br.readLine());

            switch (metodo) {
                case 1: {
                    System.out.println("Informe o número de valores");
                    int nValores = Integer.parseInt(br.readLine());
                    System.out.println("Aguarde o resultado");
                    Bubble_Sort bubble = new Bubble_Sort(nValores);
                    
                    System.out.println("Deseja visualizar o array? [S][N]");
                    String opcao = br.readLine();
                    if (opcao.equalsIgnoreCase("s")) {
                        printArray(bubble.getArray());
                    }
                    
                    System.out.println("\nDeseja executar novamente? [S][N]");
                    opcao = br.readLine();
                    if (opcao.equalsIgnoreCase("n")) {
                        executa = false;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Informe o número de valores");
                    int nValores = Integer.parseInt(br.readLine());
                    System.out.println("Aguarde o resultado");
                    Selection_Sort selection = new Selection_Sort(nValores);

                    System.out.println("Deseja visualizar o array? [S][N]");
                    String opcao = br.readLine();
                    if (opcao.equalsIgnoreCase("s")) {
                        printArray(selection.getArray());
                    }
                    
                    System.out.println("\nDeseja executar novamente? [S][N]");
                    opcao = br.readLine();
                    if (opcao.equalsIgnoreCase("n")) {
                        executa = false;
                    }
                    break;
                }
                default: {
                    System.out.println("Opção Inválida");
                }

            }
        }
    }
    
    
}
