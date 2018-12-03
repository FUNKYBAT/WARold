package cadastros;
import arma.Arma;
import arma.ArmaJaExisteException;
import arma.InterfaceRepositoriosArma;
import arma.LimiteAtingidoException;
import arma.RepositorioArrayArma;
import arma.RepositorioListaArma;
import produto.InterfaceRepositoriosProduto;
import produto.PLimiteAtingidoException;
import produto.Produto;
import produto.ProdutoJaExisteException;
import produto.ProdutoNaoExisteException;
import produto.RepositorioArrayProduto;
import produto.RepositorioListaProduto;
import arma.ArmaNaoExisteException;


public class Cadastros {
	    private InterfaceRepositoriosProduto listaProduto;
	    private InterfaceRepositoriosArma listaArma;

	    public void cadastroProduto(boolean isProduto, boolean tipo) {
	        if(isProduto){
	            if(tipo){
	                this.listaProduto = new RepositorioListaProduto();
	            }else{
	                this.listaProduto = new RepositorioArrayProduto();
	            }
	        }else{
	            if(tipo){
	                this.listaArma = new RepositorioListaArma();
	            }else{
	                this.listaArma = new RepositorioArrayArma();
	            }
	        }
	    }

	    public void cadastrarProduto(Produto produto) throws  ProdutoJaExisteException, PLimiteAtingidoException{
	        this.listaProduto.CadastrarCatalogo(produto);
	    }

	    public void cadastrarArma(Arma arma) throws ArmaJaExisteException,  LimiteAtingidoException{
	        this.listaArma.CadastrarCatalogo(arma);
	    }

	    public void removerProduto(String nome) throws ProdutoNaoExisteException {
	        this.listaProduto.RemoverCatalogo(nome);
	    }

	    public void removerArma(String nome) throws ArmaNaoExisteException {
	        this.listaArma.RemoverCatalogo(nome);
	    }

	    public Produto procurarProduto (String nome) throws ProdutoNaoExisteException {
	        return this.listaProduto.Procurar(nome);
	    }

	    public Arma procurarArma (String nome) throws ArmaNaoExisteException {
	        return this.listaArma.Procurar(nome);
	    }

	    public boolean existeProduto (String nome) {
	        return this.listaProduto.Existe(nome);
	    }

	    public boolean existeArma (String nome) {
	        return this.listaArma.Existe(nome);
	    }

	    public void AtualizarPrecoProduto(String nome, double novoPreco) throws ProdutoNaoExisteException {
	        this.listaProduto.AtualizarPreco(nome,novoPreco);
	    }

	    public void AtualizarPrecoArma(String nome, double novoPreco) throws ArmaNaoExisteException {
	        this.listaArma.AtualizarPreco(nome,novoPreco);
	    }
	    
	    public void AtualizarEstrelasProduto(String nome, double novaAvaliacao) throws ProdutoNaoExisteException {
	        this.listaProduto.AtualizarEstrelas(nome, novaAvaliacao);
	    }

	    public void AtualizarEstrelasArma(String nome, double novaAvaliacao) throws ArmaNaoExisteException {
	        this.listaArma.AtualizarEstrelas(nome, novaAvaliacao);
	    }

	    public void atualizaDescricaoProduto (String nome, String novaDescricao) throws ProdutoNaoExisteException {
	        this.listaProduto.AtualizarDescricao(nome, novaDescricao);
	    }

	    public void atualizaDescricaoArma (String nome, String novaDescricao) throws ArmaNaoExisteException {
	        this.listaArma.AtualizarDescricao(nome, novaDescricao);
	    }

	    public void AtualizarQuantidadeProduto (String nome, int quantidade) throws ProdutoNaoExisteException {
	        this.listaProduto.AtualizarQuantidade(nome, quantidade);
	    }

	    public void AtualizarQuantidadeArma(String nome, int quantidade) throws ArmaNaoExisteException {
	        this.listaArma.AtualizarQuantidade(nome, quantidade);
	    }

	    public void ProcurarCategoriaArma(String categoria,int  x) throws ArmaNaoExisteException {
	        this.listaArma.ProcurarCategoria(categoria, x);
	    }

	    public void ProcurarCalibreArma(String calibre,int  x) throws ArmaNaoExisteException {
	        this.listaArma.ProcurarCalibre(calibre, x);
	    }
	    
	    public void ProcurarMunicaoArma(String municao,int  x) throws ArmaNaoExisteException {
	        this.listaArma.ProcurarMunicao(municao, x);
	    }
	
}
