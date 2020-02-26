package exercicio03;

// TODO: implemente o código-fonte de Perfumaria.java
public  class Perfumaria extends Produto{
    double precoPromocional;
    Perfumaria(int id,String nome,double precoVenda,double desconto,double precoPromocional){
        if (precoVenda>0){
            if(precoPromocional>0&&precoPromocional<precoVenda){
                if(desconto>0&&desconto<100){
                    this.id=id;
                    this.nome=nome;
                    this.precoVenda=precoVenda;
                    this.desconto=desconto;
                    this.precoPromocional=precoPromocional;
                }
            }
        }
    }
}