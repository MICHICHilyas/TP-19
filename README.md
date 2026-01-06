# TP-19 : Orchestration de Microservices avec Spring Cloud

## 📋 Description

Ce projet démontre l'orchestration de microservices en utilisant **Spring Cloud** avec les composants suivants :
- **Eureka Server** : Service de découverte et registre des microservices
- **Spring Cloud Gateway** : Passerelle API pour le routage intelligent
- **OpenFeign** : Client HTTP déclaratif pour la communication inter-services

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────────────────┐
│                    Spring Cloud Gateway                      │
│                      (Port 8888)                             │
└─────────────────────────┬───────────────────────────────────┘
                          │
┌─────────────────────────┼───────────────────────────────────┐
│                   Eureka Server                              │
│                    (Port 8761)                               │
└─────────────────────────┬───────────────────────────────────┘
                          │
          ┌───────────────┼───────────────┐
          │                               │
┌─────────┴─────────┐         ┌──────────┴────────┐
│  Service Client   │◄────────│  Service Voiture  │
│   (Port 8081)     │ OpenFeign│    (Port 8082)    │
└───────────────────┘         └───────────────────┘
```

## 🛠️ Technologies Utilisées

| Technologie | Version | Description |
|-------------|---------|-------------|
| Java | 17+ | Langage de programmation |
| Spring Boot | 3.x | Framework applicatif |
| Spring Cloud | 2023.x | Suite d'outils microservices |
| Eureka | - | Service Discovery |
| Gateway | - | API Gateway |
| OpenFeign | - | Client HTTP déclaratif |
| Maven | 3.8+ | Gestionnaire de dépendances |

## 📁 Structure du Projet

```
TP-19-Ilyas/
├── eureka-server/          # Serveur de découverte Eureka
│   ├── src/
│   └── pom.xml
├── gateway/                # Passerelle API Spring Cloud Gateway
│   ├── src/
│   └── pom.xml
├── service-client/         # Microservice de gestion des clients
│   ├── src/
│   └── pom.xml
└── service-voiture/        # Microservice de gestion des voitures
    ├── src/
    └── pom.xml
```

## 🚀 Démarrage

### Prérequis
- JDK 17+
- Maven 3.8+

### Ordre de Lancement

1. **Eureka Server** (obligatoire en premier)
```bash
cd eureka-server
mvn spring-boot:run
```

2. **Gateway**
```bash
cd gateway
mvn spring-boot:run
```

3. **Service Voiture**
```bash
cd service-voiture
mvn spring-boot:run
```

4. **Service Client**
```bash
cd service-client
mvn spring-boot:run
```

## 🌐 Points d'Accès

| Service | URL | Description |
|---------|-----|-------------|
| Eureka Dashboard | http://localhost:8761 | Interface de monitoring |
| Gateway | http://localhost:8888 | Point d'entrée API |
| Service Client | http://localhost:8081 | API Clients |
| Service Voiture | http://localhost:8082 | API Voitures |

## 📡 Endpoints API

### Via Gateway (Port 8888)

```bash
# Clients
GET    /service-client/clients
GET    /service-client/clients/{id}
POST   /service-client/clients
PUT    /service-client/clients/{id}
DELETE /service-client/clients/{id}

# Voitures
GET    /service-voiture/voitures
GET    /service-voiture/voitures/{id}
POST   /service-voiture/voitures
PUT    /service-voiture/voitures/{id}
DELETE /service-voiture/voitures/{id}
```

## ✨ Fonctionnalités

- ✅ **Service Discovery** avec Eureka
- ✅ **Load Balancing** automatique
- ✅ **Routage dynamique** via Gateway
- ✅ **Communication inter-services** avec OpenFeign
- ✅ **API RESTful** pour chaque microservice

## 👨‍💻 Auteur

**Ilyas MICHICH**

---
*Travail Pratique - Architecture Microservices avec Spring Cloud*
