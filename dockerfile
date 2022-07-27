FROM java:8
COPY ./*.jar /usr/local/application.jar
CMD chmod 777 /usr/local/application.jar
ENTRYPOINT ["java","-jar","/usr/local/application.jar"]