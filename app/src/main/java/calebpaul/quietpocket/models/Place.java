package calebpaul.quietpocket.models;

import io.realm.RealmObject;

/**
 * Created by calebpaul on 2/10/17.
 */

public class Place extends RealmObject {
    private String mLatitude;
    private String mLongitude;
    private String mName;

    public Place(String mLatitude, String mLongitude, String mName) {
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
        this.mName = mName;
    }

    public Place() {}

    public String getmLatitude() {
        return mLatitude;
    }

    public String getmLongitude() {
        return mLongitude;
    }

    public String getmName() {
        return mName;
    }

    public void setmLongitude(String mLongitude) {
        this.mLongitude = mLongitude;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmLatitude(String mLatitude) {
        this.mLatitude = mLatitude;
    }
}
