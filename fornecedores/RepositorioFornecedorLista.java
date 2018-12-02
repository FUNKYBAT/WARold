package fornecedores;

import fornecedores.ExceptionFJC;
import fornecedores.ExceptionFNE;
import fornecedores.Fornecedor;
import fornecedores.RepositorioFornecedorInterface;

public class RepositorioFornecedorLista implements RepositorioFornecedorInterface {
  private Fornecedor fornecedor;
  private RepositorioFornecedorLista proximo;

  RepositorioFornecedorLista() {
    this.fornecedor = null;
    this.proximo = null;
  }

  @Override
  public void novoFornecedor(Fornecedor fornecedor) throws ExceptionFJC {
    if (this.fornecedor == null) {
      this.fornecedor = fornecedor;
      this.proximo = new RepositorioFornecedorLista();
    } else if (this.fornecedor.getMarca() == fornecedor.getMarca()) {
      throw new ExceptionFJC();
    } else if (this.proximo != null) {
      this.proximo.novoFornecedor(fornecedor);
    }
  }

  @Override
  public boolean procuraFornecedor(Fornecedor marca) throws ExceptionFNE {
    if (this.fornecedor.equals(marca) && this.fornecedor != null) {
      return true;
    } else if (this.proximo != null) {
      this.proximo.procuraFornecedor(marca);
    } else {
      throw new ExceptionFNE();
    }
    return false; // Caso base.
  }

  @Override
  public void apagaFornecedor(Fornecedor marca) throws ExceptionFNE {
    if (this.fornecedor != null) {
      if (this.fornecedor.equals(marca)) {
        this.fornecedor = this.proximo.fornecedor;
        this.proximo = this.proximo.proximo;
      } else if (this.proximo != null) {
        this.proximo.apagaFornecedor(marca);
      } else {
        throw new ExceptionFNE();
      }
    }
  }

  @Override
  public void atualizaDisponibilidade(String marca, boolean disponibilidade) throws ExceptionFNE {
    if (this.fornecedor.getMarca() != null) {
      if (this.fornecedor.getMarca.equals(marca)) {
        this.fornecedor.setDisponibilidade(disponibilidade);
      } else {
        this.proximo.atualizaDisponibilidade(marca, disponibilidade);
      }
    } else {
      throw new ExceptionFNE();
    }
  }
}