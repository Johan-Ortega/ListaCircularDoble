package listacirculard;

import javax.swing.JOptionPane;

public class ListaCircularD {

    public static void main(String[] args) {
        ListaCD lista = new ListaCD();
        int opcion = 0, elemento;
        boolean eliminado = false;
        
        do {
                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un primer nodo\n"
                        + "2. Agregar un ultimo nodo\n"
                        + "3. Eliminar un nodo\n"
                        + "4. Mostrar la lista de primero a ultimo\n"
                        + "5. Mostrar la lista de ultimo a primero\n"
                        + "6. Salir\n"
                        + "¿Qué deseas hacer?", "Menú de opciones",
                        JOptionPane.INFORMATION_MESSAGE));

                switch (elemento) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo", "Agregando Nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlInicio(elemento);
                        break;

                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo", "Agregando Nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(elemento);
                        break;

                    case 3:
                    if (!lista.estaVacia()){
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo a eliminar", "Eliminando nodo de la lista circular doble",
                                JOptionPane.INFORMATION_MESSAGE));
                        
                        eliminado = lista.eliminar(elemento);
                        
                        if (eliminado){
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,
                                    "Eliminando nodos", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El elemento " + elemento + " no esta en la lista",
                                    "Elemento no encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Aun no hay nodos", "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                    
                    case 4:
                        if (!lista.estaVacia()) {
                            lista.MostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:
                        if (!lista.estaVacia()) {
                            lista.MostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menú",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                }
        } while (opcion != 7);
    }
}
