package fornecedores;

public interface RepositorioFornecedorInterface {
    void novoFornecedor(Fornecedor fornecedor) throws FornecedorJaExisteException, LimiteAtingidoException;

    boolean procuraFornecedor(String nome) throws FornecedorNaoExisteException;

    void apagaFornecedor(String nome) throws FornecedorNaoExisteException;

    void atualizaDisponibilidade(String nome, boolean disponibilidade) throws FornecedorNaoExisteException;
}