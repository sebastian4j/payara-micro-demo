# payara-micro-demo

* construir con mvn clean package
* ejecutar con docker run -p 8180:8080 -v target:/opt/payara/deployments payara/micro --deploy /opt/payara/deployments/payara-micro-demo-1.0-SNAPSHOT.war
* revisar en http://localhost:8180/payara-micro-demo-1.0-SNAPSHOT/
