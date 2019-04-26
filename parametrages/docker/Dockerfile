FROM maven:alpine as mvn
ADD pom.xml .
RUN mvn verify clean --fail-never

FROM openjdk:8-jdk-slim@sha256:2c085a85e41d8255beb3033009354989d8a46e476dc22b00172bd9b604464f8b AS tester
COPY . /settings
COPY --from=mvn /root/.m2 ./root/.m2
WORKDIR /settings
ENTRYPOINT ./mvnw test

FROM openjdk:8-jdk-slim@sha256:2c085a85e41d8255beb3033009354989d8a46e476dc22b00172bd9b604464f8b AS builder
COPY . /settings
COPY --from=mvn /root/.m2 ./root/.m2
WORKDIR /settings
RUN  app_version=$(grep -m 1 '<version>' pom.xml | awk -F '>' '{ print $2 }' | awk -F '<' '{ print $1 }') && \
     ./mvnw install && \
     mv target/puma-parametrages-$app_version.jar target/puma-settings.jar

FROM openjdk:8-jre-alpine as runner
COPY --from=builder /settings/src/main/resources/application-template.yml ./application.yml
COPY --from=builder /settings/target/*.jar ./

LABEL vendor=GRTGAZ\ Digital\ Factory \
      maintainer="sami.boukhris@external.grtgaz.com" \
      com.grtgaz.is-production="true"

ENTRYPOINT java -jar -Dspring.config.location=./application.yml ./puma-settings.jar
EXPOSE 8080
HEALTHCHECK CMD /usr/bin/curl --fail http://localhost:8080/health || exit 1