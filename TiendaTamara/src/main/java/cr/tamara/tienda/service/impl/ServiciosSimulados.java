package cr.tamara.tienda.service.impl;

import cr.tamara.tienda.domain.Categoria;
import cr.tamara.tienda.domain.Producto;
import cr.tamara.tienda.service.CategoriaService;
import cr.tamara.tienda.service.ProductoService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Override
    public List<Categoria> getCategorias() {
        return Arrays.asList(
            new Categoria(1L, "Laptops"),
            new Categoria(2L, "Monitores"),
            new Categoria(3L, "Accesorios"),
            new Categoria(4L, "Componentes")
        );
    }
}

@Service
public class ProductoServiceImpl implements ProductoService {
    @Override
    public List<Producto> getProductos() {
        var laptops = new Categoria(1L, "Laptops");
        var monitores = new Categoria(2L, "Monitores");
        var accesorios = new Categoria(3L, "Accesorios");

        return Arrays.asList(
            new Producto(1L, "Laptop Dell Inspiron", 550000, "https://via.placeholder.com/200", laptops),
            new Producto(2L, "Monitor ASUS 24\"", 135000, "https://via.placeholder.com/200", monitores),
            new Producto(3L, "Teclado Mecánico Logitech", 45000, "https://via.placeholder.com/200", accesorios),
            new Producto(4L, "Mouse Razer DeathAdder", 38000, "https://via.placeholder.com/200", accesorios),
            new Producto(5L, "SSD Kingston 1TB", 82000, "https://via.placeholder.com/200", accesorios)
        );
    }
}
