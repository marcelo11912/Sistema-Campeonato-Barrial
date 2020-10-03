package EstructurasDinamicas.LCD;

public class ListaCD {

    public Nodo cabecera;

    public ListaCD() {
        this.cabecera = null;
    }
     public boolean EsVacia() {
        return cabecera == null;
    }
     public void InsertarOrdenados(int id, String nombre, int puntos) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(new Equipo(id,nombre,puntos));
        if (EsVacia()) {
            cabecera = nuevo;
            cabecera.setSig(nuevo);
            cabecera.setAnt(nuevo);
        } else {
            Nodo aux = cabecera;
            boolean b = false;
            do {
                if (aux.getDato().getPuntos() > puntos) {
                    aux = aux.getSig();
                } else {

                    b = true;
                }
            } while (b == false && (aux != cabecera));
            if (cabecera.getDato().getPuntos()< puntos) {
                cabecera = nuevo;
            }
            nuevo.setSig(aux);
            nuevo.setAnt(aux.getAnt());
            nuevo.getSig().setAnt(nuevo);
            nuevo.getAnt().setSig(nuevo);
        }
    }

}












