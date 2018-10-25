package Exercicio;

public class Matriz2 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int acumulador = 0;
		int i, x;

		matriz[0][0] = 1;
		matriz[0][1] = 10;
		matriz[0][2] = 20;

		matriz[1][0] = 2;
		matriz[1][1] = 20;
		matriz[1][2] = 40;

		matriz[2][0] = 3;
		matriz[2][1] = 52;
		matriz[2][2] = 74;
		
		//Percorre as linhas
		for (i = 0; i < matriz.length; i++){
			//Percorre as colunas
			for (x = 0; x < matriz[i].length; x++){
				//Verifica se a linha é igual a coluna
				if (i == x) {
					//Concatena/Soma os valores das linhas e colunas iguais
					acumulador = acumulador + matriz[i][x];
				}
			}
		}
	System.out.println("A soma dos valores da matriz é: " +acumulador);
	}
}
