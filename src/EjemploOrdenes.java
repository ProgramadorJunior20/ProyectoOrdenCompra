public class EjemploOrdenes {
    public static void main(String[] args) {
        /*OrdenCompra computadoras = new OrdenCompra("Estas son computadoras portátil, con 12GB de ram.");
        computadoras.addProducto(new Producto("HP", "Portátil HP", 1200))
                .addProducto(new Producto("IOS", "Macbook Air", 2000))
                .addProducto(new Producto("Lenovo", "Portátil Lenovo IdeaPad", 1000))
                .addProducto(new Producto("Asus", "Portátil Asus Vivobook", 1000));

        OrdenCompra telefonos = new OrdenCompra("Estos son teléfonos inteligente, con 6GB de ram.");
        telefonos.addProducto(new Producto("Xiami", "Redmi 8", 250))
                .addProducto(new Producto("IOS", "Iphone 6 plus", 300))
                .addProducto(new Producto("Samsung", "Samsung A21", 150))
                .addProducto(new Producto("Xiami", "Xiami 12", 450));

        OrdenCompra televisores = new OrdenCompra("Estos son Smart Tv, de 32 pulgadas.");
        televisores.addProducto(new Producto("LG", "Televisor Led 4K HD Negro", 350))
                .addProducto(new Producto("Samsung", "Televisor HD", 150))
                .addProducto(new Producto("Hyundai", "Smart Tv 4K UHD", 200))
                .addProducto(new Producto("Challenger", "Televisor Led Android", 190)); */

        Cliente cliente1 = new Cliente("Juan", "Perez");
        Cliente cliente2 = new Cliente("María", "López");
        Cliente cliente3 = new Cliente("Pedro", "González");

        Producto computadora1 = new Producto("HP", "Portátil HP", 1200);
        Producto computadora2 = new Producto("IOS", "Macbook Air", 2000);
        Producto computadora3 = new Producto("Lenovo", "Portátil Lenovo IdeaPad", 1000);
        Producto computadora4 = new Producto("Asus", "Portátil Asus Vivobook", 1000);

        OrdenCompra orden1 = new OrdenCompra("computadoras portátil, con 12GB de ram.");
        orden1.setCliente(cliente1);
        orden1.addProducto(computadora1);
        orden1.addProducto(computadora2);
        orden1.addProducto(computadora3);
        orden1.addProducto(computadora4);

        Producto telefono1 = new Producto("Xiami", "Redmi 8", 250);
        Producto telefono2 = new Producto("IOS", "Iphone 6 plus", 300);
        Producto telefono3 = new Producto("Samsung", "Samsung A21", 150);
        Producto telefono4 = new Producto("Xiami", "Xiami 12", 450);

        OrdenCompra orden2 = new OrdenCompra("teléfonos inteligentes, con 6GB de ram.");
        orden2.setCliente(cliente2);
        orden2.addProducto(telefono1);
        orden2.addProducto(telefono2);
        orden2.addProducto(telefono3);
        orden2.addProducto(telefono4);

        Producto televisor1 = new Producto("LG", "Televisor Led 4K HD Negro", 350);
        Producto televisor2 = new Producto("Samsung", "Televisor HD", 150);
        Producto televisor3 = new Producto("Hyundai", "Smart Tv 4K UHD", 200);
        Producto televisor4 = new Producto("Challenger", "Televisor Led Android", 190);

        OrdenCompra orden3 = new OrdenCompra("Smart Tv, de 32 pulgadas.");
        orden3.setCliente(cliente3);
        orden3.addProducto(televisor1);
        orden3.addProducto(televisor2);
        orden3.addProducto(televisor3);
        orden3.addProducto(televisor4);

        System.out.println("Imprimir");
        imprimirOrden(orden1);
        imprimirOrden(orden2);
        imprimirOrden(orden3);
    }

    public static void imprimirOrden(OrdenCompra orden) {
        System.out.println("Identificador: " + orden.getIdentificador());
        System.out.println("Descripción: " + orden.getDescripcion());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Clientes: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());


        System.out.println("Productos");
        for (Producto producto: orden.getProductos()){
            if (producto != null){
                System.out.println("Fabricante: " + producto.getFabricante());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio());
            }
        }

        System.out.println("Gran total: " + orden.getGranTotal());
        System.out.println("-----------------------------------");
    }
}
