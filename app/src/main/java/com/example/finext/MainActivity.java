package com.example.finext;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Default Fragment (Home)
        updateFrame(new HomeFragment());

        //Listener for Navigation
        ((BottomNavigationView)findViewById(R.id.navigation))
                .setOnItemSelectedListener(item -> {
                    int itemId = item.getItemId();

                    if(itemId == R.id.home_menu){
                        updateFrame(new HomeFragment());
                    }
                    else if(itemId == R.id.finote_menu){
                        updateFrame(new FiNoteFragment());
                    }
                    else if(itemId == R.id.finance_menu){
                        updateFrame(new FinanceFragment());
                    }
                    else if(itemId == R.id.profile_menu){
                        updateFrame(new ProfileFragment());
                    }

                    return true;
                });
    }

    //Replace the FrameLayout
    protected void updateFrame(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.commit();
    }
}