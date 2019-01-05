

package br.com.lista.dao;

import br.com.lista.model.Lista;
import br.com.lista.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abmael
 */
public class PesquisaDao extends Dao<Lista> {

    
//    public static ArrayList<Lista> buscarLista() throws SQLDataException, SQLException{
//        ArrayList<Lista> listaAux = new ArrayList<>();
//        String sql = "select * from LISTA";
//                 
//        Connection conn = ConnectionFactory.getConexao();
//        PreparedStatement ps = conn.prepareStatement(sql);
//               
//        ResultSet rs = ps.executeQuery();
//               
//        while(rs.next())
//        {
//           Lista lista = new Lista();
//            
//            lista.setId(rs.getInt("id"));
//            lista.setEmpresa(rs.getString("empresa"));
//            lista.setForma(rs.getString("forma"));
//            lista.setWebsite(rs.getString("website"));
//            lista.setProdutos(rs.getString("produtos"));
//            
//            
//            
//            listaAux.add(lista);
//        }
//       return listaAux;
//        
//    }

    @Override
    public boolean cadastrar(Lista lista) throws SQLException {
        
        PreparedStatement ps = null;
        String sql = "insert into Lista (id,empresa,forma, marca, website, produtos)"
                +" values (pesquisa_produto_seq.nextval,?,?,?,?,?)";
        
        try{
            Connection conn = this.obterConexao();
            
            try{
                ps = conn.prepareStatement(sql);
                ps.setString(1, lista.getEmpresa());
                ps.setString(2, lista.getForma());
                ps.setString(3, lista.getMarca());
                ps.setString(4, lista.getWebsite());
                ps.setString(5, lista.getProdutos());
                
                
                ps.executeUpdate();
            }finally{
                try{
                    ConnectionFactory.closeConnectio(conn,ps);
                   
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        }catch(SQLException e){
             e.printStackTrace();
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

    public Integer getId(Lista lista) throws SQLException {
        PreparedStatement ps = null;
        Integer id = null;
        
        String sql = "select id from Lista where id = ?";
        
        try{
            Connection conn = this.obterConexao();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,lista.getId());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                lista.setId(rs.getInt("id"));
                id = lista.getId();
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return id;
    }

   
   
}
