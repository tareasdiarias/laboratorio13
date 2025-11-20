package Categoria_service.controller;
import Categoria_service.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Categoria_service.model.Categoria;
import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
