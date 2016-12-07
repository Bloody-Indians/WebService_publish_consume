
package com.ctl.as.domain.geo.v2.types.response;

public enum CivicAddressSource {

    TRILLIUM,
    GOOGLE;

    public String value() {
        return name();
    }

    public static CivicAddressSource fromValue(String v) {
        return valueOf(v);
    }

}
