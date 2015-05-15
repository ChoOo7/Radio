package de.winterrettich.ninaradio.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Station implements Parcelable {
    public String name;
    public String url;

    public Station(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Station(Parcel in){
        this.name = in.readString();
        this.url = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(url);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Station> CREATOR = new Parcelable.Creator<Station>() {
        @Override
        public Station createFromParcel(Parcel in) {
            return new Station(in);
        }

        @Override
        public Station[] newArray(int size) {
            return new Station[size];
        }
    };
}
