package org.example.serviceclient.repositories;

import org.example.serviceclient.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface de dépôt pour l'entité Client.
 * Fournit les opérations CRUD de base grâce à JpaRepository.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
    // Les méthodes CRUD sont héritées de JpaRepository
}