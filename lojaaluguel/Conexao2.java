package com.mycompany.lojaaluguel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao2 {
    private static final String URL = "jdbc:mysql://localhost:3306/lojaLocacao";
    private static final String USER = "root";
    private static final String PASSWORD = "gustavo10";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void desconectar(Connection conexao) throws SQLException {
        if (conexao != null && !conexao.isClosed()) {
            conexao.close();
        }
    }
}