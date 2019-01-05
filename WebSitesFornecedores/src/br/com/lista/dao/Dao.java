/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista.dao;

import br.com.lista.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;



/* @author Abmael */
public abstract class Dao<Entity> {
    
    
    protected Connection obterConexao ()throws SQLException{
        return ConnectionFactory.getConexao();
    }
    public abstract boolean cadastrar (Entity pojo) throws SQLException;
    public abstract boolean atualizar (Entity pojo) throws SQLException;
    public abstract boolean excluir (Entity pojo) throws SQLException;
    public abstract Integer getId (Entity pojo) throws SQLException;
    
}
