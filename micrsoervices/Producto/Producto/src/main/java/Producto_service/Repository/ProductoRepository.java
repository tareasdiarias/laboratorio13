package Producto_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Producto_service.model.Producto;
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
