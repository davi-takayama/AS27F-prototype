package utfpr.as27f.classes;

public abstract class Cartao {
    private String nome;
    private String numero;
    private String validade;
    private String cvv;

    public Cartao() {
    }

    public Cartao(Cartao cartao) {
        if (cartao != null) {
            this.nome = cartao.getNome();
            this.numero = cartao.getNumero();
            this.validade = cartao.getValidade();
            this.cvv = cartao.getCvv();
        }
    }

    public abstract Cartao clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cartao cartao))
            return false;
        return this.nome.equals(cartao.getNome()) &&
                this.numero.equals(cartao.getNumero()) &&
                this.validade.equals(cartao.getValidade()) &&
                this.cvv.equals(cartao.getCvv());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
