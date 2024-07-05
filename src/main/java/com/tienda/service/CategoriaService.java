package com.tienda.service;

import java.util.List;
import com.tienda.domain.Categoria;

public interface CategoriaService {
    //Se obtiene un listado de categorias en un List
    public List <Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);

    //metodo de guardar
public void save(Categoria categoria);
//metodo de eliminar
public void delete(Categoria categoria);

}
