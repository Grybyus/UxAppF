package quecomo.cl.sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class IngredienteArrayAdapter extends ArrayAdapter<Ingrediente>
{
    public IngredienteArrayAdapter(Context context, ArrayList<Ingrediente> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Ingrediente ingrediente = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_toolbar_layout, parent, false);
        }
        ImageView imagenIngrediente = (ImageView) convertView.findViewById(R.id.imagenIngre);
        TextView nombreIngrediente = (TextView) convertView.findViewById(R.id.nombreIngre);
        //TextView tipoIngrediente = (TextView) convertView.findViewById(R.id.);
        int id = getContext().getResources().getIdentifier(ingrediente.getImagen(), "drawable", getContext().getPackageName());
        imagenIngrediente.setImageDrawable(getContext().getResources().getDrawable(id));
        nombreIngrediente.setText(ingrediente.getNombre());
        //tipoIngrediente.setText(ingrediente.getTipo());
        LinearLayout layout = (LinearLayout)  convertView.findViewById(R.id.ingredienteview);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
        return convertView;
    }
}