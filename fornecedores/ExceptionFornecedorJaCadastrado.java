package fornecedores;

public class ExceptionFJC extends Exception {
    public ExceptionFJC() {
        super("Um fornecedor com esse nome ja existe no nosso sistema.");
    }
}