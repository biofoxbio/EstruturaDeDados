package dinamica;

import javax.swing.JOptionPane;

public class Pilha {

    Node topo;
//Construtor para iniciar a Pilha no estado vazia (sem nós, portanto, nula)

    public Pilha() {
        topo = null;
    }
    //Retorne se a Pilha está vazia

    public boolean isEmpty() {
        return (topo == null);
    }
//Insere um elemento na Pilha

    public void push(Object x) {
        Node novo = new Node(); //Cria um novo nó
        novo.setDado(x); //Insere o valor no novo nó
        novo.setProx(topo); //Configura como próximo do novo o topo atual
        topo = novo; //O novo topo será esse novo nó
    }
//Retorna o elemento do Topo (sem removê-lo)

    public Object top() {
        if (!isEmpty()) {
            return topo.getDado();
        }
        return null;
    }
    //Retorna o elemento do topo, removendo-o

    public Object pop() {
        if (!isEmpty()) {
            Object resp = topo.getDado(); //Captura quem está no topo
            topo = topo.getProx(); //O topo será o próximo
            return resp; //Retorna a resposta
        }
        return null;
    }
//Exibe o conteúdo da Pilha dinâmica na tela

    public void print() {
        if (!isEmpty()) {
            String resp = "";
Node aux = topo;
            while (aux != null) {
                resp = ", " + aux.getDado().toString() + resp;
                aux = aux.getProx();
            }
            JOptionPane.showMessageDialog(null, "P:[ " + resp + " ]");
        } else {
            JOptionPane.showMessageDialog(null, "Pilha Vazia!");
        }
    }
}
