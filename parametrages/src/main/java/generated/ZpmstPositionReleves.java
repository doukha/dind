
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ZpmstPositionReleves complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ZpmstPositionReleves"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeReleve" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Psort" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="OrdreAffich" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZpmstPositionReleves", propOrder = {
    "typeReleve",
    "psort",
    "ordreAffich"
})
public class ZpmstPositionReleves {

    @XmlElement(name = "TypeReleve", required = true)
    protected String typeReleve;
    @XmlElement(name = "Psort", required = true)
    protected String psort;
    @XmlElement(name = "OrdreAffich", required = true)
    protected String ordreAffich;

    /**
     * Obtient la valeur de la propriété typeReleve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeReleve() {
        return typeReleve;
    }

    /**
     * Définit la valeur de la propriété typeReleve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeReleve(String value) {
        this.typeReleve = value;
    }

    /**
     * Obtient la valeur de la propriété psort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsort() {
        return psort;
    }

    /**
     * Définit la valeur de la propriété psort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsort(String value) {
        this.psort = value;
    }

    /**
     * Obtient la valeur de la propriété ordreAffich.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdreAffich() {
        return ordreAffich;
    }

    /**
     * Définit la valeur de la propriété ordreAffich.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdreAffich(String value) {
        this.ordreAffich = value;
    }

}
