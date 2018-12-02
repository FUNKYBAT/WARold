package produto.arma;

public class ArmaJaExisteException extends Exception {
    ArmaJaExisteException(){
        super("A arma ja existe");
    }
}
