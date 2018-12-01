package usuarios.comuns;

public class UsuarioNaoExisteException extends Exception{
    public UsuarioNaoExisteException(){
        super("O usuário não existe");
    }
}
