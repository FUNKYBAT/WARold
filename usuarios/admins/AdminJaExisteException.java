package usuarios.admins;

public class AdminJaExisteException extends Exception{
    public AdminJaExisteException(){
        super("O admin já existe");
    }
}
