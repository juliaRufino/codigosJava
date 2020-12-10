import java.util.Scanner;
public class Exercicio10{

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int N = 10;
		int a[], b[], i, j=0, aux=0;
		a = new int[N];
		b = new int[N];
		
		for(i=0; i<N; i++) {
			System.out.println("Entre com o "+ (i+1) +"° elemento de A:");
			a[i] = in.nextInt();
		    b[j] = a[i];	
		    j++;
		} 
		
		System.out.print("A[] = ");
		
		for(i=0; i<N; i++) {
			System.out.print(a[i] + "  ");
		}
			
		System.out.println();
		System.out.print("B[] = ");
		
		for(i = 0; i<N; i++){
			for(j = 0; j<(N-1); j++){
				if(b[j] > b[j + 1]){
					aux = b[j];
					b[j] = b[j+1];
					b[j+1] = aux;
				}
			}
		}
		
	    for(j=0; j<N; j++) {
			System.out.print(b[j] + "  ");
		}
		
	}
}	

/**Ler um vetor A com dez elementos inteiros. 
 * Criar um vetor B que tenha os 10 elementos de A em ordem crescente.
 */