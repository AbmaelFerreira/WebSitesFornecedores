

package br.com.lista.controller;

import br.com.lista.dao.Dao;
import br.com.lista.dao.PesquisaDao;
import br.com.lista.model.Lista;


import java.sql.SQLException;

/**
 *
 * @author Abmael
 */
public class PesquisaController extends Dao<Lista>{


   @Override   
    public boolean cadastrar (Lista lista) throws SQLException {
        boolean resultado = false;
        
        PesquisaDao pesquisadao = new PesquisaDao();
        
        if(pesquisadao.cadastrar(lista)){
            resultado = true;
        }
        return false;
    }

    @Override
    public boolean atualizar(Lista pojo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Lista pojo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getId(Lista lista) throws SQLException {
       PesquisaDao pesquisadao = new PesquisaDao();
       return pesquisadao.getId(lista);
    }

  
    
    


}

    
// public ArrayList<Lista2> bucarLista() throws SQLException, ClassNotFoundException{
//        return PesquisaDao.buscarLista();
//        
//        
//    }