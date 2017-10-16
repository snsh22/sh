package com.snsh.dev.shopping;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.snsh.dev.shopping.frag.HomeFrag;
import com.snsh.dev.shopping.frag.OneFrag;
import com.snsh.dev.shopping.frag.TwoFrag;
import com.snsh.dev.shopping.utl.AppCons;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    replaceFrag(AppCons.FRAG_HOME);
                    return true;
                case R.id.navigation_dashboard:
                    replaceFrag(AppCons.FRAG_ONE);
                    return true;
                case R.id.navigation_notifications:
                    replaceFrag(AppCons.FRAG_TWO);
                    return true;
            }
            return false;
        }

    };

    private void replaceFrag(int flag) {
        switch (flag) {
            case AppCons.FRAG_HOME:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_body, HomeFrag.newInstance("pass 1", "pass 2"), "HomeFrag")
                        .commit();
                break;
            case AppCons.FRAG_ONE:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_body, OneFrag.newInstance("pass 1", "pass 2"), "OneFrag")
                        .commit();
                break;
            case AppCons.FRAG_TWO:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_body, TwoFrag.newInstance("pass 1", "pass 2"), "TwoFrag")
                        .commit();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        replaceFrag(AppCons.FRAG_HOME);
    }

}
