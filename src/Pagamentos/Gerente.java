package Pagamentos;

public class Gerente extends Funcionario{
    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }
    @Override
    public void calcularPagamento() {
        this.salario = salario + pnl;

    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
    public double getPnl(){
        return this.pnl;
    }


}
