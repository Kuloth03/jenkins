FROM eclipse-termurin:17
COPY target/jenkins.jar jenkins.jar
CMD ["java", "-jar", "jenkins.jar"]