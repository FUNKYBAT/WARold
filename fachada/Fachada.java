package Fachada;

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
import fornecedores.Fornecedor;
import fornecedores.CadastroFornecedor;
import fornecedores.ExceptionFJC;
import fornecedores.ExceptionFNE;

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
	
    public void inserirFornecedor(String marca) throws ExceptionFJC {
        admin.inserirFornecedor(marca);
    }
	
    public void deletarFornecedor(String marca) throws ExceptionFNE {
        admin.deletarFornecedor(marca);
    }
}
/*
import Outros.EVException;
import Outros.PJIException;
import Outros.PNEException;
import Pessoa.Cliente;
import Pessoa.Fornecedor;
import Pessoa.InterfaceCliente;
import Pessoa.NegocioCliente;
import Pessoa.NegocioFornecedor;
import Produto.Negocio;
import Produto.Produto;
import Venda.Venda;

public class Fachada {
	public void inserirCliente(Cliente nome, NegocioCliente negocioCliente) throws PNEException, EVException{
		boolean b = negocioCliente.procurarCliente(nome);
		if(!b) {
		negocioCliente.inserirCliente(nome);
		}
	}
	public void removerCliente(Cliente nome, NegocioCliente negocioCliente) throws PNEException {
		negocioCliente.removerCliente(nome);
	}
	//negocioCliente -> repositorio
	public void procurarCliente(Cliente nome, NegocioCliente negocioCliente) throws PNEException, EVException {
		negocioCliente.procurarCliente(nome);
		//Cliente não encontrado
	}
	public void inserirProduto(Produto nome, Negocio negocioProduto) throws PJIException, PNEException, EVException {
		boolean a = negocioProduto.procurarProduto(nome);
		if (!a) {
			negocioProduto.inserirProduto(nome);
		} else {
			//ERRO
		}
	}
	public void removerProduto(Produto nome, Negocio negocioProduto) throws PNEException, EVException, PJIException {
		boolean a = negocioProduto.procurarProduto(nome);
		if (!a) {
			negocioProduto.inserirProduto(nome);
		} else {
			//ERRO
		}
	}
	//PROCURAR????
	public void inserirFornecedor(Fornecedor nome, NegocioFornecedor negocioFornecedor) throws PNEException, EVException{
		boolean b = negocioFornecedor.procurarFornecedor(nome);
		if(!b) {
		negocioFornecedor.inserirFornecedor(nome);
		}
	}
	public void removerFornecedor(Fornecedor nome, NegocioFornecedor negocioFornecedor) throws PNEException, EVException {
		boolean b = negocioFornecedor.procurarFornecedor(nome);
		if(!b) {
		negocioFornecedor.removerFornecedor(nome);
		}
	}
	//negocioCliente -> repositorio
	public void procurarFornecedor(Fornecedor nome, NegocioFornecedor negocioFornecedor) throws PNEException, EVException {
		negocioFornecedor.procurarFornecedor(nome);
		//Fornecedor não encontrado
	}
	//Metodos de venda
	public void inserirItem(Produto prod, int quantidade, Venda vendaCliente) {
		
	}

}*/
