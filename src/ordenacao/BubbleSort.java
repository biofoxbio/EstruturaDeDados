package ordenacao;

public class BubbleSort extends Sort {

    public static long bubbleSort(int vetor[]) {
        int aux;
        int tam = vetor.length;
        int cont = 0;

        for (int i = 0; i < tam - 1; i++) {
            
            for (int j = 0; j < tam - 1 - i; j++) { 
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    
                    cont += 1;
                }
            }
        }
        return cont;
    }

}
