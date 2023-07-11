public class Pizza {
    private String nombre;
    private float precio;

    public Pizza(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public float calcularPrecio(int cantidad) {
        return cantidad * precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" Pizza ");
        sb.append(nombre).append('\'');
        sb.append(",Precio $").append(precio);
        return sb.toString();
    }
}
