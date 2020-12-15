package listacirculard;

import javax.swing.JOptionPane;

public class ListaCD {

    private NodoD inicio, fin, ultimo;

    public ListaCD() {
        inicio = fin = null;
        ultimo = null;
    }

    //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //Metodo para agregar nodos al final
    public void agregarAlFinal(int el) {
        if (!estaVacia()) {
            fin = new NodoD(el, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoD(el);
        }
    }

    //Metodo para agregar al inicio
    public void agregarAlInicio(int el) {
        if (!estaVacia()) {
            inicio = new NodoD(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoD(el);
        }
    }

    //Metodo para mostrar la lista de inicio a fin
    public void MostrarListaInicioFin() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoD auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando lista de primero a ultimo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Metodo para mostrar la lista de fin a inicio
    public void MostrarListaFinInicio() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoD auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando lista de ultimo a primero", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Metodo para eliminar un nodo de la lista circular doble
    public boolean eliminar(int elemento) {
        NodoD actual;
        boolean encontrado = false;
        actual = ultimo;

        while(actual.siguiente != ultimo && !encontrado){
            encontrado = (actual.siguiente.dato == elemento);
            if (!encontrado){
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.dato == elemento);
        if (encontrado) {
            NodoD auxiliar = actual.siguiente;
            if (ultimo == ultimo.siguiente) {
                ultimo = null;
            } else {
                if (auxiliar == ultimo) {
                    ultimo = actual;
                }
                actual.siguiente = auxiliar.siguiente;
            }
            auxiliar = null;
        }
        return encontrado == true;
    }
}
