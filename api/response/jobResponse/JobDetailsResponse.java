
package com.example.myapplication.api.response.jobResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class JobDetailsResponse implements Serializable
{

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private Message message;
    @SerializedName("data")
    @Expose
    private Datum data;

    private final static long serialVersionUID = 2583625465519330160L;



    public JobDetailsResponse() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Datum getData() {
        return data;
    }

    public void setData(Datum data) {
        this.data = data;
    }

    public JobDetailsResponse(Datum data) {
        this.data = data;
    }
}
