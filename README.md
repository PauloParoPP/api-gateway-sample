# API-Gateway-Sample


## Compilação e geração da imagem da API

```bash
cd api-service
mvn package spring-boot:repackage
docker build --build-arg JAR_FILE=target/*.jar -t cpqd/mock/react-api .
```

<img src="swagger_api.png">

## Start/Stop do Kong + API-Sample (com regras definidas no /config)

```bash
cd docker-kong
docker compose up
docker compose stop
```

## URL API

API-Sample:
```bash
http://localhost:8084
```

Kong:
```bash
http://localhost:8000
```




## Kong Gateway

