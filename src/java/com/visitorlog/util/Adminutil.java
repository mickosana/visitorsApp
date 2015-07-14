/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visitorlog.util;

import com.visitorlog.DTO.AdminDTO;
import com.visitorlog.DTO.VisitorDTO;
import com.visitorlog.Data.Admin;
import com.visitorlog.Data.Visitor;
import com.visitorlog.transfer.ResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CodeTribe1
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class Adminutil {
    @PersistenceContext
    EntityManager em;
    private static final Logger LOG = Logger.getLogger(Adminutil.class.getName());
    
    public ResponseDTO RegisterAdmin (AdminDTO ad){
        ResponseDTO res = new ResponseDTO();
                try{
                    Admin admin = new Admin();
                    admin.setEmail(ad.getEmail());
                    admin.setPassword(ad.getPassword());
                    admin.setUsername(ad.getUsername());
                    res.setAdmin(ad);
                    em.persist(admin);
                }
                catch(Exception e){
                    LOG.log(Level.SEVERE,e.getMessage());
                    
                }
                return res;
               
    }
    public ResponseDTO Getallvisitors (VisitorDTO vs){
        ResponseDTO res = new ResponseDTO();
              try {
                    Query q =em.createNamedQuery("Visitor.findAll",Visitor.class);
             List<Visitor> vlist  = q.getResultList();
             List<VisitorDTO> dto = new ArrayList<>();
             for(Visitor vst: vlist){
                 dto.add(new  VisitorDTO(vst));
                              }
                 res.setVisitorList(dto);
              
             
        } catch (Exception e) {
        }
            return res;
    }
              
        }
        
    

