FROM alibabadragonwell/dragonwell:21-anolis

WORKDIR /my-blog-boot

ARG JAR_FILE=target/my-blog-boot.jar

COPY ${JAR_FILE} app.jar

EXPOSE 9999

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms512m -Xmx1024m -Djava.security.egd=file:/dev/./urandom"

CMD sleep 60; java $JAVA_OPTS -jar app.jar
