package produto.arma;

public class ArmaNaoExisteException extends Exception{
    ArmaNaoExisteException(){
        super("A arma não existe");
    }
}
