package com.example.garya.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.etNombre)
    EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //probdo si funcionss otrvez
        //lelelelelelelelelelele
    }

    @OnClick(R.id.btn1)
    public void onViewClicked() {
        String Nombre="";
        Nombre= etNombre.getText().toString();


    }
}
