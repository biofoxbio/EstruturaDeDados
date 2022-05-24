package dinamica;

import javax.swing.JOptionPane;

public class listaOrdenada {

    private Node comeco; //Nó do começo da Lista
//Inicializa uma Lista no estado vazia (construtor)

    public listaOrdenada() {
        comeco = null;
    }
//Verifica se a lista está vazia

    public boolean isNull() {
        return (comeco == null);
    }
//Método que converte um objeto em float para poder ser comparado

    private float emFloat(Object x) {
        float resp = Float.parseFloat(x.toString());
        return resp;
    }
    //Insere um elemento na Lista Ordenada

    public void ins(Object x) {
        Node novo = new Node();
        Node aux;
        novo.setDado(x);
//Se a lista estiver vazia ou o elemento for menor que o primeiro
        if (isNull() || emFloat(x) < emFloat(comeco.getDado())) {
            novo.setProx(comeco);
            comeco = novo;
        } else {
            aux = comeco;
            while (aux.getProx() != null && emFloat(x) > emFloat(aux.getProx().getDado())) {
                aux = aux.getProx();
            }
            novo.setProx(aux.getProx());
            aux.setProx(novo);
        }

    }
    //Remove um elemento da lista e retorna true se conseguiu remover e false caso não

    public boolean rem(Object x) {
        Node aux;
//Se a lista estiver vazia ou o elemento for menor que o primeiro, não existe
        if (isNull() || emFloat(x) < emFloat(comeco.getDado())) {
            return false;
        } else {
//Se for o primeiro elemento
            if (emFloat(x) == emFloat(comeco.getDado())) {
                comeco = comeco.getProx();
                return true;
            } //Se for maior que o primeiro, achar a posição
            else {
                aux = comeco;
//Navega até aposição onde deveria encontrar
                while (aux.getProx() != null && emFloat(x) > emFloat(aux.getProx().getDado())) {
                    aux = aux.getProx();
                }
//Se encontrou
                if (aux.getProx() != null && emFloat(x) == emFloat(aux.getProx().getDado())) {
                    aux.setProx(aux.getProx().getProx());
                    return true;
                } else { //Não encontrou o elemento
                   return false;
                }
            }
        }
    }

                   
                  
       //Imprime o conteúdo da Lista
    
        public void print(){
        if (!isNull()) {
            Node aux;
            aux = comeco;
            String saida = "";
            while (aux != null) {
                saida += aux.getDado().toString() + ", ";
                aux = aux.getProx();
            }
            JOptionPane.showMessageDialog(null, "L:[" + saida + "]");
        } else {
            System.out.println("Lista Vazia!");
        }
    }

//Busca por um elemento na lista e retorna o nó onde encontrou
    public Node find(Object x) {
        Node aux = comeco;
//Navega até o nó de interesse
        while (aux != null && emFloat(x) > emFloat(aux.getDado())) {
            aux = aux.getProx();
        }
//Se achou o elemento
        if (aux != null && emFloat(x) == emFloat(aux.getDado())) {
            return aux;
        } else {
            return null;
        }
    }
}
