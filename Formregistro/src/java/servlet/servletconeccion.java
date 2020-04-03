package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.persona;

/**
 *
 * @author liqui
 */
public class servletconeccion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    persona p = new persona();
    int acum = 1;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletconeccion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletconeccion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion;
        String nombrep, codp, nombrem, codm, fecha;
        accion = request.getParameter("accion");
        nombrep = request.getParameter("nombre");
        codp = request.getParameter("codi");
        nombrem = request.getParameter("nomm");
        codm = request.getParameter("codime");
        fecha = request.getParameter("fecha");
        if (accion.equals("enviar")) {

            if (acum == 4) {
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet servletconeccion</title>");
                    out.println("</head>");
                    out.println("<body>");
                    verificacion(nombrep, codp, nombrem, codm);
                    for (int i = 0; i <= acum; i++) {
                        out.println("<h1>nombre de paciente: " + returnlista().get(i) + " Codigo de paciente" + returnlista().get(2) + "</h1>");
                        out.println("<h1>Codigo de paciente" + returnlista().get(2) + "</h1>" + "<br>");

                    }

                    out.println("</body>");
                    out.println("</html>");
                    acum = 0;
                    limpiar();
                }

            }

            if (acum < 4) {
                request.getRequestDispatcher("index.html").forward(request, response);
                verificacion(nombrep, codp, nombrem, codm);
                acum++;

            }

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static java.util.List<java.lang.String> returnlista() {
        wservice.Servicio_Service service = new wservice.Servicio_Service();
        wservice.Servicio port = service.getServicioPort();
        return port.returnlista();
    }

    private static void verificacion(java.lang.String nombre, java.lang.String codigo, java.lang.String nombremedico, java.lang.String codigomedico) {
        wservice.Servicio_Service service = new wservice.Servicio_Service();
        wservice.Servicio port = service.getServicioPort();
        port.verificacion(nombre, codigo, nombremedico, codigomedico);
    }

    private static void limpiar() {
        wservice.Servicio_Service service = new wservice.Servicio_Service();
        wservice.Servicio port = service.getServicioPort();
        port.limpiar();
    }
}
