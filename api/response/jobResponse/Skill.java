
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Skill implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pivot")
    @Expose
    private Pivot pivot;
    public final static Creator<Skill> CREATOR = new Creator<Skill>() {


        public Skill createFromParcel(android.os.Parcel in) {
            return new Skill(in);
        }

        public Skill[] newArray(int size) {
            return (new Skill[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7217487807242670357L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Skill(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.pivot = ((Pivot) in.readValue((Pivot.class.getClassLoader())));
    }

    public Skill() {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Pivot getPivot() {
        return pivot;
    }

    public void setPivot(Pivot pivot) {
        this.pivot = pivot;
    }


    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(status);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(pivot);
    }

    public int describeContents() {
        return  0;
    }

}
