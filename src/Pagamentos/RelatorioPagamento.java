package Pagamentos;

public class RelatorioPagamento {
    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("============ NSF SETEMBRO ================");
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário deste mês: R$" + funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos lucros: R$" + g.getPnl());
        }
        if(funcionario instanceof Vendedor){
            Vendedor v = (Vendedor) funcionario;
            System.out.println("Total vendas: R$" + v.getTotalVendas());
        }
    }
}

