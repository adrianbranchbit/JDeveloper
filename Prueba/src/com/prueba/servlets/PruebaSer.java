package com.prueba.servlets;


import com.prueba.vo.EquipoVO;

import java.io.DataInputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@MultipartConfig
@WebServlet(name = "PruebaSer", urlPatterns = { "/pruebaser" })
public class PruebaSer extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response); //Llamada al metodo doPost, cualquier peticion get es mandada a Post
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); //Creear objeto
        response.setContentType(CONTENT_TYPE);
        try {
            String nombre = request.getParameter("nombre");
            String edad = request.getParameter("edad");
            String sexo = request.getParameter("sexo");
            EquipoVO equipo = new EquipoVO();

            equipo.setNombre(nombre);
            equipo.setEdad(edad);
            equipo.setSexo(sexo);
            
            //Recibir archivo
            Part archivo = request.getPart("archivo");
            int tamaño = 0;
            tamaño = (int) archivo.getSize();
            //Obtener nombre del archivo
            String nombreArc=archivo.getSubmittedFileName();
            equipo.setNombreArchivo(nombreArc);

            byte[] fileBytes = null;
            //Libreria externa
            Base64 base64 = new Base64();

            if (tamaño > 0) {
                //Llenar el array de bytes
                fileBytes = new byte[tamaño];
                String encodeFile = "";
                
                //Se lee el archivo 
                DataInputStream dis = new DataInputStream(archivo.getInputStream());
                dis.readFully(fileBytes);
                //Se codifica
                encodeFile = base64.encodeToString(fileBytes);
               equipo.setBase64(encodeFile);
            }


            System.out.println("Tamaño: " + tamaño);
            System.out.println(nombre);
            session.setAttribute("equipo", equipo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect(request.getContextPath() + "/prueba2.jsp");
    }
}
