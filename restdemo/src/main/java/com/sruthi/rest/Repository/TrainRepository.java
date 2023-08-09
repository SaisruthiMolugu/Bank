package com.sruthi.rest.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sruthi.rest.entity.Train;
public interface TrainRepository extends JpaRepository<Train,Integer>
{


}
