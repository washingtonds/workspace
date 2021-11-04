package com.wdsestudos.hrworker.repositories;

import com.wdsestudos.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Long > {

}
