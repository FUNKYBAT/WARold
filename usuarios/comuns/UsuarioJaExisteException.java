package usuarios.comuns;

public class UsuarioJaExisteException extends Exception {
    public UsuarioJaExisteException() { super("O usuário já existe"); }
}
