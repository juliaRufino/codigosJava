import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = 15;
		int a[], b[], i, j, fat;
		a = new int[N];
		b = new int[N];
		
		for(i=0; i<N; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			a[i] = in.nextInt();
			fat = 1;
			
			for(j=a[i]; j>1; j--) {
				fat = fat * j;
			}
			
			b[i] = fat;
			System.out.println(a[i] + "! = " + b[i] );
		}		

	}

}

/**Criar um vetor A com 15 elementos inteiros. 
 * Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento correspondente em A.
 */
