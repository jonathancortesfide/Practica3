package Practica01.service;

import Practica01.demo.domain.Arbol;
import java.util.List;

public interface ArbolService{
    
    // Se obtiene un listado de arboles en un List
    public List<Arbol> getArboles();
    
    // Get a Arbol, based on the ID of a category
    public Arbol getArbol(Arbol arbol);

    // Insert a new Arbol if the category ID is empty
    // Update a Arbol if the category ID is NOT empty
    public void save(Arbol arbol);

    // Delete the Arbol that has the ID passed as a parameter
    public void delete(Arbol arbol);
 
}