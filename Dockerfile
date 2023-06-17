FROM openjdk:8
EXPOSE 8080
ADD target/springboot-nagp-k8.jar springboot-nagp-k8.jar
ENTRYPOINT ["java","-jar","/springboot-nagp-k8.jar"]

