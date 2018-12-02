package fornecedores;

public class LimiteAtingidoException extends Exception{
    public LimiteAtingidoException(){
        super("O limite de fornecedores foi alcançado");
    }
}
