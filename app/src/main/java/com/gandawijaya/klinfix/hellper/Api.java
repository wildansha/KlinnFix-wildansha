package com.gandawijaya.klinfix.hellper;


import com.gandawijaya.klinfix.model.LoginResponse;
import com.gandawijaya.klinfix.model.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {

    @FormUrlEncoded
    @POST("register/user")
    Call<RegisterResponse> userRegister(
            @Field("username") String username,
            @Field("password") String password,
            @Field("name") String name,
            @Field("email") String email

    );

//    @FormUrlEncoded
    @POST("auth/user")
    Call<LoginResponse> userLogin();



//    @FormUrlEncoded
//    @POST("createuser")
//    Call<DefaultResponse> createUser(
//            @Field("email") String email,
//            @Field("password") String password,
//            @Field("name") String name,
//            @Field("school") String school
//    );
//
//    @GET("allusers")
//    Call<UsersResponse> getUsers();
//
//    @FormUrlEncoded
//    @PUT("updateuser/{id}")
//    Call<LoginResponse> updateUser(
//            @Path("id") int id,
//            @Field("email") String email,
//            @Field("name") String name,
//            @Field("school") String school
//    );
//
//    @FormUrlEncoded
//    @PUT("updatepassword")
//    Call<DefaultResponse> updatePassword(
//            @Field("currentpassword") String currentpassword,
//            @Field("newpassword") String newpassword,
//            @Field("email") String email
//    );
//
//    @DELETE("deleteuser/{id}")
//    Call<DefaultResponse> deleteUser(@Path("id") int id);

}
