import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damarisguzman
 */
public class Grado {
    private final String nombre;
    private final List<Juego> juegos;

    public Grado(String nombre, List<Juego> juegos) {
        this.nombre = nombre;
        this.juegos = juegos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Juego> getJuegos() {
        return juegos;
    }
}

