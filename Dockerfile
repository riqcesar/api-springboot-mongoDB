FROM openjdk:8
COPY . /target/crud-0.0.1-SNAPSHOT.jar /var/myapp/
WORKDIR /var/myapp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "crud-0.0.1-SNAPSHOT.jar"]