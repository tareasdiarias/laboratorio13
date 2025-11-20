package Producto_service.Controller;
import Producto_service.dto.ProductoResponse;
import Producto_service.model.Producto;
import Producto_service.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAll() {
        return (List<Producto>) productoService.listAll();
    }

    @GetMapping("/{id}")
    public ProductoResponse getById(@PathVariable Long id) {
        return productoService.getProductoResponse(id);
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productoService.delete(id);
    }
}

