package com.example.andre.primeiro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);
    }

    public void sair (View view){
        System.exit(0);
    }

    public void tela2 (View view){
        setContentView(R.layout.tela2);
    }

    public void sim (View view){
        Toast.makeText(this, "Opa, grato por apaertar ae ! ! !", Toast.LENGTH_LONG).show();
    }

    public void naosite (View view){
        setContentView(R.layout.tela3);
    }

    public void sair3 (View view) {
        System.exit(0);
    }
    public void vaza (View view) {
        System.exit(0);
    }

    public void simsite(View view){
        String url = "https://www.google.com.br";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

}
