package entities;

public class Endereco {

	private String cep;
	private String logradouro;
	private String complemento;
	private String unidade;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	public Endereco(String cep, String logradouro, String complemento, String unidade, String bairro, String localidade,
			String uf, String ibge, String gia, String ddd, String siafi) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.unidade = unidade;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}
	
	
	
}
