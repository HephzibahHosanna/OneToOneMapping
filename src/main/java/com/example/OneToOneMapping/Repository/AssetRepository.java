package com.example.OneToOneMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OneToOneMapping.Entity.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset,Long>{

}
