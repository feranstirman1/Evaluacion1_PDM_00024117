package com.feranstirman.evaluacion01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.feranstirman.evaluacion01.AppConstants.AppConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mProducto1,mProducto7,mProducto2,mProducto3,mProducto4,mProducto5,mProducto6,mProducto8,mProducto9;
    private TextView mContador1,mContador2,mContador3,mContador4,mContador5,mContador6,mContador7,mContador8,mContador9;
    private EditText mUsername,mEmail;
    private Button mBUtton;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProducto1 = findViewById(R.id.tv_producto1);
        mProducto2 = findViewById(R.id.tv_producto2);
        mProducto3 = findViewById(R.id.tv_producto3);
        mProducto4 = findViewById(R.id.tv_producto4);
        mProducto5 = findViewById(R.id.tv_producto5);
        mProducto6 = findViewById(R.id.tv_producto6);
        mProducto7 = findViewById(R.id.tv_producto7);
        mProducto8 = findViewById(R.id.tv_producto8);
        mProducto9 = findViewById(R.id.tv_producto9);

        mProducto1.setOnClickListener(this);
        mProducto2.setOnClickListener(this);
        mProducto3.setOnClickListener(this);
        mProducto4.setOnClickListener(this);
        mProducto5.setOnClickListener(this);
        mProducto6.setOnClickListener(this);
        mProducto7.setOnClickListener(this);
        mProducto8.setOnClickListener(this);
        mProducto9.setOnClickListener(this);


        mContador1 = findViewById(R.id.tv_contador_producto1);
        mContador2 = findViewById(R.id.tv_contador_producto2);
        mContador3 = findViewById(R.id.tv_contador_producto3);
        mContador4 = findViewById(R.id.tv_contador_producto4);
        mContador5 = findViewById(R.id.tv_contador_producto5);
        mContador6 = findViewById(R.id.tv_contador_producto6);
        mContador7 = findViewById(R.id.tv_contador_producto7);
        mContador8 = findViewById(R.id.tv_contador_producto8);
        mContador9 = findViewById(R.id.tv_contador_producto9);

        mBUtton = findViewById(R.id.btn_enviar);
        mBUtton.setOnClickListener(this);

        mUsername= findViewById(R.id.et_username);
        mEmail = findViewById(R.id.et_email);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_producto1:
                contador = Integer.parseInt(mContador1.getText().toString());
                contador += 1;
                mContador1.setText(contador+"");
                break;
            case R.id.tv_producto2:
                contador = Integer.parseInt(mContador2.getText().toString());
                contador += 1;
                mContador2.setText(contador+"");
                break;
            case R.id.tv_producto3:
                contador = Integer.parseInt(mContador3.getText().toString());
                contador += 1;
                mContador3.setText(contador+"");
                break;
            case R.id.tv_producto4:
                contador = Integer.parseInt(mContador4.getText().toString());
                contador += 1;
                mContador4.setText(contador+"");
                break;
            case R.id.tv_producto5:
                contador = Integer.parseInt(mContador5.getText().toString());
                contador += 1;
                mContador5.setText(contador+"");
                break;
            case R.id.tv_producto6:
                contador = Integer.parseInt(mContador6.getText().toString());
                contador += 1;
                mContador6.setText(contador+"");
                break;
            case R.id.tv_producto7:
                contador = Integer.parseInt(mContador7.getText().toString());
                contador += 1;
                mContador7.setText(contador+"");
                break;
            case R.id.tv_producto8:
                contador = Integer.parseInt(mContador8.getText().toString());
                contador += 1;
                mContador8.setText(contador+"");
                break;
            case R.id.tv_producto9:
                contador = Integer.parseInt(mContador9.getText().toString());
                contador += 1;
                mContador9.setText(contador+"");
                break;
            case R.id.btn_enviar:
                Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
                mIntent.putExtra(AppConstants.USERNAME_KEY, mUsername.getText().toString());
                mIntent.putExtra(AppConstants.EMAIL_KEY, mEmail.getText().toString());

                int total = Integer.parseInt(mContador1.getText().toString()) + Integer.parseInt(mContador2.getText().toString()) +
                        Integer.parseInt(mContador3.getText().toString()) + Integer.parseInt(mContador4.getText().toString()) +
                        Integer.parseInt(mContador5.getText().toString()) + Integer.parseInt(mContador6.getText().toString()) +
                        Integer.parseInt(mContador7.getText().toString()) + Integer.parseInt(mContador8.getText().toString()) +
                        Integer.parseInt(mContador9.getText().toString());
                String stringTotal = total + "";
                mIntent.putExtra(AppConstants.PRODUCTS_KEY, stringTotal);

                mIntent.putExtra(AppConstants.PRODUCT1_KEY, mContador1.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT2_KEY, mContador2.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT3_KEY, mContador3.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT4_KEY, mContador4.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT5_KEY, mContador5.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT6_KEY, mContador6.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT7_KEY, mContador7.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT8_KEY, mContador8.getText().toString());
                mIntent.putExtra(AppConstants.PRODUCT9_KEY, mContador9.getText().toString());

                startActivity(mIntent);
        }
    }
}