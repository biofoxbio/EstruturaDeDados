package aplicacoers.listas;

public class NoPoli {

    private float coef;
    private int expo;
    private NoPoli prox;

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public int getExpo() {
        return expo;
    }

    public void setExpo(int expo) {
        this.expo = expo;
    }

    public NoPoli getProx() {
        return prox;
    }

    public void setProx(NoPoli prox) {
        this.prox = prox;
    }

    public class Polinomio {

        private NoPoli comeco;
//Inicializa o polinômio com o termo 0x^0

        public Polinomio() {
            comeco = new NoPoli();
            comeco.setExpo(0);
            comeco.setCoef(0);
            comeco.setProx(null);
        }
            //Insere um elemento no Polinômio
        public void insTermo(float coef1, int expo1) {
//Se o expoente for o primeiro, juntar os coeficientes
            if (expo1 == comeco.getExpo()) {
                comeco.setCoef(comeco.getCoef() + coef1);
            } //Se não for, procurar para ver se existe como na lista ordenada
            else {
                NoPoli aux;
                aux = comeco;
//Achar a posição onde o monômio pode estar
                while (aux.getProx() != null && expo1 > aux.getProx().getExpo()) {
                    aux = aux.getProx();
                }
//Se o próximo for ele, somar coeficientes, senão, inserir novo item
                if (aux.getProx() != null && expo1 == aux.getProx().getExpo()) {
                    aux.getProx().setCoef(aux.getProx().getCoef() + coef1);
                } else {
                    NoPoli novo = new NoPoli();
                    novo.setCoef(coef1);
                    novo.setExpo(expo1);
                    novo.setProx(aux.getProx());
                    aux.setProx(novo);
                }
            }
        }
    }
}
