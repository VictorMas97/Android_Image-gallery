package practica1.victormas.com.practica1;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView img;
        int pos;

        img = findViewById(R.id.img); // La variable "img" busca por el ID a la ImageView creada en el "activity_image"
        pos = getIntent().getIntExtra("img",0);  // La variable "pos" coje tanto el Intent como su contenido extra
        img.setImageResource(pos); // Le pasa por parametro la dirección de memoria y le asigna a la variable "img" la imagen correspondiente a esa dirección
    }
}