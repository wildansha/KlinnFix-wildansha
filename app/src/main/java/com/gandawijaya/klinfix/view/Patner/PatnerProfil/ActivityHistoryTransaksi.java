package com.gandawijaya.klinfix.view.Patner.PatnerProfil;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.User.HistoryUser.AdapterFix;
import com.gandawijaya.klinfix.view.User.HistoryUser.ModelFix;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityHistoryTransaksi extends AppCompatActivity {

    @BindView(R.id.idLvHistoryTransaksi)
    ListView idLvHistoryTransaksi;

    ArrayList<ModelHistoryTransaksi> modelFixes;
    AdapterHistoryTransaksi adapterHistoryTransaksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_transaksi);
        ButterKnife.bind(this);
        DammyData();
        adapterHistoryTransaksi = new AdapterHistoryTransaksi(modelFixes, getApplicationContext());
        idLvHistoryTransaksi.setAdapter(adapterHistoryTransaksi);
    }

    private void DammyData() {
        modelFixes = new ArrayList<>();
        modelFixes.add(new ModelHistoryTransaksi(
                "Klik and Fix",
                "Jl. Truno Joyo Jakarta",
                "Rp. 200.000"));

        modelFixes.add(new ModelHistoryTransaksi(
                "Klik and Fix",
                "Jl. Truno Joyo Jakarta",
                "Rp. 200.000"));

        modelFixes.add(new ModelHistoryTransaksi(
                "Klik and Fix",
                "Jl. Truno Joyo Jakarta",
                "Rp. 200.000"));

        modelFixes.add(new ModelHistoryTransaksi(
                "Klik and Fix",
                "Jl. Truno Joyo Jakarta",
                "Rp. 200.000"));

        modelFixes.add(new ModelHistoryTransaksi(
                "Klik and Fix",
                "Jl. Truno Joyo Jakarta",
                "Rp. 200.000"));

        modelFixes.add(new ModelHistoryTransaksi(
                "Klik and Fix",
                "Jl. Truno Joyo Jakarta",
                "Rp. 200.000"));

    }

    @OnClick(R.id.idBack)
    public void goBack(){
        onBackPressed();
    }
}
