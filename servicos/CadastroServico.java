import 	Servico.*;
import RepositorioArrayServico;
import RepositorioListaServico;
import LimiteAtingidoException;
import ServicoJaEncontradoNoSistemaException;
import ServicoNaoDisponivelException;

public class CadastroServico {
	private RepositorioServico servicos;
	
	public CadastroServico(boolean tipo) {
		if (tipo) {
			this.servicos = new RepositorioListaServico();
		} else {
			this.servicos = new RepositorioArrayServico();
		}
	}
	
	public void cadastrarServico(Servico servico) throws LimiteAtingidoException, ServicoJaEncontradoNoSistemaException {
		this.servicos.inserir(servico);
	}
	
	public void removerServico(String nome) throws ServicoNaoDisponivelException {
		this.servicos.remover(nome);
	}
	
	public Servico  procurarServico(String nome) throws ServicoNaoDisponivelException {
		return this.servicos.procurar(nome);
	}
	
	public boolean existe(String nome) {
		return this.servicos.existe(nome);
	}
	
	public void atualizaNome(String nome, String decricao) throws ServicoNaoDisponivelException {
		this.servicos.atualizaNome(nome, decricao);
	}
	
	public void atualizaDescricao(String descricao, String nome) throws ServicoNaoDisponivelException {
		this.servicos.atualizaDescricao(descricao, nome);
	}
	
	public void atualizaValor(double valor, String nome) throws ServicoNaoDisponivelException {
		this.servicos.atualizaValor(valor, nome);
	}
	
	public void atualizaEntrega(int dias, String nome) throws ServicoNaoDisponivelException {
		this.atualizaEntrega(dias, nome);
	}
}
