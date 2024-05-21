

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damarisguzman
 */

public class Juego {
    private final String titulo;
    private final String imagen;
    private final String ruta;
    private final String descripcion;

    public Juego(String titulo, String imagen, String ruta, String descripcion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.ruta = ruta;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public String getRuta() {
        return ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}