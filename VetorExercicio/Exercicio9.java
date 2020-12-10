import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = 10;
		boolean palindromo = true;
		int a[], i=0, j=(N-1);
		a = new int[N]; 
		
		for(i=0; i<N; i++) {
			System.out.print("Digite o "+(i+1)+"� valor: ");
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
			System.out.print("Os elementos do vetor formam um pal�ndromo.");
		}else {
			System.out.print("Os elementos do vetor n�o formam um pal�ndromo.");			
		}

	}

}

/**9.	N�meros pal�ndromos s�o aqueles que escritos da direita para a esquerda t�m o mesmo valor quando escritos da esquerda para a direita. 
 * Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros � um pal�ndromo, 
 * ou seja, se o primeiro elemento do vetor e igual ao �ltimo, se o segundo elemento do vetor � igual ao pen�ltimo e assim por diante at� verificar todos os elementos ou chegar a conclus�o que o vetor n�o � um pal�ndromo.
 */
