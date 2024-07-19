package com.tienda.service;

import java.util.List;
import com.tienda.domain.Producto;

public interface ProductoService {
    //Se obtiene un listado de productos en un List
    public List <Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);

    //metodo de guardar
public void save(Producto producto);
//metodo de eliminar
public void delete(Producto producto);

}
