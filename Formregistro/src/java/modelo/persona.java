package modelo;

import javax.swing.JOptionPane;

public class persona {

    int acumulador;
    String nombre, codigo, nombremedico, codigomedico;

    public persona() {
    }

    public persona( String nombre, String codigo, String nombremedico, String codigomedico) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nombremedico = nombremedico;
        this.codigomedico = codigomedico;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombremedico() {
        return nombremedico;
    }

    public void setNombremedico(String nombremedico) {
        this.nombremedico = nombremedico;
    }

    public String getCodigomedico() {
        return codigomedico;
    }

    public void setCodigomedico(String codigomedico) {
        this.codigomedico = codigomedico;
    }


}
