package com.bulgettrackersystem.data.repositories;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<PulsarProperties.Transaction,Long>{

}
