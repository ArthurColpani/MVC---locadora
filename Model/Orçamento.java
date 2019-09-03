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
public class Orçamento {
    
    int id;
    Date DataInicio, DataTermino;
    float ValorDiaria, ValorTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public Date getDataTermino() {
        return DataTermino;
    }

    public void setDataTermino(Date DataTermino) {
        this.DataTermino = DataTermino;
    }

    public float getValorDiaria() {
        return ValorDiaria;
    }

    public void setValorDiaria(float ValorDiaria) {
        this.ValorDiaria = ValorDiaria;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
    
}
