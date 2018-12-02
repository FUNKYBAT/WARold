package usuarios.admins;

public interface RepositorioUsuarioAdminInterface {
    void novoAdmin(UsuarioAdmin admin) throws AdminJaExisteException, LimiteAtingidoException;

    UsuarioAdmin procura(String CPF) throws AdminNaoExisteException;

    void deleta(String CPF) throws AdminNaoExisteException;

    void atualizaNome(String CPF, String nome) throws AdminNaoExisteException;

    void atualizaIdade(String CPF, int idade) throws AdminNaoExisteException;

    void atualizaTelefone(String CPF, String telefone) throws AdminNaoExisteException;

    void atualizaCEP(String CPF, String CEP) throws AdminNaoExisteException;

    void atualizaCodigoFuncionario(String CPF, String codigoFuncionario) throws AdminNaoExisteException;
}
