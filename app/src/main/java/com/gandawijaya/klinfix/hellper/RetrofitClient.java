package com.gandawijaya.klinfix.hellper;

import android.util.Base64;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

//    private static final String AUTH = "Basic " + Base64.encodeToString(("wildansha:Qo81330735271!").getBytes(), Base64.NO_WRAP);

    private static final String BASE_URL = "https://api.klinnfix.com/V1/";
    private static RetrofitClient mInstance;
    public Retrofit retrofit;


    public RetrofitClient(String username,String password) {
        String AUTH = "Basic " + Base64.encodeToString((username+":"+password).getBytes(), Base64.NO_WRAP);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        chain -> {
                            Request original = chain.request();
                            Request.Builder requestBuilder = original.newBuilder()
                                    .addHeader("Authorization", AUTH)
                                    .method(original.method(), original.body());
                            Request request = requestBuilder.build();
                            return chain.proceed(request);
                        }
                ).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();


    }

//    public static synchronized RetrofitClient getInstance() {
//        if (mInstance == null) {
//            mInstance = new RetrofitClient();
//        }
//        return mInstance;
//    }

    public Api getApi() {
        return retrofit.create(Api.class);
    }
}
