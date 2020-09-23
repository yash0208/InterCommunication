package com.rajaryan.intercommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity implements a.FragmentAListener,b.FragmentBListener{
    private a fragmentA;
    private b fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentA = new a();
        fragmentB = new b();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .replace(R.id.container_b, fragmentB)
                .commit();
    }
    @Override
    public void onInputASent(CharSequence input) {
        fragmentB.updateEditText(input);
    }
    @Override
    public void onInputBSent(CharSequence input) {
        fragmentA.updateEditText(input);
    }

}
