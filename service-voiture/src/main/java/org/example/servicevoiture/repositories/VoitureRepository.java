package org.example.servicevoiture.repositories;

import org.example.servicevoiture.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Interface de dépôt pour l'entité Voiture.
 * Fournit les opérations CRUD de base grâce à JpaRepository
 * et des méthodes de recherche personnalisées.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    
    /**
     * Recherche toutes les voitures appartenant à un client donné.
     * 
     * @param idClient l'identifiant du client propriétaire
     * @return la liste des voitures du client
     */
    List<Voiture> findByIdClient(Long idClient);
}