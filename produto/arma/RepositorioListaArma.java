package produto.arma;

import produto.produto.Produto;

public class RepositorioListaArma implements InterfaceRepositoriosArma {

    private Arma arma;
    private RepositorioListaArma proximo;

    public RepositorioListaArma() {
    }

    public void CadastrarCatalogo(Arma arma) throws ArmaJaExisteException {
        if (this.arma.getNome() == null) {
            this.arma = arma;
            this.proximo = new RepositorioListaArma();
        } else if (this.arma.getNome() == arma.getNome()) {
            throw new ArmaJaExisteException();
        } else if (this.proximo != null) {
            this.proximo.CadastrarCatalogo(arma);
        }
    }

    public void RemoverCatalogo(String nome) throws ArmaNaoExisteException {
        if (this.arma != null) {
            if (this.arma.getNome().equals(nome)) {
                this.arma = this.proximo.arma;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.RemoverCatalogo(nome);
            }
        } else {
            throw new ArmaNaoExisteException();
        }
    }

    public Produto Procurar(String nome) throws ArmaNaoExisteException {
        if (this.arma != null) {
            if (this.arma.getNome().equals(nome)) {
                return this.arma;
            } else {
                this.proximo.Procurar(nome);
                return this.proximo.Procurar(nome);
            }
        } else {
            throw new ArmaNaoExisteException();
        }
    }

    public boolean Existe(String nome) {
        if (this.arma != null) {
            if (this.arma.getNome().equals(nome)) {
                return true;
            } else {
                return this.proximo.Existe(nome);
            }
        }
        return false;
    }

    public void Atualizarpreco(String nome, double novopreco) throws ArmaNaoExisteException {
        if (this.arma != null) {
            if (this.arma.getNome() == nome) {
                this.arma.setPreco(novopreco);
            } else if (this.proximo != null) {
                this.proximo.Atualizarpreco(nome, novopreco);
            }
        } else {
            throw new ArmaNaoExisteException();
        }
    }

    public void AtualizarEstrelas(String nome, double novavaliacao) throws ArmaNaoExisteException {
        if (this.arma != null) {
            if (this.arma.getNome() == nome) {
                double x = this.arma.getEstrelas();
                this.arma.setEstrelas((x + novavaliacao) / 2);
            } else if (this.proximo != null) {
                this.proximo.Atualizarpreco(nome, novavaliacao);
            }
        } else {
            throw new ArmaNaoExisteException();
        }
    }

    public void AtualizarDescricao(String nome, String novadescricao) throws ArmaNaoExisteException {
        if (this.arma != null) {
            if (this.arma.getNome() == nome) {
                this.arma.setDescricao(novadescricao);
            } else if (this.proximo != null) {
                this.proximo.AtualizarDescricao(nome, novadescricao);
            }
        } else {
            throw new ArmaNaoExisteException();
        }
    }
}
