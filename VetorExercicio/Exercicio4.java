import java.lang.Math;
public class Exercicio4 {

	public static void main(String[] args) {
		final int N = 11;
		int a[], i;
		a = new int[N];
		
		for(i=0; i<N; i++) {
			a[i] = (int)Math.pow(2, i);
			System.out.print(a[i] + " ");
		}

	}

}

/**Criar um vetor A com 11 elementos, indexados de 0 at� 10. 
 * Sendo que cada elemento do vetor A � formado pela pot�ncia de base 2 elevado ao expoente igual a posi��o do respectivo elemento, 
 * ou seja: A[i] = 2i.
 */