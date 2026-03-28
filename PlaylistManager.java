/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorplaylist;

/**
 *
 * @author jv134
 */
/**
 * Gestiona la playlist usando un arreglo de tamaño fijo.
 * Implementa QuickSort recursivo y búsqueda binaria.
 * NO usa funciones predefinidas de ordenamiento o búsqueda.
 */
public class PlaylistManager {

    // ── Arreglo fijo — tamaño no cambia durante ejecución ──────────
    private Cancion[] playlist;
    private int tamanio;

    // Constantes para elegir criterio de ordenamiento
    public static final int ORDENAR_POR_NOMBRE  = 0;
    public static final int ORDENAR_POR_ARTISTA = 1;

    private int criterioActual = ORDENAR_POR_NOMBRE;

    public PlaylistManager(int capacidad) {
        playlist = new Cancion[capacidad];
        tamanio  = 0;
    }

    // ── Agregar canción al arreglo ──────────────────────────────────
    public boolean agregar(String nombre, String artista, String album) {
        if (tamanio >= playlist.length) return false; // arreglo lleno
        playlist[tamanio] = new Cancion(nombre, artista, album);
        tamanio++;
        return true;
    }

    //Obtener copia del arreglo actual (para poder mostrarlo en la tabla)
    public Cancion[] getPlaylist() {
        Cancion[] copia = new Cancion[tamanio];
        for (int i = 0; i < tamanio; i++) copia[i] = playlist[i];
        return copia;
    }

    public int getTamanio()    { return tamanio; }
    public int getCapacidad()  { return playlist.length; }
    public boolean estaLleno() { return tamanio >= playlist.length; }
    public boolean estaVacia() { return tamanio == 0; }

    
    //QUICKSORT RECURSIVO
    

    /**
     * Punto de entrada del QuickSort.
     * @param criterio ORDENAR_POR_NOMBRE o ORDENAR_POR_ARTISTA
     */
    public void quickSort(int criterio) {
        this.criterioActual = criterio;
        quickSortRecursivo(playlist, 0, tamanio - 1);
    }

    /**
     * QuickSort recursivo — NO usa funciones predefinidas.
     */
    private void quickSortRecursivo(Cancion[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivot = particionar(arr, inicio, fin);
            quickSortRecursivo(arr, inicio, indicePivot - 1); // lado izquierdo
            quickSortRecursivo(arr, indicePivot + 1, fin);    // lado derecho
        }
    }

    /**
     * Particion del QuickSort usando el ultimo elemento como pivote.
     */
    private int particionar(Cancion[] arr, int inicio, int fin) {
        Cancion pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (comparar(arr[j], pivote) <= 0) {
                i++;
                // Intercambiar arr[i] y arr[j]
                Cancion temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Colocar pivote en su posición correcta
        Cancion temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }

    /**
     * Compara dos canciones según el criterio actual.
     * Retorna negativo, 0 o positivo (como compareTo estándar).
     */
    private int comparar(Cancion a, Cancion b) {
        if (criterioActual == ORDENAR_POR_ARTISTA) {
            return a.artista.compareToIgnoreCase(b.artista);
        }
        return a.nombre.compareToIgnoreCase(b.nombre);
    }

    
    //  BUSQUEDA BINARIA (requiere arreglo ordenado)
   

    /**
     * Búsqueda binaria por nombre de cancion.
     * El arreglo debe estar ordenado por nombre antes de llamar esto.
     * @param nombreBuscado nombre exacto o parcial
     * @return índice encontrado o -1 si no existe
     */
    public int buscarPorNombre(String nombreBuscado) {
        return busquedaBinaria(playlist, 0, tamanio - 1, nombreBuscado, ORDENAR_POR_NOMBRE);
    }

    /**
     * Busqueda binaria por artista.
     * El arreglo debe estar ordenado por artista antes de llamar a este metodo
     */
    public int buscarPorArtista(String artistaBuscado) {
        return busquedaBinaria(playlist, 0, tamanio - 1, artistaBuscado, ORDENAR_POR_ARTISTA);
    }

    /**
     * Busqueda binaria recursiva — NO usa funciones predefinidas.
     */
    private int busquedaBinaria(Cancion[] arr, int inicio, int fin, String busqueda, int criterio) {
        if (inicio > fin) return -1; // no encontrado

        int medio = (inicio + fin) / 2;
        String valorMedio = (criterio == ORDENAR_POR_ARTISTA)
            ? arr[medio].artista
            : arr[medio].nombre;

        int cmp = busqueda.compareToIgnoreCase(valorMedio);

        if (cmp == 0) {
            return medio; // encontrado
        } else if (cmp < 0) {
            return busquedaBinaria(arr, inicio, medio - 1, busqueda, criterio); // buscar izquierda
        } else {
            return busquedaBinaria(arr, medio + 1, fin, busqueda, criterio);    // buscar derecha
        }
    }

    /**
     * Obtener cancion por indice.
     */
    public Cancion getCancion(int indice) {
        if (indice < 0 || indice >= tamanio) return null;
        return playlist[indice];
    }
}