
package wservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombremedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigomedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificacion", propOrder = {
    "nombre",
    "codigo",
    "nombremedico",
    "codigomedico"
})
public class Verificacion {

    protected String nombre;
    protected String codigo;
    protected String nombremedico;
    protected String codigomedico;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombremedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombremedico() {
        return nombremedico;
    }

    /**
     * Define el valor de la propiedad nombremedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombremedico(String value) {
        this.nombremedico = value;
    }

    /**
     * Obtiene el valor de la propiedad codigomedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigomedico() {
        return codigomedico;
    }

    /**
     * Define el valor de la propiedad codigomedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigomedico(String value) {
        this.codigomedico = value;
    }

}
