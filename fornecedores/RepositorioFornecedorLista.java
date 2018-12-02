package fornecedores;

public class RepositorioFornecedorLista implements RepositorioFornecedorInterface {
    private Fornecedor fornecedor;
    private RepositorioFornecedorLista proximo;

    RepositorioFornecedorLista() {
        this.fornecedor = null;
        this.proximo = null;
    }

    @Override
    public void novoFornecedor(Fornecedor fornecedor) throws FornecedorJaExisteException {
        if (this.fornecedor == null) {
            this.fornecedor = fornecedor;
            this.proximo = new RepositorioFornecedorLista();
        } else if (this.fornecedor.getMarca() == fornecedor.getMarca()) {
            throw new FornecedorJaExisteException();
        } else if (this.proximo != null) {
            this.proximo.novoFornecedor(fornecedor);
        }
    }

    @Override
    public boolean procuraFornecedor(String marca) throws FornecedorNaoExisteException {
        if (this.fornecedor.getMarca().equals(marca) && this.fornecedor != null) {
            return true;
        } else if (this.proximo != null) {
            this.proximo.procuraFornecedor(marca);
        } else {
            throw new FornecedorNaoExisteException();
        }
        return false; // Caso base.
    }

    @Override
    public void apagaFornecedor(String marca) throws FornecedorNaoExisteException {
        if (this.fornecedor.getMarca() != null) {
            if (this.fornecedor.getMarca().equals(marca)) {
                this.fornecedor = this.proximo.fornecedor;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.apagaFornecedor(marca);
            }
        } else {
            throw new FornecedorNaoExisteException();
        }
    }

    @Override
    public void atualizaDisponibilidade(String marca, boolean disponibilidade) throws FornecedorNaoExisteException {
        if (this.fornecedor.getMarca() != null) {
            if (this.fornecedor.getMarca().equals(marca)) {
                this.fornecedor.setDisponibilidade(disponibilidade);
            } else {
                this.proximo.atualizaDisponibilidade(marca, disponibilidade);
            }
        } else {
            throw new FornecedorNaoExisteException();
        }
    }
}