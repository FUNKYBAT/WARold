
public class ServicoJaEncontradoNoSistemaException extends Exception{
	public ServicoJaEncontradoNoSistemaException() {
		super("Este serviço já se encontra no sistema!");
	}
}
