package com.example.assigenemt7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button firstFragmentBtn, secondFragmentBtn;
    FragmentContainerView fragmentContainer;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firstFragmentBtn=findViewById(R.id.fragment1Button);
        secondFragmentBtn=findViewById(R.id.fragment2Button);

        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Fragment1());
            }
        });
        //here set on click listener on second button
        secondFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //when click even will happen it will call below function
                replaceFragment(new Fragment2());
            }
        });
    }
/*this method will replace the fragments when if fragment 1 button clicked fragment 1 will show
if fragment button2 is clicked fragment 2 will show */
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //below I have passed a fragment object that I will receive from function arguments
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}