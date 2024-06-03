package practicas.pokemon.melissanavarro;

interface Elemental {
    String getElementType();

    int getEdad();
}

public class Pokemon {
    private String nombre;
    private int nivel;

    public Pokemon(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;

    }

    public void atacar() {
        System.out.println(nombre + " esta en ataque ");
    }

    public String getNombre() {
        return nombre;

    }

    public int getNivel() {
        return nivel;

    }
}