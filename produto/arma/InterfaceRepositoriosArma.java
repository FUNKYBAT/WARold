package produto.arma;
import produto.produto.Produto;

public interface InterfaceRepositoriosArma {

    void CadastrarCatalogo(Arma arma) throws ArmaJaExisteException, LimiteAtingidoException;

    void RemoverCatalogo(String nome) throws ArmaNaoExisteException;

    Produto Procurar(String nome) throws ArmaNaoExisteException;

    boolean Existe(String nome);

    void AtualizarPreco(String nome, double novoPreco) throws ArmaNaoExisteException;

    void AtualizarDescricao(String nome, String novaDescricao) throws ArmaNaoExisteException;

    void AtualizarEstrelas(String nome, double novaAvaliacao) throws ArmaNaoExisteException;
}
