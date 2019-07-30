#!/bin/sh
docker run -p 8080:8080 -p 9990:9990 -e "TERM=xterm-256color" -v $PWD/.deployments:/opt/jboss/wildfly/standalone/deployments -it jboss/wildfly /opt/jboss/wildfly/bin/standalone.sh -bmanagement 0.0.0.0 -b 0.0.0.0