package br.com.techHouse.zmed.enums;

public enum ZmedNavegacaoEnum {
	
	medicamento,
	medicamentoInventario,
	notaFiscal,
	fornecedor,
	operadora;
	
	public String getName(){
		return name();
	}

}