FROM tomcat:8.0.21-jre8
COPY target/sampleweb.war /usr/local/tomcat/webapps/sampleweb.war
