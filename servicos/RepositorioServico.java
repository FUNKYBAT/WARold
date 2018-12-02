package servicos;

public interface RepositorioServico {
	public void inserir(Servico servico) throws LimiteAtingidoException;
	public void remover(String nome) throws ServicoNaoDisponivelException;
	public void atualizaNome(String nome, String decricao) throws ServicoNaoDisponivelException;
	public void atualizaDescricao(String descricao, String nome) throws ServicoNaoDisponivelException;
	public void atualizaValor(double valor, String nome) throws ServicoNaoDisponivelException;
	public void atualizaEntrega(int dias, String nome) throws ServicoNaoDisponivelException;
	public Servico procurar(String nome) throws ServicoNaoDisponivelException;
}
