package Producto_service.service;

import Producto_service.Repository.ProductoRepository;
import Producto_service.client.CategoriaClient;
import Producto_service.dto.Categoria;
import Producto_service.model.Producto;
import Producto_service.dto.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaClient categoriaClient;

    public Collection<Producto> listAll() {
        return productoRepository.findAll();
    }

    public ProductoResponse getProductoResponse(Long id) {
        Producto producto = productoRepository.findById(id).orElseThrow();
        Categoria categoria = categoriaClient.getCategoriaById(producto.getCategoriaId());
        ProductoResponse response = new ProductoResponse();
        response.setId(producto.getId());
        response.setNombre(producto.getNombre());
        response.setDescripcion(producto.getDescripcion());
        response.setPrecio(producto.getPrecio());
        response.setStock(producto.getStock());
        response.setCategoria(categoria);
        return response;
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }
}
