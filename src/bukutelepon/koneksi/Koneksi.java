/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutelepon.koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author bpptk
 */
public class Koneksi {

    static Connection con;

    public static Connection connection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("buku_telepon");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return con;
    }

}
