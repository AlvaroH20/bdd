package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefe) {
		if(telefe.getOperadora()=="movi") {
			telefe.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono tel1,Telefono tel2,Telefono tel3) {
		int numeroTel=0;
		if(tel1.getOperadora()=="movi") {
			numeroTel=numeroTel+1;
		} 
		if(tel2.getOperadora()=="movi") {
			numeroTel=numeroTel+1;
		}
		if(tel3.getOperadora()=="movi") {
			numeroTel=numeroTel+1;
		}
		return numeroTel;
	}
	public int contarClaro(Telefono tel1,Telefono tel2,Telefono tel3, Telefono tel4) {
		int numeroTel=0;
		if(tel1.getOperadora()=="claro") {
			numeroTel=numeroTel+1;
		} 
		if(tel2.getOperadora()=="claro") {
			numeroTel=numeroTel+1;
		}
		if(tel3.getOperadora()=="claro") {
			numeroTel=numeroTel+1;
		}
		if(tel4.getOperadora()=="claro") {
			numeroTel=numeroTel+1;
		}
		return numeroTel;
	}
}	
