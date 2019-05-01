FROM openjdk:8-jdk-alpine

# Add jar and config
ADD "target/springbootmongocrud-v.0.1.jar" "/app/springbootmongocrud-v.0.1.jar"

# Setting up an alternative directory for tmp files as tomcat requires it
RUN mkdir -p /app/java_tmp

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-XX:MaxRAMFraction=2", "-Djava.io.tmpdir=/app/java_tmp"]

CMD ["-jar", "springbootmongocrud-v.0.1.jar"]