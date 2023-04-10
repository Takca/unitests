FROM amazoncorretto:11

RUN yum -y install maven 3.9.0

WORKDIR /opt/app  

COPY ./${project_path}/${project_name} ${project_name}

WORKDIR /opt/app/${project_name}

ENTRYPOINT ["mvn", "test", "-Dtest=${test_class}"]