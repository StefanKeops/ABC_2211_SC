CREATE TABLE projet (projetno INT(3) NOT NULL PRIMARY KEY, projetname VARCHAR(5) NOT NULL, budget INT NOT NULL);

INSERT INTO projet (projetno, projetname,budget)
          VALUES (101, 'ALPHA', 96000),
                 (102, 'BETA', 82000),
                 (103, 'GAMMA', 15000);