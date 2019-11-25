package com.gandawijaya.klinfix.view.User.HistoryUser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.gandawijaya.klinfix.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentFix extends Fragment {

    @BindView(R.id.idLvFix)
    ListView idLvFix;

    ArrayList<ModelFix> modelFixes;
    AdapterFix adapterFix;

    View root;
    public FragmentFix() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_user_history_fix, container, false);
        ButterKnife.bind(this, root);
        DammyData();
        adapterFix = new AdapterFix(modelFixes, getContext());
        idLvFix.setAdapter(adapterFix);
        return root;
    }

    private void DammyData() {
        modelFixes = new ArrayList<>();
        modelFixes.add(new ModelFix(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Close",
                "2018-06",
                "2018-08"));
        modelFixes.add(new ModelFix(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Close",
                "2018-06",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
                ));
        modelFixes.add(new ModelFix(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Close",
                "2018-06",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
                ));
        modelFixes.add(new ModelFix(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg",
                "Close",
                "2018-06",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
               ));
    }
}

