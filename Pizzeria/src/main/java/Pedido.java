import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String fechaCreacion;
    private String fechaEntrega;
    private String nombreCliente;
    private int numero;
    private List<DetallePedido> detallePedido;

    public Pedido(String fechaCreacion, String fechaEntrega, String nombreCliente, int numero) {
        this.fechaCreacion = fechaCreacion;
        this.fechaEntrega = fechaEntrega;
        this.nombreCliente = nombreCliente;
        this.numero = numero;
        this.detallePedido = new ArrayList<>();
    }

    public void addDetallePedido(int cant, Pizza pizza) {
        detallePedido.add(new DetallePedido(cant, pizza));
    }

    public Factura facturar(String fecha, String hora) {
        Factura f = new Factura(fecha, hora);
        f.setDetalleFactura(detallePedido);
        return f;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append("fechaCreacion='").append(fechaCreacion).append('\'');
        sb.append(", fechaEntrega='").append(fechaEntrega).append('\'');
        sb.append(", nombreCliente='").append(nombreCliente).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('\n');
        sb.append(detallePedido);
        return sb.toString();
    }
}
