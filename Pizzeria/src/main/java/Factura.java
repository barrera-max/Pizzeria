import java.util.List;

public class Factura {
    private String fechaEmision;
    private String horaEmision;
    private int numero;
    private List<DetallePedido> detalleFactura;

    public Factura(String fechaEmision, String horaEmision) {
        this.fechaEmision = fechaEmision;
        this.horaEmision = horaEmision;
        this.numero = numero;
        ;
    }

    public void setDetalleFactura(List<DetallePedido> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }


    public String getDetalleFactura() {
        StringBuffer sb = new StringBuffer("Detalle Factura");
        for (DetallePedido d : detalleFactura
        ) {
            sb.append(d.toString());
        }
        return detalleFactura.toString();
    }

    public float calcularTotal() {
        float total = 0;
        for (DetallePedido d : detalleFactura) {
            total += d.getTotal();
        }
        return total;
    }

    public DetallePedido buscarItemsAFacturar(Pizza x) {
        for (DetallePedido d : detalleFactura) {
            if (d.getPizza().getNombre() == x.getNombre()) return d;
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append("Fecha ").append(fechaEmision).append('\'');
        sb.append(",Hora").append(horaEmision).append('\'');
        sb.append(",Numero").append(numero);
        sb.append(detalleFactura);
        sb.append("\nTOTAL $").append(calcularTotal());
        return sb.toString();
    }
}
