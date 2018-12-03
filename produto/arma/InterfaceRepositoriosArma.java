package Arma;
import Produto.Produto;
import Produto.ProdutoNaoExisteException;

public interface InterfaceRepositoriosArma {

    void CadastrarCatalogo(Arma arma) throws ArmaJaExisteException, LimiteAtingidoException;

    void RemoverCatalogo(String nome) throws ArmaNaoExisteException;

    Arma Procurar(String nome) throws ArmaNaoExisteException;

    boolean Existe(String nome);

    void AtualizarPreco(String nome, double novoPreco) throws ArmaNaoExisteException;

    void AtualizarDescricao(String nome, String novaDescricao) throws ArmaNaoExisteException;

    void AtualizarEstrelas(String nome, double novaAvaliacao) throws ArmaNaoExisteException;

	void AtualizarQuantidade(String nome, int quantidade) throws ArmaNaoExisteException;

	Arma[] ProcurarCategoria(String categoria, int x) throws ArmaNaoExisteException;

	Arma[] ProcurarCalibre(String calibre, int x) throws ArmaNaoExisteException;

	Arma[] ProcurarMunicao(String municao, int x) throws ArmaNaoExisteException;

    
}
