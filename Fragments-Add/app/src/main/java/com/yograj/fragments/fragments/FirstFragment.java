package com.yograj.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.yograj.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private EditText etText1, etText2;
    private Button btnAdd;
    private TextView viewResult;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        etText1 = view.findViewById(R.id.etText1);
        etText2 = view.findViewById(R.id.etText2);
        btnAdd = view.findViewById(R.id.btnAdd);
        viewResult = view.findViewById(R.id.viewResult);


       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int a = Integer.parseInt(etText1.getText().toString());
               int b = Integer.parseInt(etText2.getText().toString());
               int c = a+b;
            viewResult.setText(String.valueOf(c));
            Toast.makeText(getActivity(), "Sum is " + c, Toast.LENGTH_SHORT).show();
           }
       });
       return view;
    }

}
