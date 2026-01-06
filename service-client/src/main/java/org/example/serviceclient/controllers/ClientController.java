package org.example.serviceclient.controllers;

import lombok.RequiredArgsConstructor;
import org.example.serviceclient.entity.Client;
import org.example.serviceclient.repositories.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des clients.
 * Expose les endpoints pour récupérer les informations des clients.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    /** Dépôt pour l'accès aux données des clients */
    private final ClientRepository depotClient;

    /**
     * Récupère la liste de tous les clients.
     * 
     * @return la liste complète des clients
     */
    @GetMapping
    public List<Client> recupererTous() {
        // Retourne tous les clients depuis la base de données
        return depotClient.findAll();
    }

    /**
     * Récupère un client par son identifiant.
     * 
     * @param identifiant l'identifiant unique du client
     * @return le client correspondant à l'identifiant
     * @throws ResponseStatusException si le client n'est pas trouvé
     */
    @GetMapping("/{id}")
    public Client recupererParId(@PathVariable("id") Long identifiant) {
        // Recherche du client par son ID, lève une exception si non trouvé
        return depotClient.findById(identifiant)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Client non trouvé"));
    }
}