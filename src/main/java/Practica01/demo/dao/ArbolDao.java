package Practica01.demo.dao;

import Practica01.demo.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolDao extends JpaRepository <Arbol,Long> {
    
}