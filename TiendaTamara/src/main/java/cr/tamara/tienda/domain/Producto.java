package cr.tamara.tienda.domain;

public class Producto {
    private Long idProducto;
    private String descripcion;
    private double precio;
    private String rutaImagen;
    private Categoria categoria;

    public Producto(Long idProducto, String descripcion, double precio, String rutaImagen, Categoria categoria) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
        this.categoria = categoria;
    }

    public Long getIdProducto() { return idProducto; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public String getRutaImagen() { return rutaImagen; }
    public Categoria getCategoria() { return categoria; }
}
