FROM mysql/mysql-server:8.0.32

MAINTAINER lengleng(wangiegie@gmail.com)

ENV TZ=Asia/Shanghai

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY ./my-blog.sql /docker-entrypoint-initdb.d

COPY ./my-blog_config.sql /docker-entrypoint-initdb.d

EXPOSE 3306
