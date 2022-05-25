
class programa02 {

	public static void main (String entrada[]){

	//declaração de variaveis
	int n1, n2;
	int mod, div;
	double raiz, pot;
	String msg = "";

	n1 = Integer.parseInt(entrada[0]);
	n2 = Integer.parseInt(entrada[1]);

	mod = n1 % n2;
	div = n1 / n2;
	pot = Math.pow(n1,n2);
	raiz = Math.sqrt(n1);
	
	msg = "n1 = " + n1 + "  n2 = " + n2 + "\n";

	msg = msg + "Resto de divisão de n1 por n2 = " + mod + "\n";
	msg = msg + "Quociente de divisão de n1 por n2 = " + div + "\n";
	msg = msg + "Raiz quadrada de n1 = " + raiz + "\n";
	msg = msg + "Potencia de n1 e n2 = " + pot + "\n";

	System.out.println(msg);
	
	System.exit(0);
}
}