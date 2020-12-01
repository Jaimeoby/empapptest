# start with  a base image containing java runtime
FROM openjdk:8-jdk-alpine


#Add maintainer info
LABEL maintainer="jaimeoby123@gmail.com"

#add a volume pointing to /tmp
VOLUME /tmp

# Make  PORT 9010 AVAILABLE TO THE OUTSIDE WORLD 
EXPOSE 9001

# application jar 

# add this jar to the container
ADD target/employeeApplication-0.0.1-SNAPSHOT.jar employeeApplication.jar

#Run the jar file
ENTRYPOINT [ "java","-Djava.security.egd=file:/dev/./urandom","-jar","/employeeApplication.jar" ]
