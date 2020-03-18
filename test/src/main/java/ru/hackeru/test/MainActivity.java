package ru.hackeru.test;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LoginFragment.loginFragmentListener{
    boolean isAuth = false;

    public final static String login1 = "user";
    public final static String psw1 = "pass";
    public String currentUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(isAuth){

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container,new MenuFragment())
                    .commit();

        } else {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container,new LoginFragment())
                    .commit();

        }

    }
    public void setAuthed(boolean isAuth){
        this.isAuth = isAuth;
    }

    public void setMenu(String login, boolean b) {
    }

    @Override
    public void onUserLogin(String user) {

    }

    @Override
    public void onUserLoginDenied() {

    }
}


