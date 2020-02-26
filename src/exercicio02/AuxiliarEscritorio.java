package exercicio02;

public class AuxiliarEscritorio extends Funcionario{
    // TODO: implemente o código desta classe
   double bonus;
   AuxiliarEscritorio(){

   }
   AuxiliarEscritorio(String nome,double salario,double bonus){
       this.nome = nome;
       this.salario = salario;
       this.bonus = bonus;
   }

   public double salarioAnual(AuxiliarEscritorio funcionario){
       return funcionario.salario*13+bonus;
   }
}
