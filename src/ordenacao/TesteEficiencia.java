package ordenacao;

public class TesteEficiencia {

    public static void main(String[] args) {
        int tam = 10000;
        int vetor[] = new int[tam];
        int vetorBubble[] = new int[tam];
        int vetorSelect[] = new int[tam];
        int vetorInserct[] = new int[tam];
        int vetorQuick[] = new int[tam];

        String tipoSort[] = {"BubbluSort", "SelectSort", "Inserct", "QuickSort"};

        long trocasAleatorias[] = new long[4];
        long trocasOrdenadas[] = new long[4];
        //----------------------------------------
        long inicio[] = new long[4];
        long fim[] = new long[4];
        //----------------------------------------
        long inicioOrde[] = new long[4];
        long fimOrde[] = new long[4];

        for (int i = 0; i < tam; i++) {
            vetor[i] = (int) (Math.random() * 50000);
            vetorBubble[i] = vetor[i];
            vetorSelect[i] = vetor[i];
            vetorInserct[i] = vetor[i];
            vetorQuick[i] = vetor[i];

        }

        inicio[0] = System.currentTimeMillis();
        trocasAleatorias[0] = BubbleSort.bubbleSort(vetorBubble);
        fim[0] = System.currentTimeMillis();
        //---------------------------------------------------
        inicio[1] = System.currentTimeMillis();
        trocasAleatorias[1] = SelectSort.selectSort(vetorSelect);
        fim[1] = System.currentTimeMillis();
        //---------------------------------------------------
        inicio[2] = System.currentTimeMillis();
        trocasAleatorias[2] = InsertSort.insertSort(vetorInserct);
        fim[2] = System.currentTimeMillis();
        //---------------------------------------------------
        inicio[3] = System.currentTimeMillis();
       trocasAleatorias[3] = QuickSort.quickSort(vetorQuick);
        fim[3] = System.currentTimeMillis();
        //==============================================================

        inicioOrde[0] = System.currentTimeMillis();
        trocasOrdenadas[0] = BubbleSort.bubbleSort(vetorBubble);
        fimOrde[0] = System.currentTimeMillis();
        //---------------------------------------------------
        inicioOrde[1] = System.currentTimeMillis();
        trocasOrdenadas[1] = SelectSort.selectSort(vetorSelect);
        fimOrde[1] = System.currentTimeMillis();
        //---------------------------------------------------
        inicioOrde[2] = System.currentTimeMillis();
        trocasOrdenadas[2] = InsertSort.insertSort(vetorInserct);
        fimOrde[2] = System.currentTimeMillis();
        //---------------------------------------------------
        inicioOrde[3] = System.currentTimeMillis();
        trocasOrdenadas[3] = QuickSort.quickSort(vetorQuick);
        fimOrde[3] = System.currentTimeMillis();

        for (int i = 0; i < 4; i++) {
            System.out.println("o tempo no  " + tipoSort[i] + ":\n" + "Aleatorio  "
                    + (fim[i] - inicio[i]) + "  milissegundo\n"
                    + trocasAleatorias[i] + "  troca  " + "ordenado: " + (fimOrde[i] - inicioOrde[i]) + "  milissegundo\n\n" + trocasOrdenadas[i] + " " + " torcas "
            );
        }

        /*
        teste de ordenação
        BubbleSort.bubbleSort(vetorBubble);
        SelectSort.selectSort(vetorSelect);
        InsertSort.insertSort(vetorInserct);
        QuickSort.quickSort(vetorQuick);

       
        Sort.print(vetor);
        Sort.print(vetorBubble);
        Sort.print(vetorSelect);
        Sort.print(vetorInserct);
        Sort.print(vetorQuick);
         */
    }

}
