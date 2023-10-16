# API-Gateway-Sample


## Compilação e geração da imagem da API

```bash
cd api-service
mvn package spring-boot:repackage
docker build --build-arg JAR_FILE=target/*.jar -t cpqd/mock/react-api .
```

## Start/Stop do Kong + API-Sample (com regras definidas no /config)

```bash
cd docker-kong
docker compose up
docker compose stop
```

## URL API-Sample

http://localhost:8084
<img src="swagger_api.png">

## URL Kong
http://localhost:8000


## Kong Gateway

