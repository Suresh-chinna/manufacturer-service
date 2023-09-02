package com.manufacturer.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manufacturer.manage.entity.ManufacturerEntity;

@Repository
public interface ManufacturerDao extends JpaRepository<ManufacturerEntity, Integer> {

}
