package exercicio02;

public class Gerente extends Funcionario{

    // TODO: implemente o código desta classe
    double bonus;
    Gerente(String nome,double salario,double bonus){
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }
    public double salarioAnual(Gerente funcionario){
        double sal = funcionario.salario;
        return ((sal*13)+sal*(bonus/100));
    }
}
