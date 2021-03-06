package com.kelompok_a.tubes_sewa_kos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class Setting extends AppCompatActivity {
    private SwitchMaterial switchMaterial;
    private Button button;

    SharedPref sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPref = new SharedPref(this);
        if(sharedPref.loadNightModeState()==true)
            setTheme(R.style.DarkTheme);
        else
            setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        switchMaterial = (SwitchMaterial)findViewById(R.id.mySwitch);
        if (sharedPref.loadNightModeState()){
            switchMaterial.setChecked(true);
        }
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    sharedPref.setNightModeState(true);
                }
                else{
                    sharedPref.setNightModeState(false);
                }
                restartApp();

            }
        });
        button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
    public void restartApp(){
        Intent intent = new Intent(getApplicationContext(),Setting.class);
        startActivity(intent);
        finish();
    }
}