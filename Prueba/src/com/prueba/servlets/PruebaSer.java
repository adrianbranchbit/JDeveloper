package com.prueba.servlets;

import com.prueba.vo.EquipoVO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "PruebaSer", urlPatterns = { "/pruebaser" })
public class PruebaSer extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response); //Llamada al metodo doPost, cualquier peticion get es mandada a Post
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession(false);//Creear objeto
        response.setContentType(CONTENT_TYPE);
        try{
            EquipoVO equipo=new EquipoVO();
            String nombre=request.getParameter("nombre");
            String edad=request.getParameter("edad");
            String sexo=request.getParameter("sexo");
            
            equipo.setNombre(nombre);
            equipo.setEdad(edad);
            equipo.setSexo(sexo);
            
            System.out.println(equipo.getNombre());
            System.out.println(equipo.getEdad());
            System.out.println(equipo.getSexo());
            
            System.out.println(equipo.toString());
            
            session.setAttribute("equipo", equipo);
            response.sendRedirect(request.getContextPath()+"/prueba2.jsp");
        }catch(Exception e){
          e.printStackTrace();   
        }
        
    }
}
