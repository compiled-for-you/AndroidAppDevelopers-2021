package com.android.internshipprogram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public Toolbar toolbar ;
    public BottomNavigationView btm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        btm = findViewById(R.id.btm);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        toolbar.setTitle(null);
        btm.setSelectedItemId(R.id.account);

        btm.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.home :
                        Toast.makeText(MainActivity.this, "Clicked Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.browse :
                        Toast.makeText(MainActivity.this, "Clicked Browse", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.account :
                        Toast.makeText(MainActivity.this, "Already here", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.notifications)
        {
            Toast.makeText(MainActivity.this, "Clicked Notifications", Toast.LENGTH_SHORT).show();
        }
        else {

        }
        return super.onOptionsItemSelected(item);
    }
}