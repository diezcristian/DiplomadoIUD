FROM java11
EXPOSE 8080
ADD helpmeiud-0.0.1-SNAPSHOT.jar helpmeiud.jar
ENTRYPOINT [java, -jar, helpmeiud.jar]
