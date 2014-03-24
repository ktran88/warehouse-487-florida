/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Zearf
 */
@Stateless
public class OnTransitFacade extends AbstractFacade<OnTransit> {
    @PersistenceContext(unitName = "soen487-warehouse-pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OnTransitFacade() {
        super(OnTransit.class);
    }
    
}
