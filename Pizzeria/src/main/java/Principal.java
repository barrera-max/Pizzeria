import java.sql.SQLOutput;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("PIZZERIA");
        System.out.println("HACER UN PEDIDO");
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
                    Pedido p = new Pedido(fechaCreacion, fechaEntrega, nombreCliente, numero);
                    System.out.println("PIZZAS DISPONIBLES: ");
                    System.out.println("1." + pizza1);
                    System.out.println("2." + pizza2);
                    System.out.println("Seleccione el tipo de pizza: ");
                    int t = sc.nextInt();
                    switch (t){
                        case 1:

                    }
                    System.out.println("Agregar al pedido: ");
                    int n = sc.nextInt();
                    p.addDetallePedido(n, pizza1);
                    System.out.println(p);
                    break;
                case 2:
                    break;
            }
        } while (op != 0);
    }
}
