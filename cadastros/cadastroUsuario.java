package cadastros;

import usuarios.admins.*;
import usuarios.comuns.*;
import usuarios.comuns.ExceptionLimiteAtingidoComum;

public class cadastroUsuario {
    private RepositorioUsuarioAdminInterface listaAdmin;
    private RepositorioUsuarioComumInterface listaComum;

    public cadastroUsuario(boolean isAdmin, boolean tipo) {
        if(isAdmin){
            if(tipo){
                this.listaAdmin = new RepositorioUsuarioAdminLista();
            }else{
                this.listaAdmin = new RepositorioUsuarioAdminArray();
            }
        }else{
            if(tipo){
                this.listaComum = new RepositorioUsuarioComumLista();
            }else{
                this.listaComum = new RepositorioUsuarioComumArray();
            }
        }
    }

    public void cadastrarAdmin(UsuarioAdmin admin) throws ExceptionLimiteAtingidoAdmin, ExceptionAdminJaExiste {
        this.listaAdmin.inserir(admin);
    }

    public void cadastrarUsuarioComum(UsuarioComum user) throws ExceptionLimiteAtingidoComum, ExceptionUsuarioJaExiste{
        this.listaComum.inserir(user);
    }

    public void removerAdmin(String cpf) throws ExceptionAdminNaoExiste {
        this.listaAdmin.deletar(cpf);
    }

    public void removerUsuarioComum(String cpf) throws ExceptionUsuarioNaoExiste {
        this.listaComum.deletar(cpf);
    }

    public UsuarioAdmin procurarAdmin (String cpf) throws ExceptionAdminNaoExiste {
        return this.listaAdmin.procurar(cpf);
    }

    public UsuarioComum procurarUsuarioComum (String cpf) throws ExceptionUsuarioNaoExiste {
        return this.listaComum.procurar(cpf);
    }

    public boolean existeAdmin (String cpf) {
        return this.listaAdmin.existe(cpf);
    }

    public boolean existeComum (String cpf) {
        return this.listaComum.existe(cpf);
    }

    public void atualizaNomeAdmin(String CPF, String nome) throws ExceptionAdminNaoExiste {
        this.listaAdmin.atualizaNome(CPF, nome);
    }

    public void atualizaNomeComum(String CPF, String nome) throws ExceptionUsuarioNaoExiste {
        this.listaComum.atualizaNome(CPF, nome);
    }
    
    public void atualizaIdadeAdmin(String CPF, int idade) throws ExceptionAdminNaoExiste {
        this.listaAdmin.atualizaIdade(CPF, idade);
    }

    public void atualizaIdadeComum(String CPF, int idade) throws ExceptionUsuarioNaoExiste {
        this.listaComum.atualizaIdade(CPF, idade);
    }

    public void atualizaTelefoneAdmin(String CPF, String telefone) throws ExceptionAdminNaoExiste {
        this.listaAdmin.atualizaTelefone(CPF, telefone);
    }

    public void atualizaTelefoneComum(String CPF, String telefone) throws ExceptionUsuarioNaoExiste {
        this.listaComum.atualizaTelefone(CPF, telefone);
    }

    public void atualizaCEPAdmin(String CPF, String CEP) throws ExceptionAdminNaoExiste {
        this.listaAdmin.atualizaCEP(CPF, CEP);
    }

    public void atualizaCEPComum(String CPF, String CEP) throws ExceptionUsuarioNaoExiste {
        this.listaComum.atualizaCEP(CPF, CEP);
    }

    public void atualizaCodigoFuncionarioAdmin(String CPF, String codigo) throws ExceptionAdminNaoExiste {
        this.listaAdmin.atualizaCodigoFuncionario(CPF, codigo);
    }

    public void atualizaNumeroCartaoComum(String CPF, String numero) throws ExceptionUsuarioNaoExiste {
        this.listaComum.atualizaNumeroCartao(CPF, numero);
    }
}
