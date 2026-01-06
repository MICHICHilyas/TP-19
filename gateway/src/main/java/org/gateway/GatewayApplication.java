package org.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principale de la passerelle API (Gateway).
 * Cette passerelle sert de point d'entrée unique pour tous les microservices.
 * Elle gère le routage des requêtes vers les services appropriés.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
public class GatewayApplication {

    /**
     * Point d'entrée principal de l'application Gateway.
     * Lance le serveur Spring Boot avec la configuration de la passerelle.
     * 
     * @param arguments les arguments de ligne de commande
     */
    public static void main(String[] arguments) {
        // Démarrage de la passerelle API
        SpringApplication.run(GatewayApplication.class, arguments);
    }

}
