/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author aluno
 */
public class VeiculoControlle {private final Conexao bd;
    public VeiculoControlle() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }
    
    public void insert (VeiculoControlle v) throws SQLException{
    try (PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO Veiculo (Cadastro, Placa) VALUES (?, ?)")) {
        stmt.setInt(1, v.getCadastro());
        stmt.setString(2, v.getPlaca());
        
        stmt.execute();
    }
    }
    
    public void select (VeiculoControlle v) throws SQLException{
    }
    
    public void delete (VeiculoControlle v) throws SQLException{
    }
    
    public void getById(VeiculoControlle v) throws SQLException{
    }
    
    public void getAllRows(VeiculoControlle v) throws SQLException{
    }
    
    public void getByNome(VeiculoControlle v) throws SQLException{
    }

    private int getCadastro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPlaca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
