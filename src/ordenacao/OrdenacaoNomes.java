package ordenacao;

import javax.swing.JOptionPane;

public class OrdenacaoNomes extends Sort {

    String vnomes[] = new String[10];

    public OrdenacaoNomes() {
        for (int i = 0; i < 10; i++) {
            vnomes[i] = JOptionPane.showInputDialog(null, "Digite um nome: ");
        }
    }

    public void ordenacaoNomes(int vnomes[]) {
        int aux;
        int tam = vnomes.length;
        int j;

     

    }

}
