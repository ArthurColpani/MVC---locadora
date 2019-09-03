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
public class Entrada {
    
    int id;
    float Valor;
    Date DataEntrada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public Date getDataEntrada() {
        return DataEntrada;
    }

    public void setDataEntrada(Date DataEntrada) {
        this.DataEntrada = DataEntrada;
    }
    
    
    
}
