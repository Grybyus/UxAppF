package quecomo.cl.sample;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


public class CarnesFragment extends Fragment {
    private GridView gridView;
    ArrayList<Drawable> allDrawableImages = new ArrayList<>();
    private TypedArray allImages;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_carnes, null);
        getAllWidgets(rootView);
        setAdapter();
        return rootView;
    }
    private void getAllWidgets(View view) {
        gridView = (GridView) view.findViewById(R.id.gridViewCarnes);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+position);
                if (Ingrediente.comprobarSiExisteIngredienteEnLista(position,HorizontalCoordinatorNtbActivity.canasta) == false) {
                    Ingrediente ingredienteBuscado = Ingrediente.buscarIngredientePorID(position, HorizontalCoordinatorNtbActivity.listaDeCarnes);
                    HorizontalCoordinatorNtbActivity.canasta.add(ingredienteBuscado);
                    System.out.println(HorizontalCoordinatorNtbActivity.canasta.size());
                    HorizontalCoordinatorNtbActivity.listView.invalidateViews();
                }
            }
        });
        allImages = getResources().obtainTypedArray(R.array.all_images_carnes);
    }
    private void setAdapter()
    {
        for (int i = 0; i < allImages.length(); i++) {
            allDrawableImages.add(allImages.getDrawable(i));
        }
        GridViewAdapter gridViewAdapter = new GridViewAdapter(HorizontalCoordinatorNtbActivity.getInstance(), allDrawableImages);
        gridView.setAdapter(gridViewAdapter);
    }
}