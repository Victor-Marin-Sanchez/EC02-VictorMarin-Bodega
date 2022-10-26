package ec.marinVictor.Marin.service;

import java.util.List;

import ec.marinVictor.Marin.model.Cliente;

public interface ClienteService {
  List<Cliente> listar();
  Cliente obtener(Integer id);
  void guardar(Cliente cliente);
  void actualizar(Cliente cliente);
  void eliminar(Integer id);
}
