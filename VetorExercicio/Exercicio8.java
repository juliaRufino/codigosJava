import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int N = 10;
		boolean encontrado = false;
		int a[], i, num, posicao=0, e=0;
		a = new int[N];

		for(i=0; i<N; i++) {
			System.out.println("Insira o " + (i+1) + "° elemento de A:");
			a[i] = in.nextInt();
		}
		
		System.out.println("Digite o valor a ser procurado em A:");
		num = in.nextInt();
		
		System.out.print("A[] = ");
		
		for(i=0; i<N; i++) {
			System.out.print(a[i] + "  ");
		}	
		System.out.println();
		
		for(i=0; i<N; i++) {
			if(num == a[i]) {
				encontrado = true;
				posicao = i;		
			}else {
				encontrado = false; 
				e++;
			}
			
			if(encontrado) {
				System.out.println("O número "+ num + " está armazenado na posição " + posicao +" no vetor.");
			}else if(e==N) {
				System.out.println("O número "+ num + " não está armazenado no vetor.");
			}
		}
		             
	}

}

/**8.	Ler 10 elementos inteiros em um vetor A. 
 * Montar uma rotina de busca, para pesquisar se um dado elemento X está armazenado em A.
 */