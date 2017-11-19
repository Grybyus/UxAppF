package quecomo.cl.sample;

import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by KuroDesktop on 19-11-2017.
 */

public class RecetaSort implements Comparator<Receta> {
    HashMap<Receta,Integer> puntaje;
    public RecetaSort(HashMap<Receta,Integer> puntaje) {
        this.puntaje=puntaje;
    }

    @Override
    public int compare(Receta r, Receta t1) {
        return this.puntaje.get(t1)-this.puntaje.get(r);
    }
}
