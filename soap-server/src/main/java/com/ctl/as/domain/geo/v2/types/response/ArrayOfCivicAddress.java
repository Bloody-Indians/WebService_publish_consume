
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class ArrayOfCivicAddress {

    //@XmlElement(name = "CivicAddress", nillable = true)
    protected List<CivicAddress> civicAddress;


    public List<CivicAddress> getCivicAddress() {
        if (civicAddress == null) {
            civicAddress = new ArrayList<CivicAddress>();
        }
        return this.civicAddress;
    }

    public void setCivicAddress(List<CivicAddress> civicAddress) {
        this.civicAddress = civicAddress;
    }
}
