# Use uma imagem base com JDK
FROM openjdk:21-jdk

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo JAR da aplicação para dentro do container
COPY target/*.jar app.jar

# Expõe a porta em que a aplicação irá rodar
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "/app/app.jar"]