package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        //recuperar os dados que foram enviado
        Bundle dados = getIntent().getExtras();

        //recupera os dados passados de acordo com a "chave"
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

        //recuperar dados serializados
        Usuario usuario = (Usuario) dados.getSerializable("objeto"); //cast do tipo Serializable para tipo Usuario

        //setar valores nos TextView
        //textNome.setText(nome);
        textNome.setText(usuario.getEmail());
        textIdade.setText(String.valueOf(idade));

    }
}