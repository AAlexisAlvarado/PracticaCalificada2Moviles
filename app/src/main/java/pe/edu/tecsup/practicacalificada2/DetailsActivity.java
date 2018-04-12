package pe.edu.tecsup.practicacalificada2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extras = getIntent().getExtras();
        String nombre = "";
        if (extras != null) {
            nombre = extras.getString("nombre");
        }

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvNombre.setText(nombre);
    }
}
