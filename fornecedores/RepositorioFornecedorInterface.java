package fornecedores;

public interface RepositorioFornecedorInterface {

    void inserirFornecedor(Fornecedor marca) throws ExceptionFJC, ExceptionLFA;

    boolean procurarFornecedor(Fornecedor marca) throws ExceptionFNE;

    void deletarFornecedor(Fornecedor marca) throws ExceptionFNE;

    void atualizaDisponibilidade (String marca, boolean disponibilidade) throws ExceptionFNE;
}