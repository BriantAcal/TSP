package com.example.sql.models;

public class CepResultDTO {

	private String numero;
	private String cabecera;
	private String cveInegi;
	private Integer id;
	private String municipio;
	
	public String getnumero() {
		return numero;
	}
	public void setnumero (String numero) {
		this.numero = numero;
	}
	public String getcabecera() {
		return cabecera;
	}
	public void setcabecera(String cabecera) {
		this.cabecera = cabecera;
	}
	public String getcveInegi() {
		return cveInegi;
	}
	public void setcveInegi(String cveInegi) {
		this.cveInegi = cveInegi;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getmunicipio() {
		return municipio;
	}
	public void setLocalidad(String municipio) {
		this.municipio = municipio;}
}