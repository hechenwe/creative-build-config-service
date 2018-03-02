FROM java
VOLUME /tmp
ADD creative-build-config-service.jar cbcs.jar
RUN bash -c 'touch /cbcs.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /cbcs.jar" ]