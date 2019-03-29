package com.feranstirman.evaluacion01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.feranstirman.evaluacion01.AppConstants.AppConstants;

public class NewActivity extends AppCompatActivity {

    private TextView mUsername,mEmail,mProductos;
    private TextView mContador1,mContador2,mContador3,mContador4,mContador5,mContador6,mContador7,mContador8,mContador9;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mUsername= findViewById(R.id.tv_username_recibido);
        mEmail = findViewById(R.id.tv_email_recibido);
        mProductos = findViewById(R.id.tv_total_productos);

        mContador1= findViewById(R.id.tv_contador_producto1);
        mContador2= findViewById(R.id.tv_contador_producto2);
        mContador3= findViewById(R.id.tv_contador_producto3);
        mContador4= findViewById(R.id.tv_contador_producto4);
        mContador5= findViewById(R.id.tv_contador_producto5);
        mContador6= findViewById(R.id.tv_contador_producto6);
        mContador7= findViewById(R.id.tv_contador_producto7);
        mContador8= findViewById(R.id.tv_contador_producto8);
        mContador9= findViewById(R.id.tv_contador_producto9);

        Intent mIntent = this.getIntent();
        if(mIntent!=null){
            String username,email,productos;
            username = mIntent.getStringExtra(AppConstants.USERNAME_KEY);
            email= mIntent.getStringExtra(AppConstants.EMAIL_KEY);
            productos = mIntent.getStringExtra(AppConstants.PRODUCTS_KEY);

            String contador1,contador2,contador3,contador4,contador5,contador6,contador7,contador8,contador9;
            contador1 = mIntent.getStringExtra(AppConstants.PRODUCT1_KEY);
            contador2 = mIntent.getStringExtra(AppConstants.PRODUCT2_KEY);
            contador3 = mIntent.getStringExtra(AppConstants.PRODUCT3_KEY);
            contador4 = mIntent.getStringExtra(AppConstants.PRODUCT4_KEY);
            contador5 = mIntent.getStringExtra(AppConstants.PRODUCT5_KEY);
            contador6 = mIntent.getStringExtra(AppConstants.PRODUCT6_KEY);
            contador7 = mIntent.getStringExtra(AppConstants.PRODUCT7_KEY);
            contador8 = mIntent.getStringExtra(AppConstants.PRODUCT8_KEY);
            contador9 = mIntent.getStringExtra(AppConstants.PRODUCT9_KEY);

            mUsername.setText("Usuario: "+username);
            mEmail.setText("Correo: "+email);
            mProductos.setText("Total de productos: "+productos);

            mContador1.setText(contador1);
            mContador2.setText(contador2);
            mContador3.setText(contador3);
            mContador4.setText(contador4);
            mContador5.setText(contador5);
            mContador6.setText(contador6);
            mContador7.setText(contador7);
            mContador8.setText(contador8);
            mContador9.setText(contador9);



        }

        mButton = findViewById(R.id.btn_share);
        mButton.setOnClickListener(v->{

            String informacion = "{username: }";

        });
    }
}
