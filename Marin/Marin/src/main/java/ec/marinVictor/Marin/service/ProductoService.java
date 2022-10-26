package ec.marinVictor.Marin.service;

import java.util.List;

import ec.marinVictor.Marin.model.Producto;


public interface ProductoService {
  List<Producto> listar();
  Producto obtener(Integer id);
  void guardar(Producto producto);
  void actualizar(Producto producto);
  void eliminar(Integer id);
}
