/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Servicio;

/**
 *
 * @author  Eduardo Espinola
 */
public interface ServicioDao {
    
    void insertar(Servicio serv);
    void modificar(Servicio serv);
    Servicio recuperarPorCodigo(int codigo);
    List<Servicio> recuperarPorFiltro(String filtro);
    void eliminar(int codigo);
}
