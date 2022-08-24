package fes.aragon.analisis;

import java.util.Scanner;

public class Edificio {

	public static void main(String[] args) {
		int A1 = 1;
		int Pisos[] = new int[6];
		int HabiPuerta[] = new int[4];

		String puerta = "ABCD";
		int NumPuerta[] = new int[6];
		int Mayor = 0;
		int MayorDeTodo = 0;
		int PisoNum = 0;
		int PuertNum = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < Pisos.length; i++) {

			for (int j = 0; j < HabiPuerta.length; j++) {
				HabiPuerta[j] = j + 1;
				System.out.println("Numero de habitantes en la puerta " + puerta.charAt(j) + " del piso " + (i + 1));
				HabiPuerta[j] = sc.nextInt();

				for (int j2 = 0; j2 < HabiPuerta.length; j2++) {
					if (HabiPuerta[j2] > Mayor) {
						Mayor = HabiPuerta[j2];
						NumPuerta[i] = j2;
					}
				}
				Pisos[i] = Mayor;
				Mayor = 0;
			}
		}
		for (int j3 = 0; j3 < Pisos.length; j3++) {
			if (Pisos[j3] > MayorDeTodo) {
				MayorDeTodo = Pisos[j3];
				PisoNum = j3;
				PuertNum = NumPuerta[j3];
			}
		}
		System.out.println("La puerta que tiene mas habitantes del edificio es la puerta " + puerta.charAt(PuertNum)
				+ " con " + MayorDeTodo + " habitantes en el piso " + (PisoNum + 1));
	}
}
