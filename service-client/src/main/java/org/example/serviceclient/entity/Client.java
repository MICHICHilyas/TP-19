package org.example.serviceclient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entité représentant un client dans le système.
 * Cette classe est mappée à une table dans la base de données.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    
    /** Identifiant unique du client, généré automatiquement */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifiant;
    
    /** Nom du client */
    private String nom;
    
    /** Âge du client */
    private Float age;
}