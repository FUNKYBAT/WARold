package usuarios.admins;

public class RepositorioUsuarioAdminArray implements RepositorioUsuarioAdminInterface {
    private UsuarioAdmin[] arrayAdmin = new UsuarioAdmin[1000];
    
    @Override
    public void novoAdmin(UsuarioAdmin user) throws LimiteAtingidoException, AdminJaExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getNome() == user.getNome()) {
                throw new AdminJaExisteException();
            } else if (arrayAdmin[i] == null) {
                this.arrayAdmin[i] = user;
                break;
            } else if (i == arrayAdmin.length) {
                if (arrayAdmin[i] == null) {
                    this.arrayAdmin[i] = user;
                    break;
                } else {
                    throw new LimiteAtingidoException();
                }
            }
        }
    }

    @Override
    public UsuarioAdmin procura(String CPF) throws AdminNaoExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getNome().equals(CPF)) {
                return arrayAdmin[i];
            } else if (arrayAdmin[i] == null) {
                throw new AdminNaoExisteException();
            }
        }
        return null;
    }

    @Override
    public void deleta(String CPF) throws AdminNaoExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                int posicaoEncontrada = i;
                for (int j = posicaoEncontrada; j < arrayAdmin.length; j++) {
                    if (arrayAdmin[j] != null) {
                        arrayAdmin[j] = arrayAdmin[j + 1];
                    } else {
                        break;
                    }
                }
            } else if (arrayAdmin[i] == null) {
                throw new AdminNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaNome(String CPF, String nome) throws AdminNaoExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setNome(nome);
            } else if (arrayAdmin[i] == null) {
                throw new AdminNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaIdade(String CPF, int idade) throws AdminNaoExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setIdade(idade);
            } else if (arrayAdmin[i] == null) {
                throw new AdminNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaTelefone(String CPF, String telefone) throws AdminNaoExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setTelefone(telefone);
            } else if (arrayAdmin[i] == null) {
                throw new AdminNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaCEP(String CPF, String CEP) throws AdminNaoExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setCEP(CEP);
            } else if (arrayAdmin[i] == null) {
                throw new AdminNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaCodigoFuncionario(String CPF, String codigoFuncionario) throws AdminNaoExisteException {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setCodigoFuncionario(codigoFuncionario);
            } else if (arrayAdmin[i] == null) {
                throw new AdminNaoExisteException();
            }
        }
    }
}
