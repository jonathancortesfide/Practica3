package Practica01.demo.service.impl;

import Practica01.demo.domain.Arbol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Practica01.service.ArbolService;
import Practica01.demo.dao.ArbolDao;

@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolDao ArbolDao;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArboles() {
        var lista = ArbolDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        return ArbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        ArbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {
        ArbolDao.delete(arbol);
    }
}
