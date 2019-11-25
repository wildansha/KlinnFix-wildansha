package com.gandawijaya.klinfix.view.SignUp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.hellper.Api;
import com.gandawijaya.klinfix.hellper.RetrofitClient;
import com.gandawijaya.klinfix.model.LoginResponse;
import com.gandawijaya.klinfix.view.User.Activity.ActivityUser;
import com.google.gson.stream.JsonWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityLogin extends AppCompatActivity {

    Intent mIntent;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        etUsername = findViewById(R.id.idUsername);
        etPassword = findViewById(R.id.idPassword);


    }

    @OnClick(R.id.idLiniearLayoutLogin)
    public void goLogin() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        Call<LoginResponse> call = new RetrofitClient(username, password).retrofit.create(Api.class).userLogin();
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    mIntent = new Intent(ActivityLogin.this, ActivityUser.class);
                    startActivity(mIntent);
                } else {
                    try {
                        String jsonStr = response.errorBody().string();
                        JSONObject jsonObj = new JSONObject(jsonStr);
                        String error = jsonObj.getString("error");
                        Log.d("pesan1", String.valueOf(error));
                        Toast.makeText(ActivityLogin.this,error, Toast.LENGTH_LONG).show();

                    } catch (Exception e) {
                        Log.d("pesan1", e.getMessage());


                    }


                }

            }


            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.d("pesan1", t.getMessage());
            }
        });


    }

    @OnClick(R.id.id_Goregister)
    public void goRegister() {
        mIntent = new Intent(this, ActivityRegister.class);
        startActivity(mIntent);
    }
}
