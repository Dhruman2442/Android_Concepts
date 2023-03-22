package hiyaa.infotech.test.Apis;

import com.google.gson.annotations.SerializedName;

public class Profiledata {



    @SerializedName("id")
    private String id;

    @SerializedName("user_name")
    private String user_name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
