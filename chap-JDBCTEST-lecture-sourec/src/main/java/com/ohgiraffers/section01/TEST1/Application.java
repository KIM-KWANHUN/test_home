package com.ohgiraffers.section01.TEST1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.section01.common.Teplete.close;
import static com.ohgiraffers.section01.common.Teplete.getConnection;

public class Application {

    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        Properties prop = new Properties();


        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section01/mapper/menu-query.xml"));

            String query = prop.getProperty("TEST6");

            pstmt = con.prepareStatement(query);

            rset = pstmt.executeQuery();

            while (rset.next()) {
                System.out.println(rset.getString("EMP_ID")+
                        " "+rset.getString("EMP_NAME")+
                        " "+rset.getDate("HIRE_DATE"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
           close(con);
           close(rset);
           close(pstmt);
        }

    }
}
