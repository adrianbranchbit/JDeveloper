package com.prueba.vo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

public class Conexion {
    public Conexion() {
        super();
    }

    static Statement st = null;
    static ResultSet rs = null;


    public static void main(String[] args) throws NamingException {

        DataSource dataSource = null;
        Connection cn;
        try {
            Properties env = new Properties();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
            env.put(Context.PROVIDER_URL, "t3://127.0.0.1:7101");
            env.put(Context.SECURITY_PRINCIPAL, "weblogic");
            env.put(Context.SECURITY_CREDENTIALS, "weblogic01");

            Context jndi = new InitialContext(env);
            dataSource = (DataSource) jndi.lookup("jndi/prueba");     
            
            System.out.println("Source " + dataSource);
            cn = dataSource.getConnection();
            System.out.println("conexion "+cn);
            
          
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

    }
}
