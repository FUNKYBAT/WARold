package usuarios.admins;

public class LimiteAtingidoException extends Exception {
    public LimiteAtingidoException(){
        super("O limite de admins cadastrados foi atingido");
    }
}
