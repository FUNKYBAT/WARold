package produto.arma;
import produto.produto.Produto;

public class Arma extends Produto {
	protected String calibre;
	protected String categoria;
	protected int municao;
	
	public Arma(String nome,double estrelas,double preco,String descricao,String marca,String numserie,String calibre,String categoria,int municao,int quantidade) {
		super(nome,estrelas,preco,descricao,marca,numserie,quantidade);
		this.calibre = calibre;
		this.categoria = categoria;
		this.municao = municao;
	}
	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getMunicao() {
		return municao;
	}

	public void setMunicao(int municao) {
		this.municao = municao;
	}

}
