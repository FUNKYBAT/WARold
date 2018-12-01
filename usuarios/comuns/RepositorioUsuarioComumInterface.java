package usuarios.comuns;

public interface RepositorioUsuarioComumInterface {
    void novoUsuario(UsuarioComum user) throws UsuarioJaExisteException;

    UsuarioComum procura(String CPF) throws UsuarioNaoExisteException;

    void deleta(String CPF) throws UsuarioNaoExisteException;

    void atualizaNome(String CPF, String nome) throws UsuarioNaoExisteException;

    void atualizaIdade(String CPF, int idade) throws UsuarioNaoExisteException;

    void atualizaTelefone(String CPF, String telefone) throws UsuarioNaoExisteException;

    void atualizaCEP(String CPF, String CEP) throws UsuarioNaoExisteException;

    void atualizaNumeroCartao(String CPF, String numeroCartao) throws UsuarioNaoExisteException;
}
