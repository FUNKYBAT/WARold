package compras;
import produto.Produto;
import armas.Armas;

public class RepositorioComprasArray implements RepositorioComprasInterface{
	private Produto[] arrayCarrinho = new Produto[1000]; //Compras de Acessórios
	private int[] arrayQtdProduto = new int[arrayCarrinho.length]; //Armazenar qtd de produtor por índice
	private Armas[] arrayCarinho2 = new Armas[1000]; //Compras de Armas

	//Adicionando Item ao Carrinho
	public void AdicionarItem(Produto produto) {
		for(int i=0; i<arrayCarrinho.length; i++) {
			if(this.arrayCarrinho[i].getNome().equals(produto)) {
				this.arrayQtdProduto[i] += 1;
			}else {
				this.arrayCarrinho[i] = produto;
			}
		}
	}
	//Remover Item do Carrinho
	@Override
	public void RemoverItem(String nome) throws ItemNaoEstaNoCarrinhoException {
		for(int i = 0; i < this.arrayCarrinho.length; i++) {
			if(this.arrayCarrinho[i].getNome().equals(nome)) {
				int aux = i;
				for(int j= 1; j<(this.arrayCarrinho.length - aux); j  ++) {
					this.arrayCarrinho[aux] = this.arrayCarrinho[aux + 1];
					aux++;
				}				 
			}else {
				throw new ItemNaoEstaNoCarrinhoException();
			}
		}	
	}
	//Procurar Item no Carrinho
	@Override
	public Produto ProcurarItem(String nome) throws ItemNaoEstaNoCarrinhoException{
		for(int i = 0; i < this.arrayCarrinho.length; i++) {
			if(this.arrayCarrinho[i].getNome().equals(nome)){
				return this.arrayCarrinho[i];
			}else {
				throw new ItemNaoEstaNoCarrinhoException();
			}
		}
		return null;
	}
	//Verificar se item existe no carrinho
	@Override
	public boolean Existe(String nome) {
		for(int i=0; i<this.arrayCarrinho.length; i++) {
			if(this.arrayCarrinho[i].getNome().equals(nome)) {
				return true;
			}else if (this.arrayCarrinho[i] == null) {
				return false;
			}
		}
		return false;
	}
	//Adicionar algum cupom de Desconto
	@Override
	public void InserirCupom(int codCupom) {
		
		
	}
	//Calcular Frete de envio
	@Override
	public void CalcularFrete(int geradorFrete) {
		// TODO Auto-generated method stub
		
	}
}