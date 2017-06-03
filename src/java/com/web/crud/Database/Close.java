/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.crud.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Close {

    public static void close(PreparedStatement ps, ResultSet rs) {
        try {
            
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void close(PreparedStatement ps) {
        try {
            
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
    }

}
