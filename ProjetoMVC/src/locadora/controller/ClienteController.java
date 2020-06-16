/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import java.util.ArrayList;
import java.util.List;
import locadora.model.Cliente;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author medua
 */
public class ClienteController extends AbstractTableModel{
    
    public boolean cadastrarCliente(String nome, String cpf, String email, String endereco){
        
        if(nome != null && nome.length()>0 && validarCPF(cpf) && email != null && email.length()>0 && endereco != null && endereco.length()>0){
            Cliente cliente = new Cliente(nome, cpf, email, endereco);
            cliente.cadastrarCliente(cliente);
            return true;
        }
    return false;
    }
    
    public boolean validarCPF(String cpf){
        for(int i = 0; i < cpf.length(); i++){
            if(!Character.isDigit(cpf.charAt(i))){
                if(!( i == 3 || i == 7 || i == 11)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static ArrayList<String[]> getClientes(){
        ArrayList<String[]> Clientes = new ArrayList();
        
        ArrayList<Cliente> C = Cliente.getClientes();
        
        for(int i = 0; i< C.size(); i++){
            String c[] = new String[4];
            c[0] = C.get(i).getNome();
            c[1] = C.get(i).getCpf();
            c[2] = C.get(i).getEmail();
            c[3] = C.get(i).getEndereco(); 
            Clientes.add(c);
        }
        return Clientes;
    }
    
    private List<Cliente> linhas;
    private String[] colunas = new String[]{"codCliente", "nome", "cpf", "email", "endereco"};
    
    public ClienteController(){
        linhas = new ArrayList<Cliente>();
    }
    
    public ClienteController(List<Cliente> lista){
        linhas = new ArrayList<Cliente>(lista);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente c = linhas.get(rowIndex);
        
        switch (columnIndex){
            case 0:
                return c.getNome();
            case 1:
                return c.getCpf();
            case 2:
                return c.getEmail();
            case 3:
                return c.getEndereco();
            default: 
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    

}
