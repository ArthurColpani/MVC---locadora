/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class ClienteControlle {
    
    private final Conexao bd;
    public ClienteControlle() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }
    
    
    public void insert (Cliente c) throws SQLException {
        
        try (PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO Cliente (Nome, Estado, Cidade, CEP, CPF, RG) VALUES (?, ?, ?, ?,?,?)")) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEstado());
            stmt.setString(3, c.getCidade());
            stmt.setInt(4, c.getCEP());
            stmt.setInt(5, c.getCPF());
            stmt.setString(6, c.getRG());
            
            stmt.execute();
        }
    }
    
    public void select (Cliente c) throws SQLException {
        try (PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE Nome = ?, Estado = ?, Cidade = ?, CEP = ?, CPF = ?, RG = ? SET  WHERE id = ?")) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEstado());
            stmt.setString(3, c.getCidade());
            stmt.setInt(4, c.getCEP());
            stmt.setInt(5, c.getCPF());
            stmt.setString(6, c.getRG());
            
            
            stmt.execute();
        }       
    }
    
    public void delete (int id) throws SQLException{
        try (PreparedStatement stmt = bd.getConn().prepareStatement("DELETE * FROM clientes WHERE id = ? ")) {
            stmt.setInt(1, id);
            stmt.execute();
        } 
    }
    
    public Cliente getById(int id) throws SQLException, Exception{
        
        Cliente c = null;
        
        try (PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM carro WHERE id = ? ")) {
            stmt.setInt(1, id);
            
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                c = new Cliente();
                
                c.setId(Integer.parseInt(rs.getString("id")));
                
                
            }
        }
        
        return c;
    }
    
    public ArrayList<Cliente> getAllRows() throws SQLException, Exception{
       
        ArrayList<Cliente> lista_clientes = new ArrayList<>();
        
        try (PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM clientes ")) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Cliente c = new Cliente();
                
                c.setId(Integer.parseInt(rs.getString("id")));
                c.setNome(rs.getString("Nome"));
                c.setEstado(rs.getString("Estado"));
                c.setCidade(rs.getString("Cidade"));
                c.setCEP(rs.getInt("CEP"));
                c.setCPF(rs.getInt("CPF"));
                c.setRG(rs.getString("RG"));
                
                lista_clientes.add(c);
            }
        }
        
        return lista_clientes;
    }
    
    public void getByNome(Cliente c) throws SQLException{
    }
    
    
}
