package org.example.servicevoiture.services;

import ch.qos.logback.core.net.server.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Interface Feign pour la communication avec le microservice Client.
 * Utilise OpenFeign pour effectuer des appels REST vers le service Client.
 * Le nom du service est résolu via Eureka.
 * 
 * @author Ilyas MICHICH
 * @version 1.0
 */
@FeignClient(name = "SERVICE-CLIENT")
public interface ClientService {
    
    /**
     * Récupère un client par son identifiant depuis le service Client.
     * 
     * @param identifiant l'identifiant unique du client à récupérer
     * @return le client correspondant à l'identifiant
     */
    @GetMapping("/clients/{id}")
    Client recupererParId(@PathVariable("id") Long identifiant);
}