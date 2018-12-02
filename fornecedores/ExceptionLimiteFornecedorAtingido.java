package fornecedores;

public class ExceptionLFA extends Exception {
    public ExceptionLFA(){
        super("O limite de fornecedores que o sistema pode cadastrar foi atingido.");
    }
}
