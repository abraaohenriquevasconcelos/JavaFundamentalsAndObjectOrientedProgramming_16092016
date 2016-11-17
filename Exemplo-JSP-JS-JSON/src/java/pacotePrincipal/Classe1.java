package pacotePrincipal;

import java.util.ArrayList;


public class Classe1 {
  
    public static int[] emiteArray(){
        int quantos = 8+(int)(Math.random()* 8);
        int[] inteiros  = new int[quantos];
        for(int cont = 0; cont < quantos; cont++)
            inteiros[cont] = (int)(Math.random()*200);
        return inteiros;
    }
    
    
    public static String arrayToString(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int contador = 0; contador < array.length; contador++)
            sb.append(array[contador]).append(",");
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
    
    public static void main(String[] args){
        System.out.println(arrayToString(emiteArray()));
        System.out.println(Math.random()*200);
    }
    
    
    
    
}
