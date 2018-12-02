package produto.produto;

public class LimiteAtingidoException extends Exception {
    public LimiteAtingidoException(){
        super("O limite de acessorios cadastrados foi atingido");
    }
}
