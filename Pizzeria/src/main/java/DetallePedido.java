public class DetallePedido {
    private int cantidad;
    private float total;
    private Pizza pizza;

    public DetallePedido(int cantidad, Pizza pizza) {
        this.cantidad = cantidad;
        this.total = pizza.calcularPrecio(cantidad);
        this.pizza = pizza;
    }

    public Float getTotal() {
        return total;
    }

    public Pizza getPizza(){
        return pizza;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\tDetallePedido ");
        sb.append("| Cantidad ").append(cantidad);
        sb.append("| TOTAL $").append(total);
        sb.append(" | ");sb.append(pizza);
        sb.append('|');
        return sb.toString();
    }
}
