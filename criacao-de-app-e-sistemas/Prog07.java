import javax.swing.*;

class Prog07 {

	public static void soma() {

		int soma = 0, vet[] = {1, 2, 3, 4, 5};

		for (int i =0; i <vet.length; i++){
			soma = soma + vet[i];
		}

		JOptionPane.showMessageDialog(null, "A somatoria é: " + soma);

		
	}

	public static int produto() {

		int produto = 1, vet[] = {1, 2, 3, 4, 5};

		for(int i =0; i < vet.length; i++){
			produto = produto * vet[i];
		}

		return produto;
	
	}

	public static void main (String entrada[]){

	//declaração de variaveis
	int resultado;

	soma();

	resultado = produto();



	JOptionPane.showMessageDialog(null,"A produtoria é: " + resultado);

	
	System.exit(0);
}
}