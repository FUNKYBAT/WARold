package usuarios.comuns;

public class LimiteAtingidoException extends Exception {
    public LimiteAtingidoException(){
        super("O limite de usuarios cadastrados foi atingido");
    }
}
