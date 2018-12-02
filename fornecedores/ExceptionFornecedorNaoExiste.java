package fornecedores;

public class ExceptionFNE extends Exception {
    public ExceptionFNE() {
        super("A busca por esse fornecedor não retornou resultado.");
    }
}