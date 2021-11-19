package com.example.datastructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity{
    TextView mTextView1;
    TextView mTextView2;
    Spinner mSpinner;
    EditText mEditText1;
    EditText mEditText2;
    Button mEnterButton;
    Button mClearButton;
    String mString1;
    String mString2;
    char[] mCharArray1;
    char[] mCharArray2;

    String[] mSpinnerArray = {"Sort", "Search"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = findViewById(R.id.text_value1);
        mTextView2 = findViewById(R.id.text_value2);

        mEditText1 = findViewById(R.id.edit_text1);
        mEditText2 = findViewById(R.id.edit_text2);



        mSpinner = findViewById(R.id.spinner_value);
        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mSpinnerArray);
        mArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(mArrayAdapter);



        mEnterButton = findViewById(R.id.button_value1);
        mEnterButton.setOnClickListener(new View.OnClickListener(

        ) {
            @Override
            public void onClick(View view) {
            mTextView2.setText(Arrays.toString(algorithm()));
            }
        });

        mClearButton = findViewById(R.id.button_value2);
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
