package com.example.dell.prm391x_tourguide_trungnqfx0077;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import adapters.ItemServiceAdapter;
import models.ServiceDto;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailServiceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailServiceFragment extends Fragment {
    private static final String BUNDLE_OBJECT = "BUNDLE_OBJECT";
    private static final String BUNLDE_STRING = "BUNLDE_STRING";

    interface FragmentInteraction {
        void onInteraction();
    }

    FragmentInteraction mFragmentInteraction;

    public void setFragmentInteraction(FragmentInteraction fragmentInteraction) {
        mFragmentInteraction = fragmentInteraction;
    }

    // Views members
    View mBaseView;
    RecyclerView mRecyclerView;

    ItemServiceAdapter mItemServiceAdapter;

    private ServiceDto mServiceDto;
    private String mPlaceName;

    public DetailServiceFragment() {
    }

    public static DetailServiceFragment newInstance(String place, ServiceDto serviceDto) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_OBJECT, serviceDto);

        DetailServiceFragment detailServiceFragment = new DetailServiceFragment();
        detailServiceFragment.setArguments(bundle);
        return detailServiceFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mServiceDto = (ServiceDto) getArguments().getSerializable(BUNDLE_OBJECT);
            mPlaceName = getArguments().getString(BUNLDE_STRING);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (getActivity() == null) return null;

        if (mBaseView == null) {
            mBaseView = inflater.inflate(R.layout.fragment_detail_service, container, false);
            initViews();
        }

        return mBaseView;
    }

    private void initViews() {
        mRecyclerView = mBaseView.findViewById(R.id.mRecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mItemServiceAdapter = new ItemServiceAdapter(getContext(), mServiceDto.getItemDtoList(), mServiceDto.getResIcon(), mServiceDto.getCodeColor());

        mRecyclerView.setAdapter(mItemServiceAdapter);
    }

    @Override
    public void onDetach() {
        mFragmentInteraction.onInteraction();
        super.onDetach();
    }
}
