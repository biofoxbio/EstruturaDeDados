
package ordenacao;


public class TesteOrdenacao {
    
    public static void main(String[] args) {
        int vetor[] = {86, 54, 5, 89, 64, 55, 10};
        
        BubbleSort b = new BubbleSort();
        SelectSort s = new SelectSort();
        InsertSort i = new InsertSort();
        OrdenacaoNomes n = new OrdenacaoNomes();
        b.bubbleSort(vetor);
        i.insertSort(vetor);
        s.selectSort(vetor);
        n.ordenacaoNomes(vetor);
        b.print(vetor);
        n.print(vetor);
        i.print(vetor);
        s.print(vetor);
        
    }
    
}
