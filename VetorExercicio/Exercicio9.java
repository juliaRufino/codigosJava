import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = 10;
		boolean palindromo = true;
		int a[], i=0, j=(N-1);
		a = new int[N]; 
		
		for(i=0; i<N; i++) {
			System.out.print("Digite o "+(i+1)+"° valor: ");
			a[i] = in.nextInt();
		}
		
		i = 0;
		
		while ((i < j) && (palindromo == true)) {
		        if (a[i] != a[j]) {
		           palindromo = false; 
		        }else {
		          i++;
		          j--;
		        }
		}
		
		if(palindromo == true) {
			System.out.print("Os elementos do vetor formam um palíndromo.");
		}else {
			System.out.print("Os elementos do vetor não formam um palíndromo.");			
		}

	}

}

/**9.	Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda para a direita. 
 * Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, 
 * ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.
 */
