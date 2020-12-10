import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int N = 20; 
        int a[], b[], i, contpar=0, contimpar=0, par=0, impar=0;
		a = new int[N];
		b = new int[N];
			
		for(i=0; i<N; i++) {
			System.out.print("Entrar com o "+(i+1)+ "° valor: ");
		    a[i] = in.nextInt();
		    if (a[i]%2 == 0) {
		    	contpar++;
			}else {
				contimpar++;
		    }
		}
		
		System.out.print("A = ");

		for(i=0; i<N; i++) { 
			System.out.print(a[i]+" ");
		}
		
		impar = contpar; 
		
		for(i=0; i<N; i++) {
			if(a[i]%2 == 0) {
				b[par] = a[i];
				par++;
			}else {
				b[impar] = a[i];
				impar++;
			}
		}
		
		System.out.println("");
		System.out.print("B = ");
		
		for(i=0; i<N; i++) {
			System.out.print(b[i] + " ");
		}
		
	}

}

/**Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. 
 * Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.
 */
