import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  final int N = 10;
		  boolean achou;
	      int a[], b[], c[], i, j, x=0, iguais=0, Diferentes=0;
	      a = new int[N];
	      b = new int[N];
	      
	      for (i=0; i<N; i++) {
	    	  System.out.println("Digite o "+(i+1)+ "° valor de A: ");
	          a[i] = in.nextInt();
	      }

	      for (j=0; j<N; j++) {
	    	  System.out.println("Digite o "+(j+1)+ "° valor de B: ");
	          b[j] = in.nextInt();
	      }      
 
	      for (i=0; i<N; i++) {
	        achou = false;
	        for (j=0; j<N; j++) {
	          if (a[i] == b[j]) {
	             achou = true;
	             iguais++;
	          }   
	        }
	        
	        Diferentes = N - iguais;
            c = new int[Diferentes];
                        	
            if (achou == false) {
     	        c[x] = a[i];
     	        System.out.print(c[x] + "  ");
     	        x ++;
     	    }            	
                        
	      }
	      
	      if(Diferentes == 0) {
	    	  System.out.println("Não há valores Diferentes e o vetor C está vazio");
	      }else if(Diferentes == 1) {
				System.out.print("é o único valor de C.");
	      }else {
				System.out.print("são valores de C.");
	      }
	      
	}	

}
 
/**7.	Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Desenvolver um programa que crie um vetor C que é a diferença dos conjuntos formados pelos elementos dos vetores A e B. 
 * Diferença de conjuntos = todos os elementos do conjunto A que não existem no conjunto B.
 */