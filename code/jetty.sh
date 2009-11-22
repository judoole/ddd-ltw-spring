#!/bin/bash
export MAVEN_OPTS="-javaagent:$HOME/.m2/repository/org/springframework/spring-agent/2.5.6/spring-agent-2.5.6.jar"
mvn jetty:run &
firefox http://localhost:8080/ddd-ltw-spring-war/
