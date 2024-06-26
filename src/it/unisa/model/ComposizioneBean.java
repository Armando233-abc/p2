package it.unisa.model;

import java.io.Serializable;

public class ComposizioneBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public ComposizioneBean() {
		
	}
	 
	 public int getIdOrdine() {
		return idOrdine;
	}
	 
	 public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}
	 
	 public int getIdProdotto() {
		return idProdotto;
	}
	 
	 public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	 
	 public int getQuantità() {
		return Quantità;
	}
	 
	 public void setQuantità(int Quantità) {
		this.Quantità = Quantità;
	}
	 
	 
	 public double getPrezzoTotale() {
		return prezzoTotale;
	}
	 
	 public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}
	 
	   public String getIva() {
		return iva;
	}
	   
	   public void setIva(String iva) {
		this.iva = iva;
	}
	 
	 private int idOrdine;
	 private int idProdotto;
	 private int Quantità;
	 private String iva;
	 private double prezzoTotale;
}