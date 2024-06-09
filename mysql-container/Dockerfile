FROM mysql:8.0

ENV MYSQL_ROOT_PASSWORD=root_password
ENV MYSQL_USER=springstudent
ENV MYSQL_PASSWORD=springstudent

COPY dev-sql.sql /docker-entrypoint-initdb.d/
