FROM maven:3.9.3-amazoncorretto-17 as build

RUN mkdir microservices

WORKDIR /microservices

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src src

RUN mvn package

FROM amazoncorretto:17

VOLUME /hello-service

COPY --from=build /microservices/target/*.jar student-service.jar

ENTRYPOINT ["java","-jar","student-service.jar"]