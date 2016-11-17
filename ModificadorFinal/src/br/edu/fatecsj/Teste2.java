package br.edu.fatecsj;

public class Teste2 {
    private final Teste3 teste3 = new Teste3();//O que acontece com quando voce usá "final" e um objeto/variável de referência
    public final Teste3 te3 = new Teste3();//O que acontece com quando voce usá "final" e um objeto/variável de referência

    public Teste3 getTeste3() {
        return teste3;
    }

    public Teste3 getTe3() {
        return te3;
    }
    
    public double dobro(double d){ 
        return d*2;
    }
    
    public final double triplo(double d){
        return d*3;
    }
    
}
