package br.edu.fatecsj;


public class Teste4 {
    public static void main(String[] args){
        Teste2 teste2 = new Teste2();
        System.out.println(teste2.getTeste3());
        teste2.getTeste3().setNome("juju"); //Podemos alterar os valores dentro do objeto
        System.out.println(teste2.getTeste3());
        
        //teste2.te3 = new Teste3(); //Não podemos criar uma novo objeto para uma variável de referência final
    }
}
