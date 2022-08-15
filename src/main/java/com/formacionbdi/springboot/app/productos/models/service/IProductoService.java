package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;

public interface IProductoService {

	/**
	 * Busca todos los registros almacenados en la BBDD
	 * @return
	 */
	public List<Producto> findAll();
	
	/**
	 * Metodo que recibe por parametro en id del producto que queremos buscar, y devueve solo ese
	 * @param id
	 * @return
	 */
	public Producto findById(Long id);
}
