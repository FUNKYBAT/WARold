package produto.arma;
import produto.produto.Produto;

public class Arma extends Produto {
	protected String calibre;
	protected String cano;
	protected int municao;
	
	public Arma(String nome,double estrelas,double preco,String descricao,String marca,String numserie,String calibre,String cano,int municao, int quantidade) {
		super(nome,estrelas,preco,descricao,marca,numserie, quantidade);
		this.calibre = calibre;
		this.cano = cano;
		this.municao = municao;
	}
	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public String getCano() {
		return cano;
	}

	public void setCano(String cano) {
		this.cano = cano;
	}

	public int getMunicao() {
		return municao;
	}

	public void setMunicao(int municao) {
		this.municao = municao;
	}

}
