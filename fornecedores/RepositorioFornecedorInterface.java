package fornecedores;

public interface RepositorioFornecedorInterface {

    void novoFornecedor(Fornecedor marca) throws ExceptionFJC;

    boolean procuraFornecedor(Fornecedor marca) throws ExceptionFNE;

    void apagaFornecedor(Fornecedor marca) throws ExceptionFNE;

    void atualizaDisponibilidade (Fornecedor disponibilidade) throws ExceptionFNE;
}