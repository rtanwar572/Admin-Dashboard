package com.Dashboard.repo;

import com.Dashboard.model.DataPoint;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DataPointRepository extends JpaRepository<DataPoint, Long> {

}



