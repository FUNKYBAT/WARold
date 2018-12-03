package Produto;

public class PLimiteAtingidoException extends Exception {
    public PLimiteAtingidoException(){
        super("O limite de acessorios cadastrados foi atingido");
    }
}
