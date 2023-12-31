import java.sql.SQLOutput;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("PIZZERIA");
        System.out.println("HACER UN PEDIDO");
        int n;
        Pedido p = new Pedido();
        Pizza pizza1 = new Pizza("Muzzarella", 500);
        Pizza pizza2 = new Pizza("Fugazetta", 700);
        int op = -1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MENU\n" +
                    "1.Realizar un pedido\n" +
                    "2.Agregar al pedido\n" +
                    "3.Facturar pedido\n" +
                    "4.Ver pedidos\n" +
                    "5.");
            System.out.println("SELECCIONAR OPCION: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy");
                    String fechaCreacion = dateFormat.format(new Date());
                    String fechaEntrega = dateFormat.format(new Date());
                    System.out.println("Nombre Cliente: ");
                    String nombreCliente = sc.next();
                    int numero = 0;
                    p = new Pedido(fechaCreacion, fechaEntrega, nombreCliente, numero);
                    System.out.println("PIZZAS DISPONIBLES: ");
                    System.out.println("1." + pizza1);
                    System.out.println("2." + pizza2);
                    System.out.println("Seleccione el tipo de pizza: ");
                    int t = sc.nextInt();
                    System.out.println("Agregar al pedido: ");
                    n = sc.nextInt();
                    if( t == 1) p.addDetallePedido(n, pizza1);
                    else p.addDetallePedido(n, pizza2);
                    System.out.println(p);
                    break;
                case 2:
                    System.out.println("AGREGAR AL PEDIDO\n");
                    System.out.println("PIZZAS DISPONIBLES: ");
                    System.out.println("1." + pizza1);
                    System.out.println("2." + pizza2);
                    System.out.println("Seleccione el tipo de pizza: ");
                    int tipo = sc.nextInt();
                    System.out.println("Agregar al pedido: ");
                    n = sc.nextInt();
                    if( tipo == 1) p.addDetallePedido(n, pizza1);
                    else p.addDetallePedido(n, pizza2);
                    System.out.println(p);

                    break;

            }
        } while (op != 0);
    }
}
