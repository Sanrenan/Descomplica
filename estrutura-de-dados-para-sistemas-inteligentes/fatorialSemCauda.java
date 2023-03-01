import javax.swing.*;

class FatorialP {
    static void fatP(int n, int x, int f) {

        if (x == 0 || x == 1) {
            System.out.println("O fatorial de " + n + " é: " + f); // Regra 1
        } else {
            fatP(n, x - 1, f * x);
        }

    }

    public static void main(String arg[]) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para saber seu fatorial: "));

        if (numero < 0){
            System.out.println("Valor invalido para cálculo de fatorial. O valor precisa ser maior que zero");
            System.exit(0);
        }
        else {
            
            fatP(numero, numero, 1);


        }
        System.exit(0);


        
    }
}
