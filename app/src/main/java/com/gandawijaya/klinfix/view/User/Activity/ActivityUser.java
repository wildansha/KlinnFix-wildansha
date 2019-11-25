package com.gandawijaya.klinfix.view.User.Activity;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.User.HistoryUser.FragmentHistory;
import com.gandawijaya.klinfix.view.User.HomeUser.FragmentHome;
import com.gandawijaya.klinfix.view.User.ProfilUser.FragmentProfil;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityUser extends AppCompatActivity {

    @BindView(R.id.btn_navigation_mInfo)
    BottomNavigationView bottomNavigationView;

    Fragment fragment;
    FragmentManager fragmentManager;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        ButterKnife.bind(this);
        setupNavigationView();
    }

    private void setupNavigationView() {
        if (bottomNavigationView != null) {
            // Select first menu item by default and show Fragment accordingly.
            menu = bottomNavigationView.getMenu();
            selectmInfo(menu.getItem(0));
            // Set action to perform when any menu-item is selected.
            bottomNavigationView.setOnNavigationItemSelectedListener(
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            selectmInfo(item);
                            return false;
                        }
                    });
        }
    }

    protected void selectmInfo(MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.idHome:
                pushFragment(new FragmentHome());
                break;
            case R.id.idHistory:
                pushFragment(new FragmentHistory());
                break;
            case R.id.idProfil:
                pushFragment(new FragmentProfil());
                break;
        }
    }

    protected void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;
        fragmentManager = getSupportFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.frame_homes, fragment);
                ft.commit();
            }
        }
    }
}
