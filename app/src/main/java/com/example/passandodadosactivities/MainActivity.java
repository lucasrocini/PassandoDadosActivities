package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cria o intent para a segunda activity
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //instancia o objeto que sera passado como parametro para outra activity
                Usuario usuario = new Usuario("Lukalu", "lukinhasSK8@hotmail.com");

                //passar dados
                intent.putExtra("nome","Lucas Rocini");
                intent.putExtra("idade",28);
                intent.putExtra("objeto",usuario); //dado do tipo Usuario e permitido atraves do serializable

                //chama a activity
                startActivity( intent );
            }
        });

    }



}