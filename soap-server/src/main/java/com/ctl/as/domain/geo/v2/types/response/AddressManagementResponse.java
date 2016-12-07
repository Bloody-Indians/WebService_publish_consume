
package com.ctl.as.domain.geo.v2.types.response;

//import com.thoughtworks.xstream.annotations.XStreamAlias;


public class AddressManagementResponse {

    //@XStreamAlias("Version")
    protected String version;
    //@XStreamAlias("ServiceStatus")
    protected ServiceStatus serviceStatus;
    //@XStreamAlias("TrackingId")
    protected String trackingId;
    //@XStreamAlias("OverallDuration")
    protected double overallDuration;

    public double getOverallDuration() {
        return overallDuration;
    }

    public void setOverallDuration(double overallDuration) {
        this.overallDuration = overallDuration;
    }

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}


