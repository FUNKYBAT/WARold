package fornecedores;

public class FornecedorNaoExisteException extends Exception {
    public FornecedorNaoExisteException() {
        super("A busca por esse fornecedor não retornou resultado.");
    }
}