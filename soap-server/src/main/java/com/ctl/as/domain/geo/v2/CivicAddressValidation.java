
package com.ctl.as.domain.geo.v2;

import com.ctl.as.domain.geo.v2.types.request.CivicAddressValidationRequest;
import com.ctl.as.domain.geo.v2.types.response.*;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "CivicAddressValidation", targetNamespace = "http://geo.domain.as.ctl.com/v2")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class CivicAddressValidation {

    public CivicAddressValidationResponse CivicAddressValidation(@WebParam(partName = "request") CivicAddressValidationRequest request) {
        CivicAddressValidationResponse response = new CivicAddressValidationResponse();

        /*response.setDeliveryConfirmationCode("Y");
        response.setCounty("DOUGLAS");*/

        response.setVersion("2.0.0");
        response.setServiceStatus(ServiceStatus.COMPLETED);
        response.setTrackingId("GeoDevTest:2016-12-01T12:37:53.7315571Z");
        response.setOverallDuration(140.6259);
        response.setResult(ResultColor.GREEN);

        GeoPoint geoPoint = new GeoPoint();
        geoPoint.setSource(GeoPointSource.TRILLIUM);
        geoPoint.setLatitude(39.561483);
        geoPoint.setLongitude(-104.991963);
        geoPoint.setCoordinateLevel("1");
        geoPoint.setAccuracy("1");
        response.setGeoPoint(geoPoint);

        response.setCensusMatchLevel("0");
        response.setPostalDirectoryMatchLevel("0");
        response.setDeliveryConfirmationCode("Y");
        response.setCountry("DOUGLAS");
        response.setMetropolitanStatisticalArea("DENVER CO");

        List<CivicAddress> civicAddresses = new ArrayList<CivicAddress>();

        CivicAddress civicAddress=new CivicAddress();
        civicAddress.setLocality("HIGHLANDS RANCH");
        civicAddress.setPostCode("80126");
        civicAddress.setSource(CivicAddressSource.TRILLIUM);
        civicAddress.setStreetAddress("93 CENTENNIAL BLVD");
        civicAddress.setStateOrProvince("CO");
        civicAddresses.add(civicAddress);
        ArrayOfCivicAddress arrayOfCivicAddress = new ArrayOfCivicAddress();


        arrayOfCivicAddress.setCivicAddress(civicAddresses);

        response.setCivicAddresses(arrayOfCivicAddress);

        return response;
    }

}
