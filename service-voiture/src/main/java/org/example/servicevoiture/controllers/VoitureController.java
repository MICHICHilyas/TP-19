package org.example.servicevoiture.controllers;

import lombok.RequiredArgsConstructor;
import org.example.servicevoiture.entity.Voiture;
import org.example.servicevoiture.repositories.VoitureRepository;
import org.example.servicevoiture.services.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des voitures.
 * Expose les endpoints pour récupérer les informations des voitures
 * avec les données du client propriétaire via OpenFeign.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/voitures")
public class VoitureController {

    /** Dépôt pour l'accès aux données des voitures */
    private final VoitureRepository depotVoiture;
    
    /** Service Feign pour récupérer les données des clients */
    private final ClientService serviceClient;

    /**
     * Récupère la liste de toutes les voitures avec leurs clients associés.
     * 
     * @return la liste complète des voitures avec informations client
     */
    @GetMapping
    public List<Voiture> recupererToutes() {
        // Récupère toutes les voitures et enrichit avec les données client
        return depotVoiture.findAll().stream()
                .peek(voiture -> voiture.setClient(serviceClient.recupererParId(voiture.getIdClient())))
                .toList();
    }

    /**
     * Récupère une voiture par son identifiant avec le client associé.
     * 
     * @param identifiant l'identifiant unique de la voiture
     * @return la voiture correspondante avec informations client
     */
    @GetMapping("/{id}")
    public Voiture recupererParId(@PathVariable("id") Long identifiant) {
        // Recherche de la voiture et enrichissement avec les données client
        Voiture voiture = depotVoiture.findById(identifiant).orElseThrow();
        voiture.setClient(serviceClient.recupererParId(voiture.getIdClient()));
        return voiture;
    }

    /**
     * Récupère toutes les voitures d'un client donné.
     * 
     * @param idClient l'identifiant du client propriétaire
     * @return la liste des voitures appartenant au client
     */
    @GetMapping("/client/{clientId}")
    public List<Voiture> recupererParClient(@PathVariable("clientId") Long idClient) {
        // Recherche des voitures par identifiant client
        return depotVoiture.findByIdClient(idClient);
    }
}
