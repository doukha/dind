
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMsgErreur" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EtEquipeDestinataires" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZpmttEquipeDestinataires"/&gt;
 *         &lt;element name="EtEquipeSecteurs" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZpmttEquipeSecteurs"/&gt;
 *         &lt;element name="EtPositionReleves" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZpmttPositionReleves"/&gt;
 *         &lt;element name="EtTypeInst" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZpmttTypeInst"/&gt;
 *         &lt;element name="EtTypeReleves" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZpmttTypeReleves"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eMsgErreur",
    "etEquipeDestinataires",
    "etEquipeSecteurs",
    "etPositionReleves",
    "etTypeInst",
    "etTypeReleves"
})
@XmlRootElement(name = "ZpmExtractParametrageResponse")
public class ZpmExtractParametrageResponse {

    @XmlElement(name = "EMsgErreur", required = true)
    protected String eMsgErreur;
    @XmlElement(name = "EtEquipeDestinataires", required = true)
    protected ZpmttEquipeDestinataires etEquipeDestinataires;
    @XmlElement(name = "EtEquipeSecteurs", required = true)
    protected ZpmttEquipeSecteurs etEquipeSecteurs;
    @XmlElement(name = "EtPositionReleves", required = true)
    protected ZpmttPositionReleves etPositionReleves;
    @XmlElement(name = "EtTypeInst", required = true)
    protected ZpmttTypeInst etTypeInst;
    @XmlElement(name = "EtTypeReleves", required = true)
    protected ZpmttTypeReleves etTypeReleves;

    /**
     * Obtient la valeur de la propriété eMsgErreur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMsgErreur() {
        return eMsgErreur;
    }

    /**
     * Définit la valeur de la propriété eMsgErreur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMsgErreur(String value) {
        this.eMsgErreur = value;
    }

    /**
     * Obtient la valeur de la propriété etEquipeDestinataires.
     * 
     * @return
     *     possible object is
     *     {@link ZpmttEquipeDestinataires }
     *     
     */
    public ZpmttEquipeDestinataires getEtEquipeDestinataires() {
        return etEquipeDestinataires;
    }

    /**
     * Définit la valeur de la propriété etEquipeDestinataires.
     * 
     * @param value
     *     allowed object is
     *     {@link ZpmttEquipeDestinataires }
     *     
     */
    public void setEtEquipeDestinataires(ZpmttEquipeDestinataires value) {
        this.etEquipeDestinataires = value;
    }

    /**
     * Obtient la valeur de la propriété etEquipeSecteurs.
     * 
     * @return
     *     possible object is
     *     {@link ZpmttEquipeSecteurs }
     *     
     */
    public ZpmttEquipeSecteurs getEtEquipeSecteurs() {
        return etEquipeSecteurs;
    }

    /**
     * Définit la valeur de la propriété etEquipeSecteurs.
     * 
     * @param value
     *     allowed object is
     *     {@link ZpmttEquipeSecteurs }
     *     
     */
    public void setEtEquipeSecteurs(ZpmttEquipeSecteurs value) {
        this.etEquipeSecteurs = value;
    }

    /**
     * Obtient la valeur de la propriété etPositionReleves.
     * 
     * @return
     *     possible object is
     *     {@link ZpmttPositionReleves }
     *     
     */
    public ZpmttPositionReleves getEtPositionReleves() {
        return etPositionReleves;
    }

    /**
     * Définit la valeur de la propriété etPositionReleves.
     * 
     * @param value
     *     allowed object is
     *     {@link ZpmttPositionReleves }
     *     
     */
    public void setEtPositionReleves(ZpmttPositionReleves value) {
        this.etPositionReleves = value;
    }

    /**
     * Obtient la valeur de la propriété etTypeInst.
     * 
     * @return
     *     possible object is
     *     {@link ZpmttTypeInst }
     *     
     */
    public ZpmttTypeInst getEtTypeInst() {
        return etTypeInst;
    }

    /**
     * Définit la valeur de la propriété etTypeInst.
     * 
     * @param value
     *     allowed object is
     *     {@link ZpmttTypeInst }
     *     
     */
    public void setEtTypeInst(ZpmttTypeInst value) {
        this.etTypeInst = value;
    }

    /**
     * Obtient la valeur de la propriété etTypeReleves.
     * 
     * @return
     *     possible object is
     *     {@link ZpmttTypeReleves }
     *     
     */
    public ZpmttTypeReleves getEtTypeReleves() {
        return etTypeReleves;
    }

    /**
     * Définit la valeur de la propriété etTypeReleves.
     * 
     * @param value
     *     allowed object is
     *     {@link ZpmttTypeReleves }
     *     
     */
    public void setEtTypeReleves(ZpmttTypeReleves value) {
        this.etTypeReleves = value;
    }

}
