DROP TABLE IF EXISTS accounts;

CREATE TABLE accounts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  account_number VARCHAR(250) NOT NULL,
  user_id VARCHAR(250) NOT NULL,
  pin INT NOT NULL,
  balance long NOT NULL
);

INSERT INTO accounts (id, name, account_number,user_id,pin,balance) VALUES
  (1, 'Shaswat', '3678900','st99',9999,100);