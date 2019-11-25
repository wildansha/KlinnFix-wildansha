package com.gandawijaya.klinfix.view.User.HomeUser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.User.HistoryUser.AdapterFix;
import com.gandawijaya.klinfix.view.User.HistoryUser.ModelFix;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentHomeKlin extends Fragment {

    View root;
    @BindView(R.id.idLvUser)
    ListView idLvUser;

    ArrayList<ModelHomeKlin> modelhomeklin;
    AdapterHomeKlin adapterHomeKlin;



    public FragmentHomeKlin() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_user_home_klin, container, false);
        ButterKnife.bind(this, root);
        DammyData();
        adapterHomeKlin = new AdapterHomeKlin(modelhomeklin, getContext());
        idLvUser.setAdapter(adapterHomeKlin);
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

}
