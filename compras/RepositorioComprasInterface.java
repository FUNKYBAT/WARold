package compras;
import produto.Produto;

public interface RepositorioComprasInterface {
	
	void AdicionarItem(Produto produto);
	
	void RemoverItem(String nome) throws ItemNaoEstaNoCarrinhoException;
	
	Produto ProcurarItem(String nome) throws ItemNaoEstaNoCarrinhoException;
	
	boolean Existe(String nome);
	
	void InserirCupom(int codCupom);
	
	void CalcularFrete(int geradorFrete);
}
