/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.model.Automovel;

/**
 *
 * @author rober
 */
public class AutomovelController {
    public boolean cadastrarAutomovel(String nome, String placa, String cor, int nro_portas, int tipo_combustivel, 
        long quilometragem, long renavam, String chassi, double valor_locacao){
            
        if(nome != null && nome.length() >0 && placa != null && placa.length()> 0 && cor != null && 
        cor.length() > 0 && nro_portas != null && nro_portas.length() > 0 && tipo_combustivel != null &&
        tipo_combustivel > 0 && quilometragem != null && renavam != null && renavam.length() > 0 && chassi != null &&
        valor_locacao != null && valor_locacao.length() > 0){
            Automovel automovel = new Automovel(nome, placa, cor, nro_portas, tipo_combustivel, quilometragem,
            renavam, chassi, valor_locacao);
            automovel.cadastrarAutomovel(automovel);
            return true;
        }
        return false;
    }
    
     public static ArrayList<String[]> getAutomovel(){
        ArrayList<String[]> automoveis = new ArrayList();
        
        ArrayList<Automovel> A = Automovel.getAutomoveis();
        
        for(int i = 0; i< A.size(); i++){
            String a[] = new String[4];
            a[0] = A.get(i).getPlaca();
            a[1] = A.get(i).getCor();
            a[2] = A.get(i).getNro_portas();
            a[3] = A.get(i).getTipo_combustivel();
            a[4] = A.get(i).getQuilometragem(); 
            a[5] = A.get(i).getRenavam();
            a[6] = A.get(i).getChassi();
            a[7] = A.get(i).getValor_locacao();
            
            Automovel.add(a);
        }
        return automoveis;
}
}
    