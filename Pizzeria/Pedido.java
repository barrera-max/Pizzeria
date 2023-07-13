import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int generador;
    private String fechaCreacion;
    private String fechaEntrega;
    private String nombreCliente;
    private int numero;
    private List<DetallePedido> detallePedido;

    public Pedido(){
    }

    public Pedido(String fechaCreacion, String fechaEntrega, String nombreCliente, int numero) {
        this.fechaCreacion = fechaCreacion;
        this.fechaEntrega = fechaEntrega;
        this.nombreCliente = nombreCliente;
        this.numero = generador ++;
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
        final StringBuilder sb = new StringBuilder("PEDIDO |");
        sb.append("Fecha de creacion:'").append(fechaCreacion).append("'");
        sb.append(", Fecha de entrega:' ").append(fechaEntrega).append("'");
        sb.append("| Cliente: ").append(nombreCliente);
        sb.append("| Numero de Pedido:").append(numero);
        sb.append('\n');
        for (DetallePedido d: detallePedido
             ) {
            sb.append(d.toString());
        }
        return sb.toString();
    }
}
