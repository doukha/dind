
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ZpmstEquipeDestinataires complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ZpmstEquipeDestinataires"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PosteTravail" type="{urn:sap-com:document:sap:soap:functions:mc-style}char8"/&gt;
 *         &lt;element name="Swerk" type="{urn:sap-com:document:sap:soap:functions:mc-style}char4"/&gt;
 *         &lt;element name="Destinataire" type="{urn:sap-com:document:sap:soap:functions:mc-style}char8"/&gt;
 *         &lt;element name="LibelleDest" type="{urn:sap-com:document:sap:soap:functions:mc-style}char40"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZpmstEquipeDestinataires", propOrder = {
    "posteTravail",
    "swerk",
    "destinataire",
    "libelleDest"
})
public class ZpmstEquipeDestinataires {

    @XmlElement(name = "PosteTravail", required = true)
    protected String posteTravail;
    @XmlElement(name = "Swerk", required = true)
    protected String swerk;
    @XmlElement(name = "Destinataire", required = true)
    protected String destinataire;
    @XmlElement(name = "LibelleDest", required = true)
    protected String libelleDest;

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
     * Obtient la valeur de la propriété destinataire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinataire() {
        return destinataire;
    }

    /**
     * Définit la valeur de la propriété destinataire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinataire(String value) {
        this.destinataire = value;
    }

    /**
     * Obtient la valeur de la propriété libelleDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleDest() {
        return libelleDest;
    }

    /**
     * Définit la valeur de la propriété libelleDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleDest(String value) {
        this.libelleDest = value;
    }

}
