
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Pivot implements Serializable, Parcelable
{

    @SerializedName("job_id")
    @Expose
    private Integer jobId;
    @SerializedName("skill_id")
    @Expose
    private Integer skillId;
    public final static Creator<Pivot> CREATOR = new Creator<Pivot>() {


        public Pivot createFromParcel(android.os.Parcel in) {
            return new Pivot(in);
        }

        public Pivot[] newArray(int size) {
            return (new Pivot[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3188902043340507961L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Pivot(android.os.Parcel in) {
        this.jobId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.skillId = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Pivot() {
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(jobId);
        dest.writeValue(skillId);
    }

    public int describeContents() {
        return  0;
    }

}
