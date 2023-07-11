import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        System.out.println("PIZZERIA");
        System.out.println("HACER UN PEDIDO");
        Pedido p = new Pedido("5/8/2020", "5/8/2020", "Carlos", 12);
        Pizza pizza1 = new Pizza("Muzzarella", 500);
        Pizza pizza2 = new Pizza("Fugazetta", 700);
        p.addDetallePedido(5, pizza1);
        p.addDetallePedido(3, pizza2);
        System.out.println("Pedido");
        System.out.println(p.toString());
        System.out.println();
        Factura f = p.facturar("5/6/2020", "20:05");
        System.out.println("FACTURA");
        System.out.println(f.toString());
    }
}
