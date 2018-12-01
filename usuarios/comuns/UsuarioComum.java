package usuarios.comuns;

public class UsuarioComum extends usuarios.Usuario {

    protected String numeroCartao;

    public UsuarioComum(String nome, int idade, String CPF, String telefone, String CEP, String numeroCartao) {
        super(nome, idade, CPF, telefone, CEP);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}