
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.annotation.XmlEnumValue;


public enum ResultColor {

    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Yellow")
    YELLOW("Yellow");
    private final String value;

    ResultColor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultColor fromValue(String v) {
        for (ResultColor c: ResultColor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
