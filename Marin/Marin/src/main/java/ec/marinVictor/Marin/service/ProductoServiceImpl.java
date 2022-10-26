package ec.marinVictor.Marin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.marinVictor.Marin.model.Producto;
import ec.marinVictor.Marin.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

  @Autowired
  private ProductoRepository repository;
  
  @Override
  public List<Producto> listar() {
    return repository.findAll();
  }

  @Override
  public Producto obtener(Integer id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void guardar(Producto producto) {
    repository.save(producto);
  }

  @Override
  public void actualizar(Producto producto) {
    repository.saveAndFlush(producto);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }
  
}
