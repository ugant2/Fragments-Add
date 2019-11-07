package com.yograj.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
public class SecondFragments extends Fragment {
    private EditText etText;
    private Button btnArea;
    private TextView viewArea;


    public SecondFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_fragments, container, false);
        etText = view.findViewById(R.id.etText1);
        btnArea = view.findViewById(R.id.btnArea);
        viewArea = view.findViewById(R.id.viewResult);

        btnArea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int radius = Integer.parseInt(etText.getText().toString());
                float area = 3.14f * radius * radius;
                viewArea.setText(String.valueOf(area));
                Toast.makeText(getActivity(), "Area of circle is " + area, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
