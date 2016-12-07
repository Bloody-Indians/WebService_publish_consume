
package com.ctl.as.domain.geo.v2.types.request;


import com.ctl.as.domain.geo.types.request.AddressManagementRequest;


import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CivicAddressValidationRequest", propOrder = {
        "addressLine1",
        "locality",
        "stateOrProvince",
        "postCode"
})

public class CivicAddressValidationRequest extends AddressManagementRequest

{


    @XmlElement(name = "AddressLine1", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", required = false)
    protected String addressLine1;
    @XmlElement(name = "Locality", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", required = false)
    protected String locality;
    @XmlElement(name = "StateOrProvince", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", required = false)
    protected String stateOrProvince;
    @XmlElement(name = "PostCode", namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", required = false)
    protected String postCode;


    public String getAddressLine1() {
        return addressLine1;
    }


    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }


    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     *
     * @param value allowed object is
     *              {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     *
     * @return possible object is
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     *
     * @param value allowed object is
     *              {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the postCode property.
     *
     * @return possible object is
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     */
    public String getPostCode() {
        return postCode;
    }


    public void setPostCode(String value) {
        this.postCode = value;
    }

}
