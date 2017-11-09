package quecomo.cl.sample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecetaArrayAdapter extends ArrayAdapter<Receta>
{
    public RecetaArrayAdapter(Context context, ArrayList<Receta> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Receta receta = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        ImageView imagenReceta = (ImageView) convertView.findViewById(R.id.imagenreceta);
        TextView nombreReceta = (TextView) convertView.findViewById(R.id.nombrereceta);
        TextView descripcionReceta = (TextView) convertView.findViewById(R.id.descripcionreceta);
        int id = getContext().getResources().getIdentifier(receta.getNombreImagen(), "drawable", getContext().getPackageName());
        imagenReceta.setImageDrawable(getContext().getResources().getDrawable(id));
        nombreReceta.setText(receta.getNombre());
        descripcionReceta.setText(receta.getDescripcion());
        LinearLayout layout = (LinearLayout)  convertView.findViewById(R.id.linear);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent newIntent = new Intent(v.getContext(), DetalleRecetaActivity.class);
                newIntent.putExtra("id", receta.getId() + "");
                v.getContext().startActivity(newIntent);
            }
        });
        return convertView;
    }
}