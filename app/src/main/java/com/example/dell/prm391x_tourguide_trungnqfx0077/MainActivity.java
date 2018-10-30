package com.example.dell.prm391x_tourguide_trungnqfx0077;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import models.PlaceDataFactory;
import models.PlaceDto;
import models.ServiceDto;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, DetailServiceFragment.FragmentInteraction {

    // View members
    Toolbar mToolbar;
    TextView mToolbarTitle;

    TextView mPlaceNameTV;
    TextView mPlaceTitleTV;
    ImageView mPlaceImg;

    // Data members
    PlaceDataFactory mPlaceDataFactory;
    PlaceDto mPlaceDto;

    ServiceDto.EService mEService;

    int[] mListServiceID = {R.id.mHotelLN, R.id.mAtmLN, R.id.mHospitalLN, R.id.mBusLN};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData(PlaceDataFactory.EPlace.HO_CHI_MINH);
        bindViews();
        setViews();
    }

    private void initData(PlaceDataFactory.EPlace ePlace) {
        mPlaceDataFactory = new PlaceDataFactory(ePlace);
        mPlaceDto = mPlaceDataFactory.makePlace();
    }

    private void bindViews() {
        mToolbar = findViewById(R.id.mMainToolbar);
        setSupportActionBar(mToolbar);
        mToolbarTitle = findViewById(R.id.mMainToolbarTitle);
        mToolbarTitle.setText(R.string.title_tool_bar);

        mPlaceNameTV = findViewById(R.id.mPlaceNameTV);
        mPlaceTitleTV = findViewById(R.id.mPlaceTitleTV);
        mPlaceImg = findViewById(R.id.mPlaceImg);

        for (int id : mListServiceID) {
            findViewById(id).setOnClickListener(this);
        }
    }

    private void setViews() {
        mPlaceNameTV.setText(mPlaceDto.getPlaceName());
        mPlaceTitleTV.setText(mPlaceDto.getTitle());
        mPlaceImg.setImageResource(mPlaceDto.getResIcon());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mHotelLN:
                Log.i(MainActivity.class.getSimpleName(), "Hotel");
                mEService = ServiceDto.EService.HOTEL;
                showFragment();
                break;
            case R.id.mAtmLN:
                Log.i(MainActivity.class.getSimpleName(), "ATM");
                mEService = ServiceDto.EService.ATM;
                showFragment();
                break;
            case R.id.mHospitalLN:
                Log.i(MainActivity.class.getSimpleName(), "Hospital");
                mEService = ServiceDto.EService.HOSPITAL;
                showFragment();
                break;
            case R.id.mBusLN:
                Log.i(MainActivity.class.getSimpleName(), "Bus");
                mEService = ServiceDto.EService.BUS;
                showFragment();
                break;
        }
    }

    private void showFragment() {
        for (ServiceDto serviceDto : mPlaceDto.getItems()) {
            if (serviceDto.getEService() == mEService) {
                DetailServiceFragment detailServiceFragment = DetailServiceFragment.newInstance(mPlaceDto.getPlaceName(), serviceDto);
                detailServiceFragment.setFragmentInteraction(this);
                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mMainDetailServiceFragment, detailServiceFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                setToolbarTitleForFragment(serviceDto.getServiceName());
                showHomeAsUp(true);
            }
        }
    }

    private void setToolbarTitleForFragment(String title) {
        mToolbarTitle.setText(title);
    }

    private void showHomeAsUp(boolean isShown) {
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(isShown);
        getSupportActionBar().setDisplayHomeAsUpEnabled(isShown);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.place_hanoi:
                initData(PlaceDataFactory.EPlace.HA_NOI);
                setViews();
                return true;
            case R.id.place_hcm:
                initData(PlaceDataFactory.EPlace.HO_CHI_MINH);
                setViews();
                return true;
            case android.R.id.home:
                onBackPressed();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onInteraction() {
        showHomeAsUp(false);
        mToolbarTitle.setText(getString(R.string.title_tool_bar));
    }
}
