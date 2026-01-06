package org.example.servicevoiture.entity;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entité représentant une voiture dans le système.
 * Cette classe est mappée à une table dans la base de données.
 * Elle contient une référence transiente vers le client propriétaire.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {
    
    /** Identifiant unique de la voiture, généré automatiquement */
    @Id
    @GeneratedValue
    private Long identifiant;
    
    /** Marque de la voiture (ex: Toyota, Renault) */
    private String marque;
    
    /** Numéro d'immatriculation de la voiture */
    private String matricule;
    
    /** Modèle de la voiture (ex: Corolla, Clio) */
    private String modele;
    
    /** Identifiant du client propriétaire */
    private Long idClient;

    /** Objet client associé (non persisté en base) */
    @Transient
    private Client client;
}