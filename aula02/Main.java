package aula02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro car = new Carro();
		
		System.out.println("HOT WHEELS");
		
		System.out.println("DIGITE A MARCA:");
		car.setMarca(sc.next());
		
		System.out.println("DIGITE O MODELO:");
		car.setModelo(sc.next());
		
		System.out.println("DIGITE A COR:");
		car.setCor(sc.next());
		
		System.out.println("QUANTIDADE DE PASSAGEIROS:");
		car.setQtdePass(sc.nextInt());
		
		System.out.println("DIGITE O VALOR:");
		car.setValor(sc.nextDouble());
		
		System.out.println("DIGITE O PESO (EM TONELADAS):");
		car.setPeso(sc.nextDouble());
		
		System.out.println(car.getDadosCarro());
	}
}
