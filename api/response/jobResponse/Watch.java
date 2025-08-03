
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Watch implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("device_id")
    @Expose
    private Object deviceId;
    @SerializedName("job_id")
    @Expose
    private Integer jobId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    public final static Creator<Watch> CREATOR = new Creator<Watch>() {


        public Watch createFromParcel(android.os.Parcel in) {
            return new Watch(in);
        }

        public Watch[] newArray(int size) {
            return (new Watch[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8402372770512655329L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Watch(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.deviceId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.jobId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Watch() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(deviceId);
        dest.writeValue(jobId);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
    }

    public int describeContents() {
        return  0;
    }

}
