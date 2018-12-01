package usuarios.comuns;

public class RepositorioUsuarioComumLista implements RepositorioUsuarioComumInterface {
    UsuarioComum user;
    RepositorioUsuarioComumLista prox;

    RepositorioUsuarioComumLista() {
    }

    @Override
    public void novoUsuario(UsuarioComum user) throws UsuarioJaExisteException {
        if (this.user == null) {
            this.user = user;
            this.prox = new RepositorioUsuarioComumLista();
        } else if (this.user.getCPF() == user.getCPF()) {
            throw new UsuarioJaExisteException();
        } else {
            this.prox.novoUsuario(user);
        }
    }

    @Override
    public UsuarioComum procura(String CPF) throws UsuarioNaoExisteException {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                return this.user;
            } else {
                return this.prox.procura(CPF);
            }
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

    @Override
    public void deleta(String CPF) throws UsuarioNaoExisteException {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user = this.prox.user;
                this.prox = this.prox.prox;
            } else {
                this.prox.deleta(CPF);
            }
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

    @Override
    public void atualizaNome(String CPF, String nome) throws UsuarioNaoExisteException {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setNome(nome);
            } else {
                this.prox.atualizaNome(CPF, nome);
            }
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

    @Override
    public void atualizaIdade(String CPF, int idade) throws UsuarioNaoExisteException {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setIdade(idade);
            } else {
                this.prox.atualizaIdade(CPF, idade);
            }
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

    @Override
    public void atualizaTelefone(String CPF, String telefone) throws UsuarioNaoExisteException {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setTelefone(telefone);
            } else {
                this.prox.atualizaTelefone(CPF, telefone);
            }
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

    @Override
    public void atualizaCEP(String CPF, String CEP) throws UsuarioNaoExisteException {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setCEP(CEP);
            } else {
                this.prox.atualizaCEP(CPF, CEP);
            }
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

    @Override
    public void atualizaNumeroCartao(String CPF, String numeroCartao) throws UsuarioNaoExisteException {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setNumeroCartao(numeroCartao);
            } else {
                this.prox.atualizaNumeroCartao(CPF, numeroCartao);
            }
        } else {
            throw new UsuarioNaoExisteException();
        }
    }
}
