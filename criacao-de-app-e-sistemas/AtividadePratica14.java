import javax.swing.*;

class AtividadePratica14 {

	public static void main (String entrada[]){

	//declaração de variaveis
	int n1, n2; 
	double pot, div;
	String msg = "";

	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));

	div = n1 / n2;
	pot = Math.pow(n1,n2);
	
	
	msg = "n1 = " + n1 + "  n2 = " + n2 + "\n";
	msg = msg + "Quociente de divisão de n1 por n2 = " + div + "\n";
	msg = msg + "Potencia de n1 e n2 = " + pot + "\n";
	
	
	JOptionPane.showMessageDialog(null,msg);
	
	System.exit(0);
}
}