import javax.swing.JOptionPane;

public class algoritmoMedia {
    public static void main(String args[]) {
        int vetSoma [], i, soma = 0, media = 0;
        vetSoma = new int [50];

        for (i = 0; i <= 49; i++){
            vetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + vetSoma[i];
        }

        media = soma/50;
        
        System.out.println("A média dos valores é: " + media);
        System.exit(0);
        
    }
}
