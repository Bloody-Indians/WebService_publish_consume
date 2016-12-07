
package com.ctl.as.domain.geo.v2.types.response;


public enum ServiceStatus {


    COMPLETED("Completed"),

    FAILED("Failed");
    private final String value;

    ServiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceStatus fromValue(String v) {
        for (ServiceStatus c : ServiceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
