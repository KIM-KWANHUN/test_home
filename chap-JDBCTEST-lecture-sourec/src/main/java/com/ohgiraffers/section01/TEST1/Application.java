package com.ohgiraffers.section01.TEST1;

import com.ohgiraffers.section01.employeeDTO.employeeDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.section01.common.JDBCTemplate.close;
import static com.ohgiraffers.section01.common.JDBCTemplate.getConnection;

public class Application {

    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        Properties prop = new Properties();

        employeeDTO emp = null;

        List<employeeDTO> emplist = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("직원의 번호를 입력해주세요 : ");
        int empId = sc.nextInt();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section01/mapper/menu-query.xml"));

            String query = prop.getProperty("TEST1");

            rset = pstmt.executeQuery(query);

            emplist = new ArrayList<>();

            while(rset.next()) {
                emp = new employeeDTO();
                emp.setEMP_ID(rset.getInt("EMP_ID"));
                emp.setEMP_NAME(rset.getString("EMP_NAME"));
                emp.setEMP_NO(rset.getString("EMP_NO"));
                emp.setEMAIL(rset.getString("EMAIL"));
                emp.setPHONE(rset.getString("PHONE"));
                emp.setDEPT_CODE(rset.getString("DEPT_CODE"));
                emp.setJOB_CODE(rset.getString("JOB_CODE"));
                emp.setSAL_LEVEL(rset.getString("SAL_LEVEL"));
                emp.setSALARY(rset.getInt("SALARY"));
                emp.setBONUS(rset.getDouble("BONUS"));
                emp.setMANAGER_ID(rset.getString("MANAGER_ID"));
                emp.setHIRE_DATE(rset.getDate("HIRE_DATE"));
                emp.setENT_DATE(rset.getDate("ENT_DATE"));
                emp.setENT_YN(rset.getBoolean("ENT_YN"));
                emplist.add(emp);
            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(con);
            close(pstmt);
            close(rset);

        }
        for(employeeDTO emp : emplist) {
            System.out.println("emplist = " + emplist);
        }

    }
}
