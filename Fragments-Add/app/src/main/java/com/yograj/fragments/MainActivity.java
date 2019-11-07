package com.yograj.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yograj.fragments.fragments.FirstFragment;
import com.yograj.fragments.fragments.SecondFragments;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnfrag;
    private Boolean status = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfrag = findViewById(R.id.btnFrag);
        btnfrag.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(status){
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentConteinar, firstFragment);
//            goes to previous stage when back button is clicked in the phone without app halt.
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnfrag.setText("Load Second Fragments");
            status = false;
        }
        else{
            SecondFragments secondFragments = new SecondFragments();
            fragmentTransaction.replace(R.id.fragmentConteinar, secondFragments);
            fragmentTransaction.commit();
            btnfrag.setText("Load First Fragmenst");
            status = true;
        }
    }
}
