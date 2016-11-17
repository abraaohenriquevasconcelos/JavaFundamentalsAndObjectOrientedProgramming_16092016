package pacotePrincipal;

import java.util.ArrayList;


public class ListaDePessoas {
    private ArrayList<Pessoa> lista;
    
    public ListaDePessoas(){
        lista = new ArrayList<>();
        
    }
    
    public void adicionaPessoa(Pessoa p){
        lista.add(p);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Pessoa pessoa : lista)
            sb.append(pessoa.toString());
        sb.append("];");
	return sb.toString();
    }
    
    public static void main(String[] args){
        Pessoa joao = new Pessoa("Joao");
        joao.adicionaTempo(1355752800000l, 1355759900000l);
        joao.adicionaTempo(1355753800000l, 1355859900000l);
        Pessoa maria = new Pessoa("Maria");
        maria.adicionaTempo(1355752900000l, 1355769900000l);
        
        ListaDePessoas listaDePessoas = new ListaDePessoas();
        listaDePessoas.adicionaPessoa(joao);
        listaDePessoas.adicionaPessoa(maria);
        
            System.out.println(listaDePessoas.toString());
    }
}
