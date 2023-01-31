package com.lsinformatica.crudjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsinformatica.crudjava.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
