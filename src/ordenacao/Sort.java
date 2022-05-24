package ordenacao;

public abstract class Sort {
    
    public static void print(int vetor[]){
       
        System.out.print("[");
        int tam = vetor.length;
        for(int i = 0; i < tam; i++ ){
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("]");
    }
    
}
