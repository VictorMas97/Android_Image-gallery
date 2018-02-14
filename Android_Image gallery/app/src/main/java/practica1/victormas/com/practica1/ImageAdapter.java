package practica1.victormas.com.practica1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter

{
    Context context;
    int[] data = null;


    public ImageAdapter(Context contextParam, int[] dataParam)
    {
        context = contextParam; // La variable "context" guerda el contexto que le has pasado por parámetro
        data = dataParam;  // La variable "data" guerda el array de int que le has pasado por parámetro
    }

    public int getCount() // Te devuelve la longitud de la variable "data"
    {
        return data.length;
    }

    public Object getItem(int position)  // Te devuelve un item
    {
        return data[position];
    }

    public long getItemId(int position) // Te devuelve el ID de un item
    {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent)  //Te devuelve la View
    {
        ImageView imageView;

        if (convertView == null)  //Si la variable "convertView" es iguel a null
        {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(100, 100)); // LImplementa una altura y una anchura a la imagen independientemente de sus parámetros
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP); // Controla cómo se debe redimensionar o mover la imagen para que coincida con el tamaño del ImageView
        }
        else //Si la variable "convertView" no es igual a null
        {
            imageView = (ImageView) convertView;  // La variable "convertView" es igual a la variable "convertView" que le has pasado como parámetro
        }

        imageView.setImageResource(data[position]); // La variable "convertView" coje el recurso que le has pasado como parámetro (la direccion de memoria de la imagen que has clickado)

        return imageView;
    }
}