package usuarios.admins;

public class AdminNaoExisteException extends Exception{
    public AdminNaoExisteException(){
        super("O admin não existe");
    }
}
