FROM alibabadragonwell/dragonwell:21-anolis

WORKDIR /my-blog-upms-biz

ARG JAR_FILE=target/my-blog-upms-biz.jar

COPY ${JAR_FILE} app.jar

EXPOSE 4000

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

CMD sleep 60; java $JAVA_OPTS -jar app.jar
