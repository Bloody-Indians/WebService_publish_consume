
package com.ctl.as.domain.geo.v2.types.response;


public enum GeoPointSource {

    CLC,
    GOOGLE,
    GPS,
    MARTENS,
    TRILLIUM;

    public String value() {
        return name();
    }

    public static GeoPointSource fromValue(String v) {
        return valueOf(v);
    }

}
