package hiyaa.infotech.test.Apis;



import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiServices {

    @FormUrlEncoded
    @POST("user_login.php")
    Call<Result> Login(
            @Field("user_email") String contact_no,
            @Field("user_password") String password
//            @Field("firebase_token") String firebase_token,
//            @Field("login_type") String login_type

    );

    @FormUrlEncoded
    @POST("checklogin")
    Call<Result> Login2(
            @Header("Content-Type") String content_type,
            @Field("login") String contact_no

//            @Field("firebase_token") String firebase_token,
//            @Field("login_type") String login_type

    );
}
