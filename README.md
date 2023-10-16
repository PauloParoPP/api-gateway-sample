# API-Gateway-Sample


## Compilação e geração da imagem da API

```bash
cd api-service
mvn package spring-boot:repackage
docker build --build-arg JAR_FILE=target/*.jar -t cpqd/mock/react-api .
```


