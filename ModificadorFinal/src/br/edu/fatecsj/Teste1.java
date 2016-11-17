package br.edu.fatecsj;

public class Teste1 {

    private static final double CONSTANTE1 = 32.5; //Uma variável estática existe antes do objeto ser criado
    private final double CONSTANTE2;
    private static final double CONSTANTE3; //Também podemos inicializar uma variável estática num bloco de inicialização estático
    
    public Teste1(){
        //CONSTANTE = 32.2; //Erro
        CONSTANTE2 = 32.2; //Se a constante não for estática podemos inicializar no construtor
    }
    
    
   
    static{ //Bloco de estático
        CONSTANTE3 = 234.45;
    }
    
    
    //Constantes só tem o método get estático e não podemos usar "this" pois essa palavra faz referência ao objeto
    public static double getConstante1(){
        return CONSTANTE1; 
    }
    //Constantes só tem o método get estático e não podemos usar "this" pois essa palavra faz referência ao objeto
    public static double getConstante3(){
        return CONSTANTE3; 
    }
    
    
    public static void main(String[] args) {
        //Main.CONSTANTE1 = 23.5; Não podemos mudar o valor de uma variável com estática
    }
    
}
