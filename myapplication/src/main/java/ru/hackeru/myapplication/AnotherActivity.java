package ru.hackeru.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends AppCompatActivity {
    FirstFragment firstFragment;
    SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
    }

    public void onClick (View view) {

        switch (view.getId()) {
            case R.id.btn_1:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, firstFragment)
                        .addToBackStack("a")
                        .commit();
                break;
            case R.id.btn_2:
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container, secondFragment)
                    .addToBackStack("b")
                    .commit();
                break;

        }
    }
}
