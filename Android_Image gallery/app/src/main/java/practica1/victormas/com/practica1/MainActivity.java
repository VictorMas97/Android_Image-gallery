package practica1.victormas.com.practica1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView grid;
        final int[] images =    // Crea el Array de imagenes
                {
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                        R.drawable.fff, R.drawable.pacman,R.drawable.pirateria, R.drawable.videojuego,R.drawable.cascos, R.drawable.ac, R.drawable.androidf,
                };


        ImageAdapter adapter = new ImageAdapter(this, images);  //Crea el adaptador de tipo "ImageAdapter" y le pasa por parametros el contexto y el array de imagenes
        grid = findViewById(R.id.gridview); // La variable "grid" busca por el ID  el GridView creadp en el "activity_main"
        grid.setAdapter(adapter); // Asigna el adaptador "Adapter" a la variabl "grid"
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() // Asigna un "listener" a la variable "grid"
        {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long id)  // Se produce cuando un elemento del "grid" es clickeado
            {
                changeActivity(images[position]); // Cambia de actividad y le pasa por parametros la direccion de memoria de la imagen seleccionada o en la imagen donde se ha echo click
            }
        });
    }

    private void changeActivity(int image)  // Cambia de actividad
    {
        Intent intent = new Intent(this,ImageActivity.class); // Crea un Intent y le pasa por parametros el contexto y la clase a la que se quiere abrir
        intent.putExtra("img",image); // La variable "intent" pone como contenido extra el nombre del objeto y la direccion de memoria que le han pasado por parametro al metodo
        startActivity(intent); // Hace que la actividad se inicie y le pasas por parametro la variable "intent"
    }
}
