package ec.marinVictor.Marin.service;
import java.util.List;

import ec.marinVictor.Marin.model.Bodega;

public interface BodegaService {
  List<Bodega> listar();
  Bodega obtener(Integer id);
  void guardar(Bodega bodega);
  void actualizar(Bodega bodega);
  void eliminar(Integer id);
}
