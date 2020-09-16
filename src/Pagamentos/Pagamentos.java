package Pagamentos;

public  class Pagamentos {
    public static void main(String[] args) {
        Gerente g = new Gerente("Soraia", 5000, 2000);
        Vendedor v = new Vendedor("Enzo", 2000, 20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        relatorioPagamento.relatorioPagamentoGenerico(g);
        relatorioPagamento.relatorioPagamentoGenerico(v);
    }
}
