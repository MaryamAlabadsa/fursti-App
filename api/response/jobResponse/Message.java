
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Message implements Serializable, Parcelable
{

    @SerializedName("message")
    @Expose
    private String message;
    public final static Creator<Message> CREATOR = new Creator<Message>() {


        public Message createFromParcel(android.os.Parcel in) {
            return new Message(in);
        }

        public Message[] newArray(int size) {
            return (new Message[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7630255842076936210L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Message(android.os.Parcel in) {
        this.message = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Message() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(message);
    }

    public int describeContents() {
        return  0;
    }

}
