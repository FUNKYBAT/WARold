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

    public void inserir(Fornecedor marca) throws ExceptionFJC {
        this.fornecedor.inserir(marca);
    }

    public boolean procurar(Fornecedor marca) throws ExceptionFNE {
        return this.fornecedor.procurar(marca);
    }

    public void deletar(Fornecedor marca) throws ExceptionFNE {
        this.fornecedor.deletar(marca);
    }

    public void atualiza (Fornecedor marca, Fornecedor disponibilidade) throws ExceptionFNE {
        this.fornecedor.atualiza(marca, disponibilidade);
    }
}