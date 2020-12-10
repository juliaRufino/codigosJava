import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = 10;
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i, j,x, contIguais=0;
		a = new int[N];
		b = new int[N];
		
		//leitura do vetor a
		
		for(i=0; i<N; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<N; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de B");
			b[i] = in.nextInt();
		}
		//verificacao quantos elementos de A tem em B pq esse será o tamanho de C
		
		for(i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				if (a[i] == b[j]) {
					contIguais++;
				}
			}
		}
		
		if (contIguais == 0) {
			System.out.println("Não há valores iguais e o vetor C está vazio");
		}else {
			x=0;
			c = new int[contIguais];
			for (i = 0; i<N ; i++) {
				for (j = 0; j<N; j++) {
					if (a[i] == b[j]) {
							c[x] = a[i];
							System.out.print(c[x]+" ");
							x++;
				    }
			    }
		    }
		}
		System.out.print("são valores de C");
	}
	
}

/**Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Desenvolver um programa que realize a intersecção dos vetores A e B para produzir um vetor C. 
 * Interseção de conjuntos = todos os elementos que existem em A e também existem em B.
 */
