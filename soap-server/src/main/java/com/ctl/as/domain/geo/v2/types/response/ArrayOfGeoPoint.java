
package com.ctl.as.domain.geo.v2.types.response;

import java.util.ArrayList;
import java.util.List;


public class ArrayOfGeoPoint {


    protected List<GeoPoint> geoPoint;

    public List<GeoPoint> getGeoPoint() {
        if (geoPoint == null) {
            geoPoint = new ArrayList<GeoPoint>();
        }
        return this.geoPoint;
    }

}
