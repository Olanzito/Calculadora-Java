package cursoprogramacao1;

import java.util.Locale;
import java.util.Scanner;

public class minhaclasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Locale.setDefault(Locale.US);
		
	Scanner sc = new Scanner(System.in);

	
	double x, y, ad, sub, mult, div, resultado;
	String op = "s";

	while (op.equals("s")) {
	
		int ad1 = 1;
		int sub2 = 2;
		int mult3 = 3;
		int div4 = 4;
		
		x = sc.nextDouble();
		int sinal = sc.nextInt();
		y = sc.nextDouble();
	
	ad = x + y;
	sub = x - y;
	mult = x * y;
	div = x / y;
	
	resultado = 0;
		
	if (sinal == ad1) {
		resultado = (resultado + ad);
		System.out.printf("resultado = %.2f%n",resultado);
	}
	else if(sinal == sub2) {
		resultado = resultado + sub;
		System.out.printf("resultado = %.2f%n",resultado);
	}
	else if(sinal == mult3) {
		resultado = resultado + mult;
		System.out.printf("resultado = %.2f%n",resultado);
	}
	else if (sinal == div4) {
		resultado = resultado + div;
		System.out.printf("resultado = %.2f%n",resultado);
	}
	else {
		System.out.println("erro");
	
	}
	System.out.println("deseja fazer outra conta?");
	op = sc.next();

	}
	sc.close();
	}
}
