
package estatica.aplicacoes;

import estaticca.Pilha;
import javax.swing.JOptionPane;


public class NPR {

    public static String toNPR(String infixa){
        String saida = "";
        Pilha p = new Pilha();
        
        for(int i=0; i < infixa.length(); i++){
            char ch = infixa.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                saida +=ch;
            }
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                p.push(ch);
            }
            if(ch == ')'){
                saida += p.pop();
            }
        }
        return saida;
    }
     
    public static String toNPR2(String infixa) {
        String saida = "";
        Pilha p = new Pilha();
        
        for (int i = 0; i < infixa.length(); i++) {
            char ch = infixa.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                saida +=ch;
            }
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (!p.isEmpty() && (prio(p.top().toString().charAt(0)) >= prio(ch))) {
                    saida += p.pop();
                    p.push(ch);
                }
            }
            if(ch == '('){
                p.push(ch);
            }
            if(ch == ')'){
                do{
                    saida += p.pop();
                } while( ch != '(' );
                saida += p.pop(); //Não sei ainda se isso aqui é certo ou errado
            }
        }
        while(!p.isEmpty()){
            saida += p.pop();
        }
        return saida;
    }
    
    public static float solveNPR(String infixa){
        Pilha p = new Pilha();
        
        for (int i = 0; i < infixa.length(); i++) {
            char ch = infixa.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                p.push(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de "+ch)));
            }
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                switch(ch){
                    case '+':
                        p.push((Float) p.pop() + (Float) p.pop());
                        break;
                    case '-':
                        p.push((Float) p.pop() - (Float) p.pop());
                        break;
                    case '*':
                        p.push((Float) p.pop() * (Float) p.pop());
                        break;
                    case '/':
                        p.push((Float) p.pop() / (Float) p.pop());
                        break;
                }
            }
        }
        return (float) p.pop();
    }

    public static int prio(char op){
        int resp = 0;
        switch(op){
            case'(': resp = 1; break;
            case'+': resp = 2; break;
            case'-': resp = 2; break;
            case'*': resp = 3; break;
            case'/': resp = 3; break;
        }
        return resp;
    }

}
