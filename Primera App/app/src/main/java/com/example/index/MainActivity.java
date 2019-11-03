package com.example.index;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button) findViewById(R.id.Boton);
        final EditText editText=(EditText) findViewById(R.id.editText3);
        String textTraslado;
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hola:)",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),Main2Activity.class);
                final String textTraslado=editText.getText().toString();
                intent.putExtra("Valor", textTraslado);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Hola desde Start",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {

      super.onStop();
        Toast.makeText(this,"Hola desde Stop",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Hola desde Destroy",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Hola desde Pause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Hola desde Resume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Hola desde Restart",Toast.LENGTH_SHORT).show();
    }

}
