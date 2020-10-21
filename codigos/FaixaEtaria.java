import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i, idade, faixa1=0, faixa2=0, faixa3=0, faixa4=0, faixa5=0;
		double porcentagem1=0, porcentagem2=0, porcentagem3=0, porcentagem4=0, porcentagem5=0;
		for (i=1; i<=15;i++) {
		System.out.println("Entre com a idade:");
		idade = leia.nextInt();
		if (idade<=15) {
			faixa1 = faixa1 + 1;
			porcentagem1 = 100.0/15.0*faixa1;
		}else {
			if (idade<=30) {
				faixa2= faixa2+1;
				porcentagem2 = 100.0/15.0*faixa2;
			}else {
				if(idade<=45) {
					faixa3 = faixa3+1;
					porcentagem3 = 100.0/15.0*faixa3;
				}else {
					if(idade<=60) {
						faixa4 = faixa4+1;
						porcentagem4 = 100.0/15.0*faixa4;
					}else {
						if(idade>=61) {
							faixa5 = faixa5 +1;
							porcentagem5 = 100.0/15.0*faixa5;
						}
					}
				}
			}
		}
		}
		System.out.println("Quantidade de pessoas na 1º Faixa Etária: " +faixa1+ " Porcentagem: "+porcentagem1+"%");
		System.out.println("Quantidade de pessoas na 2º Faixa Etária: " +faixa2+ " Porcentagem: "+porcentagem2+"%");
		System.out.println("Quantidade de pessoas na 3º Faixa Etária: " +faixa3+ " Porcentagem: "+porcentagem3+"%");
		System.out.println("Quantidade de pessoas na 4º Faixa Etária: " +faixa4+ " Porcentagem: "+porcentagem4+"%");
		System.out.println("Quantidade de pessoas na 5º Faixa Etária: " +faixa5+ " Porcentagem: "+porcentagem5+"%");
	}

}
