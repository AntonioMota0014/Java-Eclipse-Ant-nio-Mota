package pacote1;

import java.util.Scanner;

public class Resultado_Do_Aluno {

	public static void main(String[] args){
	    Scanner Ler = new Scanner (System.in);
	String nome;    
	double numero1 , numero2;
	double resultado;
	        System.out.print("Digite o nome do aluno:");
	        nome = Ler.next(); 
	        System.out.print("Digite a avaliação cognitiva do aluno:");
	        numero1 = Ler.nextDouble();
	        System.out.print("Digite a avaliação atitudinal do aluno:");
	        numero2 = Ler.nextDouble();
	resultado = 0.6*numero1+0.4*numero2;
if (resultado>=10)
	        System.out.print("O aluno passou");
if (resultado<10)
	        System.out.print("O aluno reprovou");
            System.out.print("O resultado do aluno:" + nome + ",com" + resultado);
	  

}

}

