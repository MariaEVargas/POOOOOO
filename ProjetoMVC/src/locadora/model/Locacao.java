/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author rober
 */
public class Locacao {
    private int codLocacao;
    private Date dt_locacao; 
    private Time hora_locacao;
    private Time dt_devolucao;
    private long quilometragem;
    private double valor_calcao;
    private double valor_devolvido;
    private int devolvido;
    
}
