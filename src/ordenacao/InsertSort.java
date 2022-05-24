package ordenacao;

public class InsertSort extends Sort {

    public static long insertSort(int vetor[]) {
        int aux;
        int tam = vetor.length;
        int j;
        int cont = 0;

        for (int i = 1; i < tam; i++) {
            aux = vetor[i];
            j = i - 1;

            while (j >= 0 && aux < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j--;
                
            }
             if(vetor[j + 1] != aux){
                 cont += 1;
             }
            vetor[j + 1] = aux;
           

        }
        return cont;
    }

}
