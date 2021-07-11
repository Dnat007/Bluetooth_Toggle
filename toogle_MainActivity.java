package com.example.toogle;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton t1;
    BluetoothAdapter ba;

    private boolean blue = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (ToggleButton)findViewById(R.id.toggleButton);
        ba = BluetoothAdapter.getDefaultAdapter();

        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    ba.enable();
                }
                else
                {
                    ba.disable();
                }
            }
        });
    }
}