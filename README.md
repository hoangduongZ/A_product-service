# Product Service (`product-service`)

Mock Product Service for the Jenkins Microservices CI/CD Lab.

## Overview
Provides mock product management endpoints using Spring Boot 3 and Java 21, integrated with `common-library`.

## Endpoints
| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/products` | List all mock products |
| `GET` | `/api/products/{id}` | Get product by ID |
| `GET` | `/actuator/health` | Health check endpoint |

## Port
- Default Port: `8082`

## Run Locally
```bash
# Test & Package
mvn clean test
mvn clean package

# Run
java -jar target/product-service-1.0.0.jar
# or
mvn spring-boot:run
```

## Quick Verification
```bash
curl http://localhost:8082/api/products
curl http://localhost:8082/api/products/1
curl http://localhost:8082/actuator/health
```
