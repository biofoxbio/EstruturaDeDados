package dinamica;

    public class Node{
//Dado a ser armazenado no nó

        private Object dado;
//Referência para o próximo nó
        private Node prox;

        public Object getDado() {
            return dado;
        }

        public void setDado(Object dado) {
            this.dado = dado;
        }

        public Node getProx() {
            return prox;
        }

        public void setProx(Node prox) {
            this.prox = prox;
        }
    }

