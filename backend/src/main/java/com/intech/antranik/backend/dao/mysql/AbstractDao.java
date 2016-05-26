package com.intech.antranik.backend.dao.mysql;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;

import com.intech.antranik.backend.dao.constants.DataUnits;

/**
 * Clase padre de todas las implementaciones DAO. Posee la propiedad Entity
 * Manager. Central para el manejo de persistencia en JPA.
 * 
 * @author Franco Ariel Salonia
 *
 */
public class AbstractDao {

    /** Atributo encargado del manejo de persistencia. */
    @PersistenceContext(unitName = DataUnits.ANTRANIK_UNIT, type = PersistenceContextType.TRANSACTION)
    @Autowired
    protected EntityManager entityManager;

    /**
     * Establece el manejador de entidades para la persistencia.
     * 
     * @param entityManager
     *            el manejador de entidades.
     */
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
