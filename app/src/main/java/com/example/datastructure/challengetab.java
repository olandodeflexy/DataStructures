package com.example.datastructure;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class challengetab extends Fragment {
    TextView mTextView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.challengetab, container, false);
        mTextView = mView.findViewById(R.id.text_view1);
        return mView;

    }
}