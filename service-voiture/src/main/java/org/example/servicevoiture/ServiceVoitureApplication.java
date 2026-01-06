package org.example.servicevoiture;

import org.example.servicevoiture.entity.Voiture;
import org.example.servicevoiture.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Classe principale du microservice Voiture.
 * Ce service gère les opérations sur les entités Voiture.
 * Il utilise OpenFeign pour communiquer avec le service Client.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
public class ServiceVoitureApplication {

    /**
     * Point d'entrée principal du microservice Voiture.
     * Lance le serveur Spring Boot avec la configuration du service.
     * 
     * @param arguments les arguments de ligne de commande
     */
    public static void main(String[] arguments) {
        // Démarrage du microservice Voiture
        SpringApplication.run(ServiceVoitureApplication.class, arguments);
    }

    /**
     * Initialise la base de données avec des voitures de démonstration.
     * Cette méthode est exécutée au démarrage de l'application.
     * 
     * @param depotVoiture le dépôt pour sauvegarder les voitures
     * @return un CommandLineRunner pour l'initialisation
     */
    @Bean
    CommandLineRunner demarrage(VoitureRepository depotVoiture) {
        return arguments -> {
            // Insertion des voitures de démonstration
            depotVoiture.saveAll(List.of(
                    new Voiture(null, "Toyota", "A123", "Corolla", 1L, null),
                    new Voiture(null, "Renault", "B456", "Clio", 1L, null),
                    new Voiture(null, "Peugeot", "C789", "308", 2L, null)
            ));
        };
    }
}
