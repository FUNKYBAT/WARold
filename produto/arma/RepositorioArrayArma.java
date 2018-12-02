package produto.arma;

import produto.produto.Produto;

public class RepositorioArrayArma implements InterfaceRepositoriosArma {
    private Arma[] arrayArma = new Arma[1000];

    public void CadastrarCatalogo(Arma arma) throws LimiteAtingidoException, ArmaJaExisteException {
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome() == arma.getNome()) {
                throw new ArmaJaExisteException();
            } else if (arrayArma[i] == null) {
                this.arrayArma[i] = arma;
                break;
            } else if (i == arrayArma.length) {
                if (arrayArma[i] == null) {
                    this.arrayArma[i] = arma;
                    break;
                } else {
                    throw new LimiteAtingidoException();
                }
            }
        }
    }

    public void RemoverCatalogo(String nome) throws ArmaNaoExisteException {
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome().equals(nome)) {
                for (int j = i; j < arrayArma.length; i++) {
                    if (arrayArma[j] != null)
                        arrayArma[j] = arrayArma[i + 1];
                    else
                        break;
                }
            } else if (arrayArma[i] == null) {
                throw new ArmaNaoExisteException();
            }
        }
    }

    public Produto Procurar(String nome) throws ArmaNaoExisteException {
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome().equals(nome)) {
                return arrayArma[i];
            } else if (arrayArma[i] == null) {
                throw new ArmaNaoExisteException();
            }
        }return null;
    }

    public boolean Existe(String nome){
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome().equals(nome)) {
                return true;
            } else if (arrayArma[i] == null) {
                return false;
            }
        }return false;
    }

    public void AtualizarDescricao(String nome, String novaDescricao) throws ArmaNaoExisteException{
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome().equals(nome)) {
                arrayArma[i].setDescricao(novaDescricao);
            } else if (arrayArma[i] == null) {
                throw new ArmaNaoExisteException();
            }
        }
    }

    public void AtualizarEstrelas(String nome, double novaAvaliacao) throws ArmaNaoExisteException{
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome().equals(nome)) {
                double x = arrayArma[i].getEstrelas();
                arrayArma[i].setEstrelas((x + novaAvaliacao) / 2);
            } else if (arrayArma[i] == null) {
                throw new ArmaNaoExisteException();
            }
        }
    }

    public void AtualizarPreco(String nome, double novoPreco) throws ArmaNaoExisteException{
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome().equals(nome)) {
                arrayArma[i].setPreco(novoPreco);
            } else if (arrayArma[i] == null) {
                throw new ArmaNaoExisteException();
            }
        }
    }

    public void AtualizarQuantidade(String nome, int quantidade) throws ArmaNaoExisteException{
        for (int i = 0; i < arrayArma.length; i++) {
            if (arrayArma[i].getNome().equals(nome)) {
                arrayArma[i].setPreco(quantidade);
            } else if (arrayArma[i] == null) {
                throw new ArmaNaoExisteException();
            }
        }
    }
}