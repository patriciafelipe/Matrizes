package Exercicio;

public class Matriz4 {
	public static void main(String[] args) {
		double matriz[][] = new double[3][3];
		double acumulador = 0;
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

				if (i != 0 && x==1) {
					if (acumulador == 0) {
						acumulador = matriz[i][x];
				}else {
					acumulador = (acumulador/matriz[i][x]);
				}
				}
			}
		}
	System.out.println("A divisão dos valores da matriz é: " +acumulador);
	}
}
