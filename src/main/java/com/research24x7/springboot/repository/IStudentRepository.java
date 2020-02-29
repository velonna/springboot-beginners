
package com.research24x7.springboot.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.research24x7.springboot.model.StudentEntity;


@Repository
public interface IStudentRepository extends PagingAndSortingRepository<StudentEntity, String> {
}
