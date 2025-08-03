
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class WorkField implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<WorkField> CREATOR = new Creator<WorkField>() {


        public WorkField createFromParcel(android.os.Parcel in) {
            return new WorkField(in);
        }

        public WorkField[] newArray(int size) {
            return (new WorkField[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6182494274116831053L;

    @SuppressWarnings({
        "unchecked"
    })
    protected WorkField(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WorkField() {
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
