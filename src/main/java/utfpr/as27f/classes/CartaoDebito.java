package utfpr.as27f.classes;

public class CartaoDebito extends Cartao {
    private double saldo;

    public CartaoDebito() {
    }

    public CartaoDebito(CartaoDebito cartaoDebito) {
        super(cartaoDebito);
        if (cartaoDebito != null) {
            this.saldo = cartaoDebito.saldo;
        }
    }

    @Override
    public CartaoDebito clone() {
        return new CartaoDebito(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CartaoDebito cartao && super.equals(obj)))
            return false;
        return this.saldo == cartao.getSaldo();
    }

    @Override
    public String toString() {
        return "CartaoDebito {\n" +
                "  saldo=" + saldo + "\n" +
                "  nome='" + getNome() + ",\n" +
                "  numero='" + getNumero() + ",\n" +
                "  validade='" + getValidade() + ",\n" +
                "  cvv='" + getCvv() + ",\n" +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
