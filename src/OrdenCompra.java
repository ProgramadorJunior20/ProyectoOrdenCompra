import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {

    // Atributos
    private static Integer contador = 0;
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;


    public OrdenCompra(String descripcion) {
        this.identificador = ++contador;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto producto){
        for (int i = 0; i < productos.length; i++){
            if (productos[i] == null){
                productos[i] = producto;
                break;
            }
        }
    }

    public double getGranTotal() {
        double total = 0.0;
        for (Producto producto: productos){
            if (producto != null){
                total += producto.getPrecio();
            }
        }
        return total;
    }
}
