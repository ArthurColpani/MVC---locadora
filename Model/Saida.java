/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Saida {
    
    int id;
    float valor;
    Date DataSaida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataSaida() {
        return DataSaida;
    }

    public void setDataSaida(Date DataSaida) {
        this.DataSaida = DataSaida;
    }
    
}
