/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import py.edu.facitec.mec.model.Mantenimiento;

/**
 *
 * @author  Eduardo Espinola
 */
public interface MantenimientoDao {
    void guardar(Mantenimiento mantenimiento);
    Mantenimiento recuperarPorCodigo(int codigo); 
    void anular(int codigo);
    int obtenerMaximo();
    
}
