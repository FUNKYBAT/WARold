package fornecedores;

import fornecedores.ExceptionFJC;
import fornecedores.RepositorioFornecedorArray;

public class CadastroFornecedor {
    private RepositorioFornecedorInterface fornecedor;

    CadastroFornecedor(boolean tipo) {
        if (tipo == true) {
        this.fornecedor = new RepositorioFornecedorLista();
        }
        else {
            this.fornecedor = new RepositorioFornecedorArray();
        }
    }

    public void inserirFornecedor(Fornecedor marca) throws ExceptionFJC {
        this.fornecedor.inserirFornecedor(marca);
    }

    public boolean procurarFornecedor(Fornecedor marca) throws ExceptionFNE {
        return this.fornecedor.procurarFornecedor(marca);
    }

    public void deletarFornecedor(Fornecedor marca) throws ExceptionFNE {
        this.fornecedor.deletarFornecedor(marca);
    }

    public void atualizaFornecedor (Fornecedor marca, Fornecedor disponibilidade) throws ExceptionFNE {
        this.fornecedor.atualizaFornecedor(marca, disponibilidade);
    }
}