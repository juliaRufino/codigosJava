import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int i, r, j, a[];
		a = new int[5];
		
		for(j=0; j<=4; j++) {
			System.out.println("Digite um número e obtenha sua tabuada:");
			a[j] = in.nextInt();			
			for(i=0; i<=10; i++) {
				r = a[j]*i;
				System.out.println(a[j] + " x " + i + " = " + r);				
			}
		}

	}

}

/**Criar um vetor A com 5 elementos inteiros. 
 * Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.
 */