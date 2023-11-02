package utfpr.as27f.classes;

public class CartaoCredito extends Cartao {
    private double limite;

    public CartaoCredito() {
    }

    public CartaoCredito(CartaoCredito cartaoCredito) {
        super(cartaoCredito);
        if (cartaoCredito != null) {
            this.limite = cartaoCredito.limite;
        }
    }

    @Override
    public CartaoCredito clone() {
        return new CartaoCredito(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CartaoCredito cartao && super.equals(obj)))
            return false;
        return this.limite == cartao.getLimite();
    }

    @Override
    public String toString() {
        return "CartaoCredito {\n" +
                "  limite=" + limite + "\n" +
                "  nome='" + getNome() + ",\n" +
                "  numero='" + getNumero() + ",\n" +
                "  validade='" + getValidade() + ",\n" +
                "  cvv='" + getCvv() + ",\n" +
                '}';
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
