
package locadora.model;

import java.util.ArrayList;

public class Automovel {
    private int codAutomovel;
    private String placa;
    private String cor;
    private int nro_portas;
    private int tipo_combustivel;
    private long quilometragem;
    private long renavam;
    private String chassi;
    private double valor_locacao;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Automovel() {
    }

    public Automovel(String placa, String cor, int nro_portas, int tipo_combustivel, long quilometragem, long renavam, String chassi, double valor_locacao) {
        this.placa = placa;
        this.cor = cor;
        this.nro_portas = nro_portas;
        this.tipo_combustivel = tipo_combustivel;
        this.quilometragem = quilometragem;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public int getCodAutomovel() {
        return codAutomovel;
    }

    public void setCodAutomovel(int codAutomovel) {
        this.codAutomovel = codAutomovel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNro_portas() {
        
        return nro_portas;
    }

    public void setNro_portas(int nro_portas) {
        this.nro_portas = nro_portas;
    }

    public int getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(int tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public long getRenavam() {
        return renavam;
    }

    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
    


    public static ArrayList<Automovel> getAutomoveis(){
        ArrayList<Automovel> automoveis = new ArrayList();
        return automoveis;
    }

}
