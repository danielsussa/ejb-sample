#!/bin/sh

export JAVA_OPTS="$JAVA_OPTS -Xms128m -Xmx1024m -XX:MaxPermSize=1024m"
export JAVA_OPTS="$JAVA_OPTS -Djava.net.preferIPv4Stack=true"
export JAVA_OPTS="$JAVA_OPTS -Djboss.server.default.config=standalone-full-prevent.xml"
export JAVA_OPTS="$JAVA_OPTS -Dsun.rmi.dgc.client.gcInterval=3600000"
export JAVA_OPTS="$JAVA_OPTS -Duser.timezone=GMT-3"
export JAVA_OPTS="$JAVA_OPTS -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n"

docker run --network host -p 8080:8080 -p 9990:9990 -p 8787:8787 -e "TERM=xterm-256color" \
     -v $PWD/.deployments:/opt/jboss/wildfly/standalone/deployments \
     -it jboss/wildfly /opt/jboss/wildfly/bin/standalone.sh --debug \
     -bmanagement 0.0.0.0 -b 0.0.0.0