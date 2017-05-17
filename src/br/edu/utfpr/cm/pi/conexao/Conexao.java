/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static java.sql.Connection conexao = null;
    private static org.postgresql.Driver postgresql;

    public static java.sql.Connection getConnection() throws SQLException {
        String conecaoPostgres = "jdbc:postgresql://localhost" + "/?user=" + HibernateUtil.getUser()
                + "&password=" + HibernateUtil.getPass();
        if (conexao == null) {
            postgresql = new org.postgresql.Driver();
            
            conexao = DriverManager.getConnection(conecaoPostgres);
        }
        return conexao;
    }
}

    