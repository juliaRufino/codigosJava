import java.util.Scanner;
public class Desafio {
	public static void main(String args[]){
		Scanner leia = new Scanner(System.in);
		double peso, altura, idade, idadeMaior = 0, idadeMenor = 0, media=0, porcentagem = 0, superior50=0, i, quantPessoaAltura = 0, soma=0, quantPessoaPeso=0, pesoMaior = 0, pesoMenor = 0;
		for (i=1; i<=25; i++) {
			System.out.println("Entre com a idade:");
			idade = leia.nextDouble();
			System.out.println("Entre com a altura:");
			altura = leia.nextDouble();
			System.out.println("Entre com o peso:");
			peso = leia.nextDouble();
			if (idade>50) {
				superior50 = superior50 + 1;
			}
			if(idade>=10 && idade<=20) {
				soma = soma + altura;
				quantPessoaAltura = quantPessoaAltura + 1;
				media = soma/quantPessoaAltura;
			}
			if(peso<40) {
				quantPessoaPeso = quantPessoaPeso + 1;
				porcentagem = 100.0/25.0*quantPessoaPeso;
			}
			if(i==1) {
				idadeMaior = idade;
				pesoMaior = peso;
				idadeMenor = idade;
				pesoMenor = peso;
			}else {
				if(idade>idadeMaior) {
					idadeMaior = idade;
					pesoMaior = peso;
				} 
				if(idade<idadeMenor) {
					idadeMenor = idade;
					pesoMenor = peso;
				}
				
			}
			
		}System.out.println("Quantidade de pessoas com idade superior a 50 anos: "+superior50);
		System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " +media);
		System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " +porcentagem+ "%");
		System.out.println("Peso da pessoa mais velha: "+pesoMaior);
		System.out.println("Peso da pessoa mais nova: "+pesoMenor);
	}
} 


