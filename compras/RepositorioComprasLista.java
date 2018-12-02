package compras;

import produto.Produto;

public class RepositorioComprasLista implements RepositorioComprasInterface {
	private Produto produto;
	private Produto qtd;
	private RepositorioComprasLista proximo;

	public RepositorioComprasLista() {}

	@Override
	public void AdicionarItem(Produto produto) {
		if(this.produto.getNome() == null) {
			this.produto = produto;
			this.proximo = new RepositorioComprasLista();
		}else if(this.produto.getNome() == produto.getNome()) {
			
		}
		
	}
	@Override
	public void RemoverItem(String nome) throws ItemNaoEstaNoCarrinhoException {
		if(this.produto != null) {
			if(this.produto.getNome().equals(nome)) {
				this.produto = this.proximo.produto;
				this.proximo = this.proximo.proximo;
			}else {
				this.proximo.RemoverItem(nome);
			}
		}else {
			throw new ItemNaoEstaNoCarrinhoException();
		}
	}
	@Override
	public Produto ProcurarItem(String nome) throws ItemNaoEstaNoCarrinhoException {
		Produto p = null;
		if (this.produto != null) {
			if(this.produto.getNome().equals(nome)) {
				p = this.produto;
				return p;
			}else {
				this.proximo.ProcurarItem(nome);
				return this.proximo.ProcurarItem(nome);
			}
		}else {
			throw new ItemNaoEstaNoCarrinhoException();
		}
	}
	@Override
	public boolean Existe(String nome) {
		if(this.produto != null) {
			if(this.produto.getNome().equals(nome)) {
				return true;
			}else {
				return this.proximo.Existe(nome);
			}
		}else {
			return false;
		}
	}
	
	@Override
	public void InserirCupom(int codCupom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalcularFrete(int geradorFrete) {
		// TODO Auto-generated method stub
		
	}
}