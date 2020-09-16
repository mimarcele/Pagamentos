package Pagamentos;

public abstract class Funcionario {
    protected String nome;
    protected double salario;



    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    @Override
    public String toString(){
        return "Funcionario{" +
                "nome=' " + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    public abstract void calcularPagamento();

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}



