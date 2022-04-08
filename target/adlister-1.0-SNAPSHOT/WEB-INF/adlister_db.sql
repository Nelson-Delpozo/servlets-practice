CREATE DATABASE IF NOT EXISTS adlister_db;
USE adlister_db;
DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users(
                                    id INT NOT NULL AUTO_INCREMENT,
                                    username VARCHAR(50),
                                    email    VARCHAR(50),
                                    password VARCHAR(50),
                                    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ads(
                                  id INT NOT NULL AUTO_INCREMENT,
                                  user_id INT NOT NULL,
                                  title VARCHAR(50),
                                  description VARCHAR(150),
                                  PRIMARY KEY (id),
                                  FOREIGN KEY (user_id) REFERENCES users (id)
);


INSERT INTO users(username, email, password)
VALUES('johnson', 'johnson@johnson.org', 'password'),
      ('freddy', 'freddy@freedom.inc', 'password'),
      ('kid-rock', 'kidrock@kid.rock', 'password');

INSERT INTO ads(user_id, title, description)
VALUES(1, 'Saab 900 for sale', 'I have a sweet 1987 Saab 900 for sale call me now'),
      (2, 'Guitar Lessons', 'I can teach you guitar call me now at 800-555-1212'),
      (2, 'Piano Lessons', 'I can teach you piano too call me now'),
      (3, 'Exterminator', 'I know how to exterminate things, call me now'),
      (3, 'Carpentry', 'I\'m just a simple fella who can swing a hammer'),
      (1, 'Motorcycle for Sale', 'I have a sweet sweet 1987 Honda Magna 700 for sale $2500 OBO');


SELECT * FROM users;
SELECT * FROM ads;



