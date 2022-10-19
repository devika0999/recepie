package com.nestdigital.recepie_backend.dao;

import com.nestdigital.recepie_backend.model.RecepieModel;
import org.springframework.data.repository.CrudRepository;

public interface RecepieDao extends CrudRepository<RecepieModel,Integer> {
}
