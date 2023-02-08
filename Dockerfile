FROM openjdk:11
ENV DB_HOST=practice_mysql
ENV DB_USER=root
ENV DB_PASSWORD=root

COPY target/docker_spritboot_practice-0.0.1-SNAPSHOT.jar docker_spritboot_practice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker_spritboot_practice-0.0.1-SNAPSHOT.jar"]