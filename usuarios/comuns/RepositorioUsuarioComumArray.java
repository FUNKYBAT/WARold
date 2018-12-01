package usuarios.comuns;

public class RepositorioUsuarioComumArray implements RepositorioUsuarioComumInterface {
    private UsuarioComum[] arrayUsuarioComum = new UsuarioComum[1000];

    @Override
    public void novoUsuario(UsuarioComum user) throws UsuarioJaExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getNome().equals(user.getNome())) {
                throw new UsuarioJaExisteException();
            } else if (arrayUsuarioComum[i] == null) {
                this.arrayUsuarioComum[i] = user;
            }
        }
    }

    @Override
    public UsuarioComum procura(String CPF) throws UsuarioNaoExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getNome().equals(CPF)) {
                return arrayUsuarioComum[i];
            } else if (arrayUsuarioComum[i] == null) {
                throw new UsuarioNaoExisteException();
            }
        }return null;
    }

    @Override
    public void deleta(String CPF) throws UsuarioNaoExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getNome().equals(CPF)) {
                int posicaoEncontrada = i;
                for (int j = posicaoEncontrada; j < arrayUsuarioComum.length; j++) {
                    if (arrayUsuarioComum[j] != null) {
                        arrayUsuarioComum[j] = arrayUsuarioComum[j + 1];
                    } else {
                        break;
                    }
                }
            } else if (arrayUsuarioComum[i] == null) {
                throw new UsuarioNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaNome(String CPF, String nome) throws UsuarioNaoExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setNome(nome);
            } else if (arrayUsuarioComum[i] == null) {
                throw new UsuarioNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaIdade(String CPF, int idade) throws UsuarioNaoExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setIdade(idade);
            } else if (arrayUsuarioComum[i] == null) {
                throw new UsuarioNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaTelefone(String CPF, String telefone) throws UsuarioNaoExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setTelefone(telefone);
            } else if (arrayUsuarioComum[i] == null) {
                throw new UsuarioNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaCEP(String CPF, String CEP) throws UsuarioNaoExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setCEP(CEP);
            } else if (arrayUsuarioComum[i] == null) {
                throw new UsuarioNaoExisteException();
            }
        }
    }

    @Override
    public void atualizaNumeroCartao(String CPF, String numeroCartao) throws UsuarioNaoExisteException {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setNumeroCartao(numeroCartao);
            } else if (arrayUsuarioComum[i] == null) {
                throw new UsuarioNaoExisteException();
            }
        }
    }
}
