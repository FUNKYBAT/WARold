package compras;

import produto.Produto;
import armas.Armas;

public class Compras {
	private Produto item;
	private Armas modeloArma;
	private String cupom;
	private int frete;
	private boolean compraRealizada = false;

	
//	// Calcular valor do frete
//	public void calcularFrete() {
//		Random geradorFrete = new Random();
//		Scanner in = new Scanner(System.in);
//		System.out.println("Informe o seu estado:");
//		String estado = in.nextLine();
//		System.out.println("Valor do Frete: " + geradorFrete.nextInt(20) + ",00 R$");
//	}
//
//	// Calcular valor de desconto
//	public void inserirDesconto() {
//		Random geradorDesconto = new Random();
//		Scanner in2 = new Scanner(System.in);
//		System.out.println("Possui cupom de desconto? (S/N): ");
//		String temCupom = in2.nextLine();
//		if (temCupom.equals("S")) {
//			System.out.println("Digite o Código do Cupom (XXX): ");
//			int codCupom = in2.nextInt();
//			System.out.println("Valor Desconto: " + geradorDesconto.nextInt(5) + ",00 R$");
//			if (geradorDesconto.equals(0)) {
//				System.out.println("Cupom Esgotado");
//			}
//		}
//	}
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


	public Armas getModeloArma() {
		return modeloArma;
	}


	public void setModeloArma(Armas modeloArma) {
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