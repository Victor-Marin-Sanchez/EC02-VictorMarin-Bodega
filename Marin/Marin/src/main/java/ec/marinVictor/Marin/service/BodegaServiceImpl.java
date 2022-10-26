package ec.marinVictor.Marin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.marinVictor.Marin.model.Bodega;
import ec.marinVictor.Marin.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

  @Autowired
  private BodegaRepository repository;

  @Override
  public List<Bodega> listar() {
    return repository.findAll();
  }

  @Override
  public Bodega obtener(Integer id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void guardar(Bodega bodega) {
    repository.save(bodega);
  }

  @Override
  public void actualizar(Bodega bodega) {
    repository.saveAndFlush(bodega);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }
  
}
