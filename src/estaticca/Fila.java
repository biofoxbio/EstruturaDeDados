
package estaticca;


public class Fila {
    private int total;
    private int comeco;
    private int fim;
    private Object memo[];
    private int MAX;
    
    public Fila(){
        MAX = 5;
        memo = new Object[MAX];
        total = 0;
        comeco = 0;
        fim = 0;
    }
    
    public boolean isEmpty(){
        return (total==0);
    }
    
    private boolean isFull(){
        return (total==MAX);
    }
    
    public void enqueue(Object x) {
        if(!isFull()){
            memo[fim++] = x;
            fim %= MAX;
            total ++;
        } else {
            System.out.println("Fila cheia!!");
        }
    }
    
    public  Object dequeue(){
        if(!isEmpty()){
            Object resp;
            resp = memo[comeco++];
            comeco %= MAX;
            total--;
            return resp;
        } else {
            return null;
        }
    }
}
