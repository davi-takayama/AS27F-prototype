package utfpr.as27f;

import utfpr.as27f.classes.Cartao;
import utfpr.as27f.classes.CartaoCredito;
import utfpr.as27f.classes.CartaoDebito;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cartao> cartoes = new ArrayList<>();
        List<Cartao> cartoesClonados = new ArrayList<>();

        CartaoDebito cartaoDebito = new CartaoDebito();
        cartaoDebito.setSaldo(1000);
        cartaoDebito.setNumero("2050");
        cartaoDebito.setNome("Carlinhos");
        cartaoDebito.setValidade("12/2020");
        cartaoDebito.setCvv("123");

        cartoes.add(cartaoDebito);

        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.setLimite(2000);
        cartaoCredito.setNumero("42069");
        cartaoCredito.setNome("Dalva");
        cartaoCredito.setValidade("12/2020");
        cartaoCredito.setCvv("321");

        cartoes.add(cartaoCredito);

        cartoes.forEach(cartao -> cartoesClonados.add(cartao.clone()));

        System.out.println("Cartões originais:");
        cartoesClonados.forEach(System.out::println);
        System.out.println("\nCartões cromados:");
        cartoes.forEach(System.out::println);

        compararCartoesCromados(cartoes, cartoesClonados);

        cartoes.get(0).setNome("little carlos >:3");
        System.out.println("\nO nome do \"Carlinhos\" mudou pra \"little carlos >:3\"!!!\n");

        compararCartoesCromados(cartoes, cartoesClonados);
    }

    private static void compararCartoesCromados(List<Cartao> cartoes, List<Cartao> cartoesClonados) {
        for (int i = 0; i < cartoes.size(); i++)
            System.out.println(cartoes.get(i).equals(cartoesClonados.get(i)) ? "São enguais :O" : "São diferentes :(");
    }
}