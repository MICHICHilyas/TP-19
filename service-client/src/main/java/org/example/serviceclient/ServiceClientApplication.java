package org.example.serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principale du microservice Client.
 * Ce service gère les opérations CRUD sur les entités Client.
 * Il s'enregistre auprès du serveur Eureka pour la découverte de services.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
public class ServiceClientApplication {

    /**
     * Point d'entrée principal du microservice Client.
     * Lance le serveur Spring Boot avec la configuration du service.
     * 
     * @param arguments les arguments de ligne de commande
     */
    public static void main(String[] arguments) {
        // Démarrage du microservice Client
        SpringApplication.run(ServiceClientApplication.class, arguments);
    }

}
