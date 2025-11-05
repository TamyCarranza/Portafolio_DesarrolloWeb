package cr.tamara.tienda.domain;

public class Categoria {
    private Long idCategoria;
    private String descripcion;

    public Categoria(Long idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }

    public Long getIdCategoria() { return idCategoria; }
    public String getDescripcion() { return descripcion; }
}
