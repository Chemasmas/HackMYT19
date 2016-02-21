package appambiental2016.hackmty.hack2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PreguntaTipo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_tipo1);
        findViewById(R.id.respuesta1p1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PreguntaTipo1.this, Pregunta2.class));
            }
        });
        findViewById(R.id.respuesta2p1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PreguntaTipo1.this, Pregunta4.class));
            }
        });
        findViewById(R.id.respuesta3p1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PreguntaTipo1.this, Pregunta2.class));
            }
        });
    }
}
