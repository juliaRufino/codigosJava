import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int N = 10;
		int a[], i, j = 0, resto0 = 0;
		a = new int[N];
				
		for(i=0; i<N; i++) {
			System.out.print("Entre com o "+ (i+1) + "° número: ");
			a[i] = in.nextInt();
			resto0 = 0;
			
			for(j=1; j<=a[i]; j++) {
				if(a[i] % j == 0) {
					resto0++;						    
				}
			}	
			
	        if(a[i] ==1 || resto0 > 2) {
			    System.out.println("O número " + a[i] +" não é primo");
     	    }else if(resto0 <= 2){
		        System.out.println("O número " + a[i] +" é primo");
	        }
		}    

	}

}

/**Criar um vetor A com 10 elementos inteiros. 
 * Escreva um programa que imprima cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.
 */