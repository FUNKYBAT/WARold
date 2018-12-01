package usuarios.admins;

public class RepositorioUsuarioAdminLista implements RepositorioUsuarioAdminInterface {
    UsuarioAdmin admin;
    RepositorioUsuarioAdminLista prox;

    RepositorioUsuarioAdminLista() { }

    public void novoAdmin(UsuarioAdmin admin) throws AdminJaExisteException {
        if (this.admin == null) {
            this.admin = admin;
            this.prox = new RepositorioUsuarioAdminLista();
        } else if (this.admin.getCPF() == admin.getCPF()) {
            throw new AdminJaExisteException();
        } else {
            this.prox.novoAdmin(admin);
        }
    }

    public UsuarioAdmin procura(String CPF) throws AdminNaoExisteException {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                return this.admin;
            } else {
                return this.prox.procura(CPF);
            }
        } else {
            throw new AdminNaoExisteException();
        }
    }

    public void deleta(String CPF) throws AdminNaoExisteException {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin = this.prox.admin;
                this.prox = this.prox.prox;
            } else {
                this.prox.deleta(CPF);
            }
        } else {
            throw new AdminNaoExisteException();
        }
    }

    public void atualizaNome(String CPF, String nome) throws AdminNaoExisteException {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setNome(nome);
            } else {
                this.prox.atualizaNome(CPF, nome);
            }
        } else {
            throw new AdminNaoExisteException();
        }
    }

    public void atualizaIdade(String CPF, int idade) throws AdminNaoExisteException {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setIdade(idade);
            } else {
                this.prox.atualizaIdade(CPF, idade);
            }
        } else {
            throw new AdminNaoExisteException();
        }
    }

    public void atualizaTelefone(String CPF, String telefone) throws AdminNaoExisteException {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setTelefone(telefone);
            } else {
                this.prox.atualizaTelefone(CPF, telefone);
            }
        } else {
            throw new AdminNaoExisteException();
        }
    }

    public void atualizaCEP(String CPF, String CEP) throws AdminNaoExisteException {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setCEP(CEP);
            } else {
                this.prox.atualizaCEP(CPF, CEP);
            }
        } else {
            throw new AdminNaoExisteException();
        }
    }

    public void atualizaCodigoFuncionario(String CPF, String codigoFuncionario) throws AdminNaoExisteException {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setCodigoFuncionario(codigoFuncionario);
            } else {
                this.prox.atualizaCodigoFuncionario(CPF, codigoFuncionario);
            }
        } else {
            throw new AdminNaoExisteException();
        }
    }
}
