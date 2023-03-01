import javax.swing.JOptionPane;

class Fatorial {

    public static int fat(int n) {

        int f;

        if (n == 0) {
            return 1;
        }

        else {
            f = n * fat(n - 1);
            return f;
        }
    }

    public static void main(String args[]) {

        int f, numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para saber seu fatorial: "));

        if (numero < 0){
            System.out.println("Valor invalido para cálculo de fatorial. O valor precisa ser maior que zero");
            System.exit(0);
        }
        else{
            f = fat(numero);
            System.out.println("O Fatorial de " + numero + " é: " + f );

        }
        System.exit(0);

    }

}
