DROP TABLE if EXISTS usuari_cartellera;
CREATE TABLE cinema_lab
(
  DNI VARCHAR (55) PRIMARY KEY,
  nom VARCHAR (55),
  cognom VARCHAR (55),
  telefon VARCHAR (55),
  idUsuari VARCHAR (55),
  password VARCHAR  (55)

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