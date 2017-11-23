package quecomo.cl.sample;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;



public class FrutasFragment extends Fragment {
    private GridView gridView;
    ArrayList<Drawable> allDrawableImages = new ArrayList<>();

    private HorizontalCoordinatorNtbActivity actividad;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_frutas, null);
        getAllWidgets(rootView);
        allDrawableImages.clear();
        setAdapter();
        return rootView;
    }
    private void getAllWidgets(View view) {
        gridView = (GridView) view.findViewById(R.id.gridViewFrutas);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Ingrediente ingredienteBuscado = HorizontalCoordinatorNtbActivity.listaDeFrutas.get(position);
            if(!HorizontalCoordinatorNtbActivity.canasta.contains(ingredienteBuscado)){
                HorizontalCoordinatorNtbActivity.canasta.add(ingredienteBuscado);
                ((HorizontalCoordinatorNtbActivity)getActivity()).setVisibilidadCanasta(true);
                HorizontalCoordinatorNtbActivity.listView.invalidateViews();
            }else{
                HorizontalCoordinatorNtbActivity.canasta.remove(ingredienteBuscado);
                if(HorizontalCoordinatorNtbActivity.canasta.isEmpty()){
                    ((HorizontalCoordinatorNtbActivity)getActivity()).setVisibilidadCanasta(false);
                }
                HorizontalCoordinatorNtbActivity.listView.invalidateViews();
            }



            }
        });
    }
    private void setAdapter()
    {
        allDrawableImages.clear();
        for(Ingrediente fruta: HorizontalCoordinatorNtbActivity.listaDeFrutas){
            int resId = this.getResources().getIdentifier(fruta.getImagen(),"drawable",this.getContext().getPackageName());
            allDrawableImages.add(getResources().getDrawable(resId));
        }
        GridViewAdapter gridViewAdapter = new GridViewAdapter(HorizontalCoordinatorNtbActivity.getInstance(), allDrawableImages);
        gridView.setAdapter(gridViewAdapter);
    }
}