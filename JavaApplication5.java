package pacote1;
import java.util.Scanner;
public class JavaApplication5 {

	public static void main(String[] args) {
		int M , m , m1 , M1 , r;
		Scanner LerS = new Scanner (System.in);
		System.out.print("Qual é o multiplicador? ");
		m=LerS.nextInt();
        System.out.print("Qual é o multiplicador? ");
        M=LerS.nextInt();
        //System.out.print("O multiplicador é " + n + "\m");
        //System.out.print("O multiplicador é " + M + "\M");
        while (m>1) {
        	m=m/2;
        	//System.out.print(m + "\n");
        	M=M*2;
        			System.out.print(M + "\n");
        	
        }
        
        }
        	
	}

