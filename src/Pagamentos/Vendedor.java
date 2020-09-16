package Pagamentos;

public class Vendedor  extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas =  totalVendas;
    }
    public void setTotalVendas(double totalVendas){
        this.totalVendas = totalVendas;
    }
    public double getTotalVendas(){
        return this.totalVendas;
    }


    @Override
    public void calcularPagamento(){
        this.salario = this.salario + (totalVendas * 0.05);
    }
}

