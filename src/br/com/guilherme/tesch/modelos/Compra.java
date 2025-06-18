package br.com.guilherme.tesch.modelos;

public class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, int valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString(){
        return String.format("""
                Compra:
                Descrição = %s
                valor = %.2f
                """, descricao, valor);
    }
}
