/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.repository;

import com.mycompany.domainrepository.domain.Liquer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Bradz
 */
public interface LiquerRepository extends JpaRepository<Liquer, Integer>{
    
}
