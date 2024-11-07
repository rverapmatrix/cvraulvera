package com.example.applista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView estudiantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estudiantes = (ListView) findViewById(R.id.listEstudiantes);

        //array dinamicos
        ArrayList<String> listas = new ArrayList();

        listas.add("Jose Lopez");
        listas.add("Andrea Barrientos");
        listas.add("Pedro Espinoza");
        listas.add("Oscar Rojas");
        listas.add("Pamela Correa");
        listas.add("Oscar ortiz");

        ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,listas);
        estudiantes.setAdapter(adapter);

        estudiantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Posicion: "+adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
