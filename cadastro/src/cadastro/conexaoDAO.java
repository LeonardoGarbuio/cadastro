package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class conexaoDAO {
    
    String url = "jdbc:mariadb://localhost:3306/registro?user=root&password=202330";

    public Connection conectaBD() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "Conexão OK");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }  

    public void save(Usuario user) { 
        String sql = "INSERT INTO cadastro(nome,cpf,email,telefone,dataNasc) VALUES (?,?,?,?,?)"; 
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = DriverManager.getConnection(url);
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getNome()); 
            pstm.setString(2, user.getCpf());
            pstm.setString(3, user.getEmail());
            pstm.setString(4, user.getTelefone());
            pstm.setString(5, user.getDataNasc());
            pstm.execute();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if(pstm != null) pstm.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
       
       
    }
       
}
