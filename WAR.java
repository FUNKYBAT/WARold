import cadastros.CadastroAdmin;
import cadastros.CadastroUsuario;
import usuarios.admins.ExceptionAdminJaExiste;
import usuarios.admins.ExceptionAdminNaoExiste;
import usuarios.admins.ExceptionLimiteAtingidoAdmin;
import usuarios.admins.UsuarioAdmin;
import usuarios.comuns.ExceptionLimiteAtingidoComum;
import usuarios.comuns.ExceptionUsuarioJaExiste;
import usuarios.comuns.ExceptionUsuarioNaoExiste;
import usuarios.comuns.UsuarioComum;

public class WAR {
    private CadastroAdmin admin;
    private CadastroUsuario usuario;

    public WAR(boolean tipo) {
        usuario = new CadastroUsuario(tipo);
        admin = new CadastroAdmin(tipo);
    }

    public void cadastrarUsuario(UsuarioComum user) throws ExceptionLimiteAtingidoComum, ExceptionUsuarioJaExiste {
        usuario.cadastrar(user);
    }

    public void removerUsuario(String CPF) throws ExceptionUsuarioNaoExiste {
        usuario.remover(CPF);
    }

    public UsuarioComum procurarUsuario(String CPF) throws ExceptionUsuarioNaoExiste {
        return usuario.procurar(CPF);
    }

    public boolean existeUsuario(String CPF) {
        return usuario.existe(CPF);
    }

    public void atualizarNomeUsuario(String CPF, String nome) throws ExceptionUsuarioNaoExiste {
        usuario.atualizaNome(CPF, nome);
    }

    public void atualizaIdadeUsuario(String CPF, int idade) throws ExceptionUsuarioNaoExiste {
        usuario.atualizaIdade(CPF, idade);
    }

    public void atualizaTelefoneUsuario(String CPF, String telefone) throws ExceptionUsuarioNaoExiste {
        usuario.atualizaTelefone(CPF, telefone);
    }

    public void atualizaCEPUsuario(String CPF, String CEP) throws ExceptionUsuarioNaoExiste {
        usuario.atualizaCEP(CPF, CEP);
    }

    public void atualizaNumeroCartao(String CPF, String numeroCartao) throws ExceptionUsuarioNaoExiste {
        usuario.atualizaNumeroCartao(CPF, numeroCartao);
    }

    public void cadastrarAdmin(UsuarioAdmin user) throws ExceptionLimiteAtingidoAdmin, ExceptionAdminJaExiste {
        admin.cadastrar(user);
    }

    public void removerAdmin(String CPF) throws ExceptionAdminNaoExiste {
        admin.remover(CPF);
    }

    public UsuarioAdmin procurarAdmin(String CPF) throws ExceptionAdminNaoExiste {
        return admin.procurar(CPF);
    }

    public boolean existeAdmin(String CPF) {
        return admin.existe(CPF);
    }

    public void atualizarNomeAdmin(String CPF, String nome) throws ExceptionAdminNaoExiste {
        admin.atualizaNome(CPF, nome);
    }

    public void atualizaIdadeAdmin(String CPF, int idade) throws ExceptionAdminNaoExiste {
        admin.atualizaIdade(CPF, idade);
    }

    public void atualizaTelefoneAdmin(String CPF, String telefone) throws ExceptionAdminNaoExiste {
        admin.atualizaTelefone(CPF, telefone);
    }

    public void atualizaCEPAdmin(String CPF, String CEP) throws ExceptionAdminNaoExiste {
        admin.atualizaCEP(CPF, CEP);
    }

    public void atualizarCodigoFuncionarioAdmin(String CPF, String codigo) throws ExceptionAdminNaoExiste {
        admin.atualizaCodigoFuncionario(CPF, codigo);
    }
}