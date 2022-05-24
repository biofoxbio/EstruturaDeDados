
package dinamica;



import javax.swing.JOptionPane;



public class PilhaExplode {
    public static void main(String args []){
    
    int i = 0;
    Pilha p = new Pilha();
    
    try{
        while(true){
            p.push(i);
            i++;
           
        }
        }catch (OutOfMemoryError e) {
            JOptionPane.showMessageDialog(null,"Capacidade Maxima: " + i);
    }
  } 
}
