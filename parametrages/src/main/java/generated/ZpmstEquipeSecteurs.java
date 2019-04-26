
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ZpmstEquipeSecteurs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ZpmstEquipeSecteurs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PosteTravail" type="{urn:sap-com:document:sap:soap:functions:mc-style}char8"/&gt;
 *         &lt;element name="Swerk" type="{urn:sap-com:document:sap:soap:functions:mc-style}char4"/&gt;
 *         &lt;element name="Beber" type="{urn:sap-com:document:sap:soap:functions:mc-style}char3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZpmstEquipeSecteurs", propOrder = {
    "posteTravail",
    "swerk",
    "beber"
})
public class ZpmstEquipeSecteurs {

    @XmlElement(name = "PosteTravail", required = true)
    protected String posteTravail;
    @XmlElement(name = "Swerk", required = true)
    protected String swerk;
    @XmlElement(name = "Beber", required = true)
    protected String beber;

    /**
     * Obtient la valeur de la propriété posteTravail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosteTravail() {
        return posteTravail;
    }

    /**
     * Définit la valeur de la propriété posteTravail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosteTravail(String value) {
        this.posteTravail = value;
    }

    /**
     * Obtient la valeur de la propriété swerk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwerk() {
        return swerk;
    }

    /**
     * Définit la valeur de la propriété swerk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwerk(String value) {
        this.swerk = value;
    }

    /**
     * Obtient la valeur de la propriété beber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeber() {
        return beber;
    }

    /**
     * Définit la valeur de la propriété beber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeber(String value) {
        this.beber = value;
    }

}
