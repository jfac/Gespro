/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tsp.gespro.hibernate.dao;

import com.tsp.gespro.hibernate.pojo.UsuarioMonitor;

/**
 *
 * @author oem
 */
public class UsuarioMonitorDAOTestMail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuarioMonitor usr = new UsuarioMonitor();
        usr.setEmail("athiecampollo@gmail.com");
        usr.setNombre("Dragoonpunk");
        usr.setPassword("Pwd");
        usr.setApellidoPaterno("Karma");
        usr.setApellidoMaterno("Dragon");
        usr.setId(1);
        UsuarioMonitorDAO monitor = new UsuarioMonitorDAO();
        monitor.enviarCorreoConCredenciales(usr);
    }
    
}
