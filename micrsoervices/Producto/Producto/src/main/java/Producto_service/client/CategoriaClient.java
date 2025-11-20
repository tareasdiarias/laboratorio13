package Producto_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import Producto_service.dto.Categoria;

@FeignClient(name = "categoria-service")
public interface CategoriaClient {
    @GetMapping("/api/categorias/{id}")
    Categoria getCategoriaById(@PathVariable Long id);
}
