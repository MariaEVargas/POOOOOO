/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Cliente {
    private int codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private ArrayList<Automovel> automoveis = new ArrayList<Automovel  >();
    
    public Cliente(){

    }
    
    public Cliente(String nome, String cpf, String email, String endereco){
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }


    public int getCodCliente() {
        
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
    
    public void cadastrarCliente (Cliente cliente){
        
    }
     
    public static ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> clientes = new ArrayList();
        return clientes;
    }
    
    
    
}
