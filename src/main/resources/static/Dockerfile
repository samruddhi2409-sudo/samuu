# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the jar file (make sure you build your jar first)
COPY target/samuu-0.0.1-SNAPSHOT.jar app.jar

# Expose port (default Spring Boot port)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
