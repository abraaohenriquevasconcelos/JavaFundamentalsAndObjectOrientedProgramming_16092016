package pacotePrincipal;

import java.util.ArrayList;


public class Pessoa {
    private ArrayList<Long> startingTime, endTime;
    private String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
        startingTime = new ArrayList<>();
        endTime = new ArrayList<>();
    }
    
    public void adicionaTempo(long inicio, long fim){
        startingTime.add(inicio);
        endTime.add(fim);
    }
    
    // {label: "person a", times: [
   //  {"starting_time": 1355752800000, "ending_time": 1355759900000},
  //   {"starting_time": 1355767900000, "ending_time": 1355774400000}]},

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{label: \""+nome+"\", times: [\n");
        for(int contador = 0; contador < startingTime.size(); contador++){
            sb.append("{\"starting_time\": "+startingTime.get(contador)+", \"ending_time\": "+endTime.get(contador)+"},\n");
        }
        sb.append("]},");
        return sb.toString();
    }
    
    
    public static void main(String args[]){
        
       
    }
 
}
