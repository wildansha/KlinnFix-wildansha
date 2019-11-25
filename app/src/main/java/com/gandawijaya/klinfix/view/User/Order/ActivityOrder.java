package com.gandawijaya.klinfix.view.User.Order;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gandawijaya.klinfix.R;

import java.util.Calendar;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityOrder extends AppCompatActivity {

    final Calendar myCalendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_order);
        ButterKnife.bind(this);
        date = (view, year, monthOfYear, dayOfMonth) -> {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        };
    }

    @OnClick(R.id.idTimeAuction)
    public void goTimeAution() {
        new DatePickerDialog(this, date, myCalendar
                .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    @OnClick(R.id.idBack)
    public void goBack() {
        onBackPressed();
    }

    @OnClick(R.id.idLiniearLayoutConfirm)
    public void goConfirm() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
        alertDialogBuilder.setPositiveButton("yes",
                (arg0, arg1) -> Toast.makeText(getApplicationContext(), "You clicked yes button", Toast.LENGTH_LONG).show());

        alertDialogBuilder.setNegativeButton("No", (dialog, which) -> finish());
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}