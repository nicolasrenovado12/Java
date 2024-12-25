package application;

import java.util.Scanner;

import exception.StringException;

public class Program3 {

		public static void main(String[] args) {

				boolean decisao = false;
				double aumentoMensal=0;
				double juros = 0;
				Scanner sc = new Scanner(System.in);
				try {


						System.out.println("Qual é sua meta");
						double meta = sc.nextDouble();

						System.out.println("Há um dinheiro inicial para colocar se acaso não digite 0: ");
						double dinheiroInicial = sc.nextDouble();

						System.out.println("Qual o valor por mês que deseja investir: ");
						double valorMensal = sc.nextDouble();

						System.out.println("Taxa anual ou mensal? (anual ou mensal)?");
						String anualOuMensal = sc.next();

						if (anualOuMensal.equals("anual")) {
								System.out.println("Digite a taxa anual: ");
								double anualTaxa = sc.nextDouble();
								juros = (anualTaxa / 12) / 100;
						} else if (anualOuMensal.equals("mensal")){
								System.out.println("Digite a taxa mensal: ");
								double mensalTaxa = sc.nextDouble();
								juros = mensalTaxa / 100;

						} else {
								throw new StringException("Erro ao informar corretamente a string.");
						}


						System.out.println("Você deseja aumentar o quanto investe por ano? (s ou n)? ");
						String decisaoString = sc.next();

						if (decisaoString.equals("s")) {
								decisao = true;	
						} else if (decisaoString.equals("n")) {
								decisao = false;	
						} else {
								throw new StringException("Erro ao informar corretamente a string.");
						}

						if (decisao) {
								System.out.println("Quanto você deseja aumentar por ano o seu valor mensal de investimento: ");
								aumentoMensal = sc.nextDouble();
						}


						double quantidade = 0;
						int ano = 0;
						int i = 0;
						quantidade+=dinheiroInicial;

						while(quantidade < meta) {

								quantidade += valorMensal * Math.pow((1 + juros),i);

								ano = (i/12) +1 ;
								int mes = (i%12) + 1;
								System.out.println("Ano = " + ano);
								System.out.println(quantidade);
								i+=1;

								if (decisao) {
										if (mes == 1) {
												valorMensal+=aumentoMensal;
										}	
								}
								System.out.println(i +  " Meses");
						}


				}	catch (StringException e) {


						System.out.println(e);


				}  catch (Exception e) {

						System.out.println("Aconteceu um erro inesperado:" + e);
				}

		}

}
