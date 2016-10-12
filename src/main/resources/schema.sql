DROP TABLE if EXISTS cinema_lab;
CREATE TABLE cinema_lab
(
  id VARCHAR (55) PRIMARY KEY,
  nom VARCHAR (55),
  direccio VARCHAR (55),
  telefon VARCHAR (100)
);

DROP TABLE if EXISTS user_lab;
CREATE TABLE user_lab (
  id bigint auto_increment PRIMARY KEY,
  title VARCHAR (255),
  content VARCHAR (255),
  date_creation TIMESTAMP ,
  date_edit TIMESTAMP ,
  owner VARCHAR (55),
  FOREIGN KEY (owner)
  REFERENCES user_lab(username)
)