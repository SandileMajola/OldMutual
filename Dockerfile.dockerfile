FROM openjdk:8
ADD target/Assessment.jar OldMutualAssessment.jar
ENTRYPOINT ["java", "-jar","OldMutualAssessment.jar"]
EXPOSE 8080