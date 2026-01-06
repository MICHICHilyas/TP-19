package org.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Classe principale du serveur Eureka.
 * Ce serveur joue le rôle de registre de services pour l'architecture microservices.
 * Il permet aux différents services de s'enregistrer et de se découvrir mutuellement.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    /**
     * Point d'entrée principal de l'application Eureka Server.
     * Lance le serveur Spring Boot avec la configuration Eureka.
     * 
     * @param arguments les arguments de ligne de commande
     */
    public static void main(String[] arguments) {
        // Démarrage du serveur Eureka
        SpringApplication.run(EurekaServerApplication.class, arguments);
    }

}
