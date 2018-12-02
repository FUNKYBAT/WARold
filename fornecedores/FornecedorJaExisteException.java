package fornecedores;

public class FornecedorJaExisteException extends Exception {
    public FornecedorJaExisteException() {
        super("Um fornecedor com esse nome ja existe no nosso sistema.");
    }
}