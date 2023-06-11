package com.example.talkpal;

import android.os.Parcel;
import android.os.Parcelable;

import static java.lang.Boolean.parseBoolean;

/**
 * Created by Michael on 15-12-2020.
 */

public class ChatMessage implements Parcelable{
    public boolean left;
    public String message;

    public ChatMessage(boolean left, String message) {
        super();
        this.left = left;
        this.message = message;
    }
    public ChatMessage(Parcel in){
        left = parseBoolean(in.readString());
        message = in.readString();
    }
    public int describeContents(){
        return 0;
    }
    public void writeToParcel(Parcel out,int flags){
        out.writeString(String.valueOf(left));
        out.writeString(message);
    }
    public static final Creator<ChatMessage> CREATOR = new Creator<ChatMessage>(){
        public ChatMessage createFromParcel(Parcel in){
            return new ChatMessage(in);
        }
        public ChatMessage[] newArray(int size){
            return new ChatMessage[size];
        }
    };
}
