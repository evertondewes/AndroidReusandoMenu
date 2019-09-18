package com.example.androidreusandomenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Template extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.cadastrar_pessoa :
                i = new Intent(this, CadastrarPessoa.class);
                this.startActivity(i);
                break;
            case R.id.listar_pessoas:
                i = new Intent(this, ListarPessoas.class);
                this.startActivity(i);
                break;
            case R.id.sobre:
                Toast.makeText(this, "Exemplo Herança Menu", Toast.LENGTH_LONG).show();
                break;
            case R.id.versao:
                Toast.makeText(this, "Versão 1.2.3.4.5", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}