package br.edu.fatecsj;


public class Teste6 extends Teste2{
    
    @Override
    public double dobro(double d){
        return super.dobro(d)+1;
    }
    
//    @Override
//    public double triplo(double d){
//        return super.dobro(d)+1;
//    }
    
    public static void main(String[] args){
        Teste2 teste2 = new Teste2();
        System.out.println(teste2.dobro(4));
        Teste6 teste6 = new Teste6();
        System.out.println(teste6.dobro(4));        
    }
}
