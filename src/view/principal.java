package view;

import controller.ThreadSomarLinha;

public class principal {
	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random()*100);				
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			ThreadSomarLinha tsl = new ThreadSomarLinha(matriz[i], i);
			tsl.start();
		}
	}
}
