
public class RepositorioListaServico implements RepositorioServico {
	private Servico servico;
	private RepositorioListaServico proximo;

	public RepositorioListaServico() {
		this.servico = null;
		this.proximo = null;
	}
	@Override
	public void inserir(Servico servico) {
		if (this.servico == null) {
			this.servico = servico;
			this.proximo = new RepositorioListaServico();
		} else {
			this.proximo.inserir(servico);
		}

	}

	@Override
	public void remover(String nome) throws ServicoNaoDisponivelException{
		if (this.servico == null) {
			ServicoNaoDisponivelException e;
			e = new ServicoNaoDisponivelException();
			throw e;
		} else if (this.servico.getNomeServico().equals(nome)) {
			this.servico = this.proximo.servico;
			this.proximo = this.proximo.proximo;
		} else {
			this.proximo.remover(nome);
		}

	}

	@Override
	public void atualizaNome(String nome, String decricao) throws ServicoNaoDisponivelException {

		if (this.servico.getDescricaoServico() != null) {
			if (this.servico.getDescricaoServico().equals(decricao)) {
				this.servico.setNomeServico(nome);
			} else if (this.proximo != null) {
				this.proximo.atualizaNome(nome, decricao);
			} else {
				ServicoNaoDisponivelException e;
				e = new ServicoNaoDisponivelException();
				throw e;
			}
		} else {
			ServicoNaoDisponivelException e;
			e = new ServicoNaoDisponivelException();
			throw e;
		}

	}
	@Override
	public void atualizaDescricao(String descricao, String nome) throws ServicoNaoDisponivelException {
		if (this.servico.getDescricaoServico() != null ) {
			if (this.servico.getNomeServico().equals(nome)) {
				this.servico.setDescricaoServico(descricao);
			} else if (this.proximo != null) {
				this.proximo.atualizaDescricao(descricao, nome);
			} else {
				ServicoNaoDisponivelException e;
				e = new ServicoNaoDisponivelException();
				throw e;
			}
		} else {
			ServicoNaoDisponivelException e;
			e = new ServicoNaoDisponivelException();
			throw e;
		}
	}
	@Override
	public void atualizaValor(double valor, String nome) throws ServicoNaoDisponivelException {
		if (this.servico != null) {
			if (this.servico.getNomeServico().equals(nome)) {
				this.servico.setValorServico(valor);
			} else if (this.proximo != null){
				this.proximo.atualizaValor(valor, nome);
			} else {
				ServicoNaoDisponivelException e;
				e = new ServicoNaoDisponivelException();
				throw e;
			}
		} else {
			ServicoNaoDisponivelException e;
			e = new ServicoNaoDisponivelException();
			throw e;
		}

	}
	@Override
	public void atualizaEntrega(int dias, String nome) throws ServicoNaoDisponivelException {
		if (this.servico != null) {
			if (this.servico.getNomeServico().equals(nome)) {
				this.servico.setDiasEntrega(dias);
			} else if (this.proximo != null) {
				this.proximo.atualizaEntrega(dias, nome);
			} else {
				ServicoNaoDisponivelException e;
				e = new ServicoNaoDisponivelException();
				throw e;
			}
		} else {
			ServicoNaoDisponivelException e;
			e = new ServicoNaoDisponivelException();
			throw e;
		}

	}

	@Override
	public Servico procurar(String nome) throws ServicoNaoDisponivelException {
		Servico retorno = null;
		boolean achou = false;
		if (this.servico == null) {
			ServicoNaoDisponivelException e;
			e = new ServicoNaoDisponivelException();
			throw e;
		} else if (this.servico.getNomeServico().equals(nome)) {
			retorno = this.servico;
			achou = true;
		} else {
			this.proximo.procurar(nome);
		}
		if (achou == true) {
			return retorno;
		} else {
			ServicoNaoDisponivelException e;
			e = new ServicoNaoDisponivelException();
			throw e;
		}
	}
	@Override
	public boolean existe(String nome) {
		if (this.servico.getNomeServico() != null) {
			if (this.servico.getNomeServico().equals(nome)) {
				return true;
			} else {
				return this.proximo.existe(nome);
			}
		} else {
			return false;
		}
	}

}
