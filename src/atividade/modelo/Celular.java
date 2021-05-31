package atividade.modelo;

import atividade.interfaces.Bateria;
import atividade.interfaces.Processador;
import atividade.interfaces.SmartPhone;

public class Celular implements Processador, SmartPhone, Bateria {

	private boolean carregado;
	private int porcentagem;
	private String marca; 
	private int quantCameras;
	
	
	
	public Celular(String marca, int quantCameras) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setQuantCameras(quantCameras);
		this.setPorcentagem(0);
	}
	
	
	
	@Override
	public int getMAH() {
		return 4000;
	}

	@Override
	public void carregar() {
		System.out.println("atividade.modelo.Celular carregado!");
		this.setCarregado(true);
		this.setPorcentagem(100);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getTipoTela() {
		return "Lcd";
	}

	@Override
	public String getTipoSmartPhone() {
		return "atividade.modelo.Celular";
	}

	@Override
	public String getModeloProcessador() {
		return "SnapDragon 885g";
	}

	@Override
	public String getPotencia() {
		return "5G";
	}

	public boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantCameras() {
		return quantCameras;
	}

	public void setQuantCameras(int quantCameras) {
		this.quantCameras = quantCameras;
	}



	public int getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}



	@Override
	public String toString() {
		return "atividade.modelo.Celular [carregado=" + carregado + ", porcentagem=" + porcentagem + ", marca=" + marca
				+ ", quantCameras=" + quantCameras + "]";
	}



	

	
	
	
	

	
}
