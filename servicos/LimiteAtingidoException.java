package servicos;

public class LimiteAtingidoException extends Exception{
	public LimiteAtingidoException() {
		super("O limite de serviços da loja foi atingido, retire alguns para botar novos!");
	}
}
