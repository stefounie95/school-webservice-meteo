//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.04 at 03:58:45 PM CET 
//


package com.superwebservice.publictypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeatherRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WeatherResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lieu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="date_heure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="vent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="visibilite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ciel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="point_rosee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="humidite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="unique_token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "weatherRequest",
    "weatherResponse"
})
@XmlRootElement(name = "WeatherPacket")
public class WeatherPacket {

    @XmlElement(name = "WeatherRequest", required = true)
    protected WeatherPacket.WeatherRequest weatherRequest;
    @XmlElement(name = "WeatherResponse", required = true)
    protected WeatherPacket.WeatherResponse weatherResponse;

    /**
     * Gets the value of the weatherRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherPacket.WeatherRequest }
     *     
     */
    public WeatherPacket.WeatherRequest getWeatherRequest() {
        return weatherRequest;
    }

    /**
     * Sets the value of the weatherRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherPacket.WeatherRequest }
     *     
     */
    public void setWeatherRequest(WeatherPacket.WeatherRequest value) {
        this.weatherRequest = value;
    }

    /**
     * Gets the value of the weatherResponse property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherPacket.WeatherResponse }
     *     
     */
    public WeatherPacket.WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }

    /**
     * Sets the value of the weatherResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherPacket.WeatherResponse }
     *     
     */
    public void setWeatherResponse(WeatherPacket.WeatherResponse value) {
        this.weatherResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cityName",
        "countryName"
    })
    public static class WeatherRequest {

        @XmlElement(name = "CityName")
        protected String cityName;
        @XmlElement(name = "CountryName")
        protected String countryName;

        /**
         * Gets the value of the cityName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityName() {
            return cityName;
        }

        /**
         * Sets the value of the cityName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityName(String value) {
            this.cityName = value;
        }

        /**
         * Gets the value of the countryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryName() {
            return countryName;
        }

        /**
         * Sets the value of the countryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryName(String value) {
            this.countryName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lieu" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="date_heure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="vent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="visibilite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ciel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="point_rosee" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="humidite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pression" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="unique_token" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lieu",
        "dateHeure",
        "vent",
        "visibilite",
        "ciel",
        "temperature",
        "pointRosee",
        "humidite",
        "pression",
        "status",
        "uniqueToken"
    })
    public static class WeatherResponse {

        @XmlElement(required = true)
        protected String lieu;
        @XmlElement(name = "date_heure", required = true)
        protected String dateHeure;
        @XmlElement(required = true)
        protected String vent;
        @XmlElement(required = true)
        protected String visibilite;
        @XmlElement(required = true)
        protected String ciel;
        @XmlElement(required = true)
        protected String temperature;
        @XmlElement(name = "point_rosee", required = true)
        protected String pointRosee;
        @XmlElement(required = true)
        protected String humidite;
        @XmlElement(required = true)
        protected String pression;
        @XmlElement(required = true)
        protected String status;
        @XmlElement(name = "unique_token", required = true)
        protected String uniqueToken;

        /**
         * Gets the value of the lieu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLieu() {
            return lieu;
        }

        /**
         * Sets the value of the lieu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLieu(String value) {
            this.lieu = value;
        }

        /**
         * Gets the value of the dateHeure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateHeure() {
            return dateHeure;
        }

        /**
         * Sets the value of the dateHeure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateHeure(String value) {
            this.dateHeure = value;
        }

        /**
         * Gets the value of the vent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVent() {
            return vent;
        }

        /**
         * Sets the value of the vent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVent(String value) {
            this.vent = value;
        }

        /**
         * Gets the value of the visibilite property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisibilite() {
            return visibilite;
        }

        /**
         * Sets the value of the visibilite property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisibilite(String value) {
            this.visibilite = value;
        }

        /**
         * Gets the value of the ciel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCiel() {
            return ciel;
        }

        /**
         * Sets the value of the ciel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCiel(String value) {
            this.ciel = value;
        }

        /**
         * Gets the value of the temperature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemperature() {
            return temperature;
        }

        /**
         * Sets the value of the temperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemperature(String value) {
            this.temperature = value;
        }

        /**
         * Gets the value of the pointRosee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPointRosee() {
            return pointRosee;
        }

        /**
         * Sets the value of the pointRosee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPointRosee(String value) {
            this.pointRosee = value;
        }

        /**
         * Gets the value of the humidite property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHumidite() {
            return humidite;
        }

        /**
         * Sets the value of the humidite property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHumidite(String value) {
            this.humidite = value;
        }

        /**
         * Gets the value of the pression property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPression() {
            return pression;
        }

        /**
         * Sets the value of the pression property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPression(String value) {
            this.pression = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the uniqueToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUniqueToken() {
            return uniqueToken;
        }

        /**
         * Sets the value of the uniqueToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUniqueToken(String value) {
            this.uniqueToken = value;
        }

    }

}
