import javax.swing.*;

class AtividadePratica16{

    public static void soma (int vet[]){
        int soma = 0;

        for (int i = 0; i < vet.length; i ++){
            soma = soma + vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria é: " + soma);
    }

    public static int produto(int vet[]) {
        int produto = 1;

        for (int i = 0; i < vet.length; i++) {

            produto = produto * vet[i];
            
        }
        return produto;
        
    }

    public static void main(String entrada[]){
        int vetor[] = {2, 4, 6, 8, 10};
        int resultado;

        soma(vetor);

        resultado = produto(vetor);

        JOptionPane.showMessageDialog(null, "A produtoria é: "+ resultado);

        System.exit(0);

    
        
    }
}