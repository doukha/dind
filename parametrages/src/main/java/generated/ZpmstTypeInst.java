
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ZpmstTypeInst complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ZpmstTypeInst"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeInstall" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Libelle" type="{urn:sap-com:document:sap:rfc:functions}char72"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZpmstTypeInst", propOrder = {
    "typeInstall",
    "libelle"
})
public class ZpmstTypeInst {

    @XmlElement(name = "TypeInstall", required = true)
    protected String typeInstall;
    @XmlElement(name = "Libelle", required = true)
    protected String libelle;

    /**
     * Obtient la valeur de la propriété typeInstall.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInstall() {
        return typeInstall;
    }

    /**
     * Définit la valeur de la propriété typeInstall.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInstall(String value) {
        this.typeInstall = value;
    }

    /**
     * Obtient la valeur de la propriété libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Définit la valeur de la propriété libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

}
