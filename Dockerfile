FROM openjdk:8
ADD target/debSpringProject-0.0.1-SNAPSHOT.jar debSpringProject-0.0.1-SNAPSHOT.jar
EXPOSE 9888
ENTRYPOINT ["java","-jar","debSpringProject-0.0.1-SNAPSHOT.jar"]