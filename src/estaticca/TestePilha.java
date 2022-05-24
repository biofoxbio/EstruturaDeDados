
package estaticca;

import java.util.Date;


public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        
        p.push("elton");
        p.push(21);
        p.push(00000000.00);
        p.push('M');
        p.push(true);
        p.push(new Date());
        System.out.println(p.top());
        p.Print();
        
        
    }
    
}
