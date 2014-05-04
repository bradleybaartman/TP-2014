/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.repository;

import com.mycompany.domainrepository.domain.Spirits;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Bradz
 */
public interface SpiritsRepository extends JpaRepository<Spirits, Integer>{
}
