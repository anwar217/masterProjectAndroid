package com.projet.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnToast,btnCount;
    private TextView Tv ;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnToast =(Button) this.findViewById(R.id.toast);
        this.Tv =(TextView) this.findViewById(R.id.textV) ;
        this.btnCount =(Button) this.findViewById(R.id.count);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Tost :"  ,Toast.LENGTH_SHORT).show();
            }
    });


        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number++;
                Tv.setText(Integer.toString(number));
            }
        });



}
}