package us.com.alberto.logica;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import us.com.alberto.models.Partido;

public class Logica {

    private static Logica INSTANCE = null;

    private ObservableList<Partido> listaPartidos = FXCollections.observableArrayList();

    private Logica() {
    }

    public static Logica getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Logica();
        return INSTANCE;
    }

    public void añadirPartido(Partido partido){
        listaPartidos.add(partido);
    }

    public void borrarPartido(Partido partido){
        listaPartidos.remove(partido);
    }

    public ObservableList<Partido> getListaPartidos() {
        return listaPartidos;
    }
}
