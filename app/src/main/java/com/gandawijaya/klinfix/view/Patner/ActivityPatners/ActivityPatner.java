package com.gandawijaya.klinfix.view.Patner.ActivityPatners;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gandawijaya.klinfix.R;
import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityPatner extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Fragment fragment;

    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    FragmentManager fragmentManager;
    ActionBarDrawerToggle toggle;
    FragmentTransaction fragmentTransaction;
    Intent mIntent;
    View navHeader;
    Menu menuNav;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patner);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        try {
            if (savedInstanceState == null) {
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container_patner, new FragmentPatner());
                fragmentTransaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        drawer = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.getDrawerArrowDrawable().setColor(getColor(R.color.orange_1));
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navHeader = navigationView.getHeaderView(0);
        menuNav = navigationView.getMenu();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();
        fragment = null;

        if (id == R.id.idPatnerHome) {
            fragment = new FragmentPatner();
        }
//        else if (id == R.id.idPatnerHome) {
//            fragment = new FragmentPatner();
//        } else if (id == R.id.idPatnerA) {
//            fragment = new FragmentPatner();
//        } else if (id == R.id.idPatnerB) {
//            fragment = new FragmentPatner();
//        } else if (id == R.id.idPatnerC) {
//            fragment = new FragmentPatner();
//        } else if (id == R.id.idPatnerD) {
//            fragment = new FragmentPatner();
//        } else if (id == R.id.idPatnerE) {
//            fragment = new FragmentPatner();
//        }

        goDestination(fragment);
        drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void goDestination(Fragment fragment) {
        if (fragment != null) {
            fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_patner, fragment);
            fragmentTransaction.commit();
        }
    }

}
