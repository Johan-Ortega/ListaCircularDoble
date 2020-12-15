package listacirculard;

public class NodoD {

    public int dato;
    NodoD siguiente, anterior;

    //Constructor para cuando no hay nodos
    public NodoD(int el) {
        this(el, null, null);
    }

    //Constructor para cuando ya hay nodos
    public NodoD(int el, NodoD s, NodoD a) {
        dato = el;
        siguiente = s;
        anterior = a;
    }
}
