
package com.ctl.as.domain.geo.v2.types.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class CivicAddressValidationResponse extends AddressManagementResponse{

    /*@XmlElement(name = "CensusMatchLevel", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", required = false)
    protected String censusMatchLevel;
    @XmlElement(name = "PostalDirectoryMatchLevel", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", required = false)
    protected String postalDirectoryMatchLevel;
    @XmlElement(name = "DeliveryConfirmationCode", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response",  required = false)
    protected String deliveryConfirmationCode;

    @XmlElement(name = "County", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response",  required = false)
    protected String county;
    @XmlElement(name = "MetropolitanStatisticalArea", namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", required = false)
    protected String metropolitanStatisticalArea;

    public String getCensusMatchLevel() {
        return censusMatchLevel;
    }

    public void setCensusMatchLevel(String censusMatchLevel) {
        this.censusMatchLevel = censusMatchLevel;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDeliveryConfirmationCode() {
        return deliveryConfirmationCode;
    }

    public void setDeliveryConfirmationCode(String deliveryConfirmationCode) {
        this.deliveryConfirmationCode = deliveryConfirmationCode;
    }

    public String getMetropolitanStatisticalArea() {
        return metropolitanStatisticalArea;
    }

    public void setMetropolitanStatisticalArea(String metropolitanStatisticalArea) {
        this.metropolitanStatisticalArea = metropolitanStatisticalArea;
    }

    public String getPostalDirectoryMatchLevel() {
        return postalDirectoryMatchLevel;
    }

    public void setPostalDirectoryMatchLevel(String postalDirectoryMatchLevel) {
        this.postalDirectoryMatchLevel = postalDirectoryMatchLevel;
    }
*/

//  @XStreamAlias("Result")
    protected ResultColor result;
   // @XStreamAlias("CivicAddresses")
    protected ArrayOfCivicAddress civicAddresses;
   // @XStreamAlias("GeoPoint")
    protected GeoPoint geoPoint;
   // @XStreamAlias("CensusMatchLevel")
    protected String censusMatchLevel;

    // @XStreamAlias("PostalDirectoryMatchLevel")
    private String postalDirectoryMatchLevel;

    //@XStreamAlias("DeliveryConfirmationCode")
    private String deliveryConfirmationCode;

    //@XStreamAlias("County")
    private String country;

   // @XStreamAlias("MetropolitanStatisticalArea")
    private String metropolitanStatisticalArea;

    public String getCensusMatchLevel() {
        return censusMatchLevel;
    }

    public void setCensusMatchLevel(String censusMatchLevel) {
        this.censusMatchLevel = censusMatchLevel;
    }

    public ArrayOfCivicAddress getCivicAddresses() {
        return civicAddresses;
    }

    public void setCivicAddresses(ArrayOfCivicAddress civicAddresses) {
        this.civicAddresses = civicAddresses;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDeliveryConfirmationCode() {
        return deliveryConfirmationCode;
    }

    public void setDeliveryConfirmationCode(String deliveryConfirmationCode) {
        this.deliveryConfirmationCode = deliveryConfirmationCode;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getMetropolitanStatisticalArea() {
        return metropolitanStatisticalArea;
    }

    public void setMetropolitanStatisticalArea(String metropolitanStatisticalArea) {
        this.metropolitanStatisticalArea = metropolitanStatisticalArea;
    }

    public String getPostalDirectoryMatchLevel() {
        return postalDirectoryMatchLevel;
    }

    public void setPostalDirectoryMatchLevel(String postalDirectoryMatchLevel) {
        this.postalDirectoryMatchLevel = postalDirectoryMatchLevel;
    }

    public ResultColor getResult() {
        return result;
    }

    public void setResult(ResultColor result) {
        this.result = result;
    }
}
