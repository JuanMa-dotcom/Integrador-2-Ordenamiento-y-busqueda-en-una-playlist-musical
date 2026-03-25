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
 * Clase que representa una canción en la playlist.
 * Equivalente al "Nodo" del proyecto anterior pero para arreglo.
 */
public class Cancion {
    public String nombre;
    public String artista;
    public String album;

    public Cancion(String nombre, String artista, String album) {
        this.nombre  = nombre;
        this.artista = artista;
        this.album   = album.isEmpty() ? "—" : album;
    }

    @Override
    public String toString() {
        return nombre + " — " + artista + " (" + album + ")";
    }
}