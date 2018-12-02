package compras;
import produto.produto.*;
import produto.arma.Arma;

public class Compras {
	private Produto item;
	private Arma modeloArma;
	private String cupom;
	private int frete;
	private boolean compraRealizada = false;

	public Compras(Produto item, boolean compraRealizada) {
		this.item = item;
		this.compraRealizada = compraRealizada;
	}


	public Produto getItem() {
		return item;
	}


	public void setItem(Produto item) {
		this.item = item;
	}


	public Arma getModeloArma() {
		return modeloArma;
	}


	public void setModeloArma(Arma modeloArma) {
		this.modeloArma = modeloArma;
	}


	public String getCupom() {
		return cupom;
	}


	public void setCupom(String cupom) {
		this.cupom = cupom;
	}


	public int getFrete() {
		return frete;
	}


	public void setFrete(int frete) {
		this.frete = frete;
	}


	public boolean isCompraRealizada() {
		return compraRealizada;
	}


	public void setCompraRealizada(boolean compraRealizada) {
		this.compraRealizada = compraRealizada;
	}
	
	

}