package exercicio02;

public abstract class Funcionario {
    // TODO: implemente o código desta classe
    String nome;
    double salario;

    public double salarioAnual(Funcionario funcionario){
        return funcionario.salario*13;
    }
}
