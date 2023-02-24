import javax.swing.JOptionPane;
public class somarVetores {
    public static void main(String args[]) {
        int vetSoma [], i, soma = 0;
        vetSoma = new int [100];

        for (i = 0; i <= 99; i++){
            vetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + vetSoma[i];
        }

        System.out.println("A soma dos 100 valores é: " + soma);
        System.exit(0);
        
    }
}
