# ARG JAR_FILE=target/spring-docker-simple-0.0.1-SNAPSHOT.jar  // Откуда копируем наши ткесты
# WORKDIR /opt/app  
# COPY ${JAR_FILE} app.jar  
# ENTRYPOINT ["java","-jar","app.jar"]  
# COPY "C:\Users\User\IdeaProjects\work\unitests\*" /unitests 

FROM amazoncorretto:11

RUN yum -y install maven

# RUN mvn -version

# ENTRYPOINT ["mvn", "-version"]

ARG PATH_TO_PROJECT="C:/Users/User/IdeaProjects/work/unitests"

WORKDIR /opt/app  

COPY unitests unitests 

WORKDIR /opt/app/unitests

ENTRYPOINT ["mvn", "test"]

