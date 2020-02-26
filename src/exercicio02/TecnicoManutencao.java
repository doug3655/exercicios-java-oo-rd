package exercicio02;

public class TecnicoManutencao extends Funcionario{

    // TODO: implemente o código desta classe
    double bonus;
    double insalubridade;
    TecnicoManutencao(){

    }
    TecnicoManutencao(String nome,double salario,double bonus,double insalubridade){
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
        this.insalubridade = insalubridade;
    }

    public double salarioAnual(TecnicoManutencao funcionario){
        double sal = funcionario.salario;
        return (sal+(sal*(funcionario.insalubridade/100))*13+bonus);
    }
}
