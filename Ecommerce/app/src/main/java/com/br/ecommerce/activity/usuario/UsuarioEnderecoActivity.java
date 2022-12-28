package com.br.ecommerce.activity.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.br.ecommerce.databinding.ActivityUsuarioEnderecoBinding;

public class UsuarioEnderecoActivity extends AppCompatActivity {

    private ActivityUsuarioEnderecoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUsuarioEnderecoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.include.textTitulo.setText("Meus Endereços");
        binding.include.include.ibVoltar.setOnClickListener(v -> finish());

        configCliques();
    }

    private void configCliques() {
        binding.include.btnAdd.setOnClickListener(view ->
                startActivity(new Intent(this, UsuarioFormEnderecoActivity.class))
        );
    }
}