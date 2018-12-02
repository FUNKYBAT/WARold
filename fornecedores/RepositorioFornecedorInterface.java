package fornecedores;

public interface RepositorioFornecedorInterface {

    void inserir(Fornecedor marca) throws ExceptionFJC, ExceptionLFA;

    boolean procurar(Fornecedor marca) throws ExceptionFNE;

    void deletar(Fornecedor marca) throws ExceptionFNE;

    void atualiza(Fornecedor disponibilidade) throws ExceptionFNE;
}