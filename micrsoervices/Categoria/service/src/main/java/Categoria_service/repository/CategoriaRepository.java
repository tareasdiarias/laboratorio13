package Categoria_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Categoria_service.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}