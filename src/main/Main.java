package main;

import atividade.modelo.Celular;

public class Main {

	public static void main(String[] args) {

			Celular celular = new Celular("Xiaomi",4);
		
			System.out.println(celular.getTipoSmartPhone());
			celular.carregar();
			System.out.println(celular.toString());
			System.out.println("atividade.interfaces.Bateria: mAh" + celular.getMAH());
			System.out.println(celular.getModeloProcessador());
			System.out.println("Potencia: " + celular.getPotencia());
			System.out.println("Tela: " + celular.getTipoTela());
		
	}

}
