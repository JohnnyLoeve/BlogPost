
CREATE TABLE USERPROFILE(
ID BIGINT AUTO_INCREMENT PRIMARY KEY,
FIRST_NAME VARCHAR(30),
LAST_NAME VARCHAR(30),
EMAIL_ADDRESS VARCHAR(64),
USER_NAME VARCHAR(30),
PASSWORD VARCHAR(30)
);

CREATE TABLE BLOGPOST(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  HEADLINE VARCHAR(30),
  BLOGPOSTTEXT VARCHAR(300)
);