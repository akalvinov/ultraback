FROM git.lab.kalvinov.com:5050/tools/dockersync/eclipse-temurin:21

WORKDIR /app

COPY build/libs/app.jar /app/app.jar

CMD ["java","-jar","/app/app.jar"]