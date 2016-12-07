
package com.ctl.as.domain.geo.types.request;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

import com.ctl.as.domain.geo.v2.types.request.CivicAddressValidationRequest;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressManagementRequest", propOrder = {
        "clientId"
})

public class AddressManagementRequest {


    @XmlElement(name = "clientId", namespace = "http://geo.domain.as.ctl.com/Types/Request", required = false)

    protected String clientId;

    /**
     * Gets the value of the clientId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

}
