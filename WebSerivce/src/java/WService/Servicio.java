/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WService;

import java.io.IOException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author liqui
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    ArrayList<String> lista=new ArrayList<>();
    @WebMethod(operationName = "verificacion")
    public void verificacion(@WebParam(name = "nombre") String nombre, @WebParam(name = "codigo") String codigo, @WebParam(name = "nombremedico") String nombremedico, @WebParam(name = "codigomedico") String codigomedico){
            lista.add(nombre+" "+ codigo+"doctor que atiende"+nombremedico+" "+codigomedico);
    }
    
    public ArrayList<String> returnlista(){
        return lista;
    }
    public void limpiar(){
        lista.clear();
    }

}
