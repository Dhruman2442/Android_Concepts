package hiyaa.infotech.test.Apis;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Result {


    @SerializedName("success")
    private Boolean success;

    @SerializedName("msg")
    private String msg;




    @SerializedName("data")
    private ArrayList <Profiledata> data;

    public ArrayList<Profiledata> getData() {
        return data;
    }

    public void setData(ArrayList<Profiledata> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
