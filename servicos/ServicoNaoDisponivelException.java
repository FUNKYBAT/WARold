package servicos;

public class ServicoNaoDisponivelException extends Exception{
	public ServicoNaoDisponivelException() {
		super("Este servi�o n�o est� dispon�vel!");
	}
}
