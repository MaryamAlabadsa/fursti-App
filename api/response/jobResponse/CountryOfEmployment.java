
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class CountryOfEmployment implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("prefix_number")
    @Expose
    private String prefixNumber;
    @SerializedName("country_image")
    @Expose
    private String countryImage;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<CountryOfEmployment> CREATOR = new Creator<CountryOfEmployment>() {


        public CountryOfEmployment createFromParcel(android.os.Parcel in) {
            return new CountryOfEmployment(in);
        }

        public CountryOfEmployment[] newArray(int size) {
            return (new CountryOfEmployment[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3407999379676830557L;

    @SuppressWarnings({
        "unchecked"
    })
    protected CountryOfEmployment(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.code = ((String) in.readValue((String.class.getClassLoader())));
        this.prefixNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.countryImage = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public CountryOfEmployment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefixNumber() {
        return prefixNumber;
    }

    public void setPrefixNumber(String prefixNumber) {
        this.prefixNumber = prefixNumber;
    }

    public String getCountryImage() {
        return countryImage;
    }

    public void setCountryImage(String countryImage) {
        this.countryImage = countryImage;
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
        sb.append(CountryOfEmployment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("prefixNumber");
        sb.append('=');
        sb.append(((this.prefixNumber == null)?"<null>":this.prefixNumber));
        sb.append(',');
        sb.append("countryImage");
        sb.append('=');
        sb.append(((this.countryImage == null)?"<null>":this.countryImage));
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
        dest.writeValue(code);
        dest.writeValue(prefixNumber);
        dest.writeValue(countryImage);
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
