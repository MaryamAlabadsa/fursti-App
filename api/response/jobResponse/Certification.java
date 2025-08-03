
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Certification implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("abbreviation")
    @Expose
    private String abbreviation;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<Certification> CREATOR = new Creator<Certification>() {


        public Certification createFromParcel(android.os.Parcel in) {
            return new Certification(in);
        }

        public Certification[] newArray(int size) {
            return (new Certification[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2180430883204441935L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Certification(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.abbreviation = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Certification() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Certification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("abbreviation");
        sb.append('=');
        sb.append(((this.abbreviation == null)?"<null>":this.abbreviation));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(abbreviation);
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
