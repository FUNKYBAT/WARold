package fornecedores;

public class ExceptionFSD extends Exception {
    public ExceptionFSD() {
        super("Este fornecedor nao esta disponivel para negocios nesse momento.");
    }
}