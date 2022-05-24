package estaticca;

public class Pilha {

    private Object memo[];
    private int Max;
    private int topo;

    public Pilha() {
        Max = 30;
        memo = new Object[Max];
        topo = -1;
    }

    public boolean isEmpty() {
        
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == Max - 1);
    }

    public void push(Object v) {
        if (!isFull()) {
            topo++;
            memo[topo] = v;

        } else {
            System.out.println("Pilha cheia [Stack Overflow] ");
        }

    }

    public Object pop() {
        if (!isEmpty()) {
            return memo[topo--];
        } else {
            return null;
        }
    }

    public Object top() {
        if (!isEmpty()) {
            return memo[topo];
        } else {
            return null;
        }
    }
    
    public void Print(){
        if(!isEmpty()){
            String resp = " ";
            for(int i=0; i<=topo; i++){
                resp += memo[i]+", ";
                
            }
            System.out.println("p=[ " + resp+ " ]");
            
        }else{
            System.out.println("pilha vazia [Stack Empty!]");
    
}
    }
}
