
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class EducationLevel implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<EducationLevel> CREATOR = new Creator<EducationLevel>() {


        public EducationLevel createFromParcel(android.os.Parcel in) {
            return new EducationLevel(in);
        }

        public EducationLevel[] newArray(int size) {
            return (new EducationLevel[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2783128390075435752L;

    @SuppressWarnings({
        "unchecked"
    })
    protected EducationLevel(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public EducationLevel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
