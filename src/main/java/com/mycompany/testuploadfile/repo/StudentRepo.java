/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uploadfile.repo;

import com.mycompany.uploadfile.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Best
 */
public interface StudentRepo extends JpaRepository<Student, Integer>{
    
}
