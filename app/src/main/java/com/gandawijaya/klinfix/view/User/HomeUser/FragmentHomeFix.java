package com.gandawijaya.klinfix.view.User.HomeUser;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.SignUp.ActivityRegister;
import com.gandawijaya.klinfix.view.User.Order.ActivityOrder;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentHomeFix  extends Fragment {

    View root;
    @BindView(R.id.idLvfix)
    ListView idLvfix;
    Intent mIntent;

    ArrayList<ModelHomeKlin> modelhomeklin;
    AdapterHomeKlin adapterHomeKlin;



    public FragmentHomeFix() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_user_home_fix, container, false);
        ButterKnife.bind(this, root);
        DammyData();
        adapterHomeKlin = new AdapterHomeKlin(modelhomeklin, getContext());
        idLvfix.setAdapter(adapterHomeKlin);
        return root;
    }


    private void DammyData() {
        modelhomeklin = new ArrayList<>();
        modelhomeklin.add(new ModelHomeKlin(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));

        modelhomeklin.add(new ModelHomeKlin(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));

        modelhomeklin.add(new ModelHomeKlin(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));

        modelhomeklin.add(new ModelHomeKlin(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));

    }


    @OnClick(R.id.idElectric)
    public void goOrder(){
        mIntent = new Intent(getContext(), ActivityOrder.class);
        startActivity(mIntent);
    }

}
