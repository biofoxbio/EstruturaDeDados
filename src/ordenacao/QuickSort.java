package ordenacao;

public class QuickSort {

    public static long quickSort(int vetor[]) {
        long cont = 0;
        cont = quickSort(vetor, 0, vetor.length - 1, cont);
        return cont;

    }

    public static long quickSort(int vetor[], int i, int s, long cont) {
        
        int e = i, d = s;
        int item = vetor[((e + d) / 2)];

        while (e <= d) {
            while (vetor[e] < item) {
                e++;
            }
            while (vetor[d] > item) {
                d--;
            }

            if (e <= d) {
                int aux; //variavel de troca
                aux = vetor[e];

                vetor[e] = vetor[d];
                vetor[d] = aux;
                cont +=1;
                d--;
                e++;

            }

        }

        if (d - i > 0) {
            cont = quickSort(vetor, i, d, cont);

        }
        if (s - e > 0) {
            cont = quickSort(vetor, e, s, cont);

        }
        return cont;
    }

}
