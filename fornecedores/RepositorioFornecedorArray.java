package fornecedores;

import fornecedores.ExceptionFJC;
import fornecedores.ExceptionFNE;
import fornecedores.RepositorioFornecedorInterface;

public class RepositorioFornecedorArray implements RepositorioFornecedorInterface {
    private Fornecedor arrayFornecedor[] = new Fornecedor[140];

    @Override
    public void inserirFornecedor(Fornecedor marca) throws ExceptionFJC, ExceptionLFA {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i] == null) {
                this.arrayFornecedor[i] = marca;
            } else if (arrayFornecedor[i].marca.equals(marca)) {
                throw new ExceptionFJC();
            } else if (i == arrayFornecedor.length) {
                if (arrayFornecedor[i] == null) {
                    this.arrayFornecedor[i] = marca;
                    i = arrayFornecedor.length;
                } else {
                    throw new ExceptionLFA();
                }
            }
        }
    }

    @Override
    public boolean procurarFornecedor(Fornecedor marca) throws ExceptionFNE {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].equals(marca)) {
                return true;
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFNE();
            }
        }
        return false; // Caso base.
    }

    @Override
    public void deletarFornecedor(Fornecedor marca) throws ExceptionFNE {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].equals(marca)) {
                arrayFornecedor[i] = null;
                i = arrayFornecedor.length; // Sai do laco.
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFNE();
            }
        }
    }

    @Override
    public void atualizaDisponibilidade(String marca, boolean disponibilidade) throws ExceptionFNE {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                arrayFornecedor[i].setDisponibilidade(disponibilidade);
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFNE();
            }
        }
    }
}