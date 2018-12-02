package fornecedores;

public class RepositorioFornecedorArray implements RepositorioFornecedorInterface {
    private Fornecedor arrayFornecedor[] = new Fornecedor[140];

    public void novoFornecedor(Fornecedor fornecedor) throws FornecedorJaExisteException, LimiteAtingidoException {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca() == fornecedor.getMarca()) {
                throw new FornecedorJaExisteException();
            } else if (arrayFornecedor[i] == null) {
                this.arrayFornecedor[i] = fornecedor;
                break;
            } else if (i == arrayFornecedor.length) {
                if (arrayFornecedor[i] == null) {
                    this.arrayFornecedor[i] = fornecedor;
                    break;
                } else {
                    throw new LimiteAtingidoException();
                }
            }
        }
    }

    public boolean procuraFornecedor(String marca) throws FornecedorNaoExisteException {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                return true;
            } else if (arrayFornecedor[i] == null) {
                throw new FornecedorNaoExisteException();
            }
        }
        return false; // Caso base.
    }


    public void apagaFornecedor(String marca) throws FornecedorNaoExisteException {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                for (int j = i; j < arrayFornecedor.length; j++) {
                    if (arrayFornecedor[j] != null)
                        arrayFornecedor[j] = arrayFornecedor[j + 1];
                    else
                        break;
                }
            } else if (arrayFornecedor[i] == null) {
                throw new FornecedorNaoExisteException();
            }
        }
    }

    public void atualizaDisponibilidade(String marca, boolean disponibilidade) throws FornecedorNaoExisteException {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                arrayFornecedor[i].setDisponibilidade(disponibilidade);
            } else if (arrayFornecedor[i] == null) {
                throw new FornecedorNaoExisteException();
            }
        }
    }
}