package org.example.servicevoiture.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe DTO représentant un client récupéré depuis le service Client.
 * Cette classe n'est pas une entité JPA, elle sert uniquement à transporter
 * les données du client obtenues via OpenFeign.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    
    /** Identifiant unique du client */
    private Long identifiant;
    
    /** Nom du client */
    private String nom;
    
    /** Âge du client */
    private Float age;
}
