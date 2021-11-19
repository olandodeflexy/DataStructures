package com.example.datastructure;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;


public class solutiontab extends Fragment {
    TextView mTextVeiw1;
    TextView mTextView2;
    TextView mTextView3;
    Spinner mSpinner;
    EditText mEditText1;
    EditText mEditText2;
    Button mEnterButton;
    Button mClearButton;
    String mString1;
    String mString2;
    char[] mCharArray1;
    String[] mSpinnerArray = {"Sort", "Search"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView  = inflater.inflate(R.layout.solutiontab, container, false);
        mTextVeiw1 = mView.findViewById(R.id.text_value1);
        mTextView2 = mView.findViewById(R.id.textView);
        mTextView3 = mView.findViewById(R.id.text_value2);
        mSpinner = mView.findViewById(R.id.spinner_value);
        mEditText1 = mView.findViewById(R.id.edit_text1);
        mEditText2 = mView.findViewById(R.id.edit_text2);
        mEnterButton = mView.findViewById(R.id.button_value1);
        mClearButton = mView.findViewById(R.id.button_value2);

        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, mSpinnerArray);
        mArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(mArrayAdapter);

        mEnterButton.setOnClickListener(new View.OnClickListener(

        ) {
            @Override
            public void onClick(View view) {
                mTextView3.setText(Arrays.toString(algorithm()));
            }
        });


        mClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mTextView2 != null){
                    mTextView2.setText(null);
                }
                if(mEditText1 != null){
                    mEditText1.setText(null);
                }
                if(mEditText2 != null){
                    mEditText2.setText(null);
                }
                if(mSpinner.getSelectedItemPosition() > 0) {
                    mSpinner.setSelection(0);
                }
            }
        });


        return mView;
    }
    String sort(){
        mString1 = mEditText1.getText().toString();
        mCharArray1 = mString1.toCharArray();
        Arrays.sort(mCharArray1);

        return new String(mCharArray1);
    }





    char[] algorithm() {
        if (mSpinner.getSelectedItemPosition() == 0) {
            mString1 = mEditText1.getText().toString();
            mCharArray1 = mString1.toCharArray();

            int n;
            int minidx;
            char temp;

            n = mCharArray1.length;
            for (int i = 0; i < n - 1; i++) {
                minidx = i;
                for (int j = i + 1; j < n; j++)
                    if (mCharArray1[j] < mCharArray1[minidx])
                        minidx = j;

                temp = mCharArray1[minidx];
                mCharArray1[minidx] = mCharArray1[i];
                mCharArray1[i] = temp;
            }

        } else if (mSpinner.getSelectedItemPosition() == 1) {

            mString1 = mEditText1.getText().toString();
            mCharArray1 = mString1.toCharArray();


            mString2 = mEditText2.getText().toString();

            char[] chars = sort().toCharArray();


            int l = 0;
            int r = mCharArray1.length -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                int res = mString2.compareTo(String.valueOf(chars[mid]));

                if (res == 0) {
                    return String.valueOf(mid).toCharArray();
                } else if (res > 0) {
                    l = mid + 1;
                } else
                    r = mid - 1;
            }


        }
        return mCharArray1;
    }
}