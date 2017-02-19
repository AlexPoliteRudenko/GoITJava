CREATE TABLE IF NOT EXISTS customers (
  customer_id INT PRIMARY KEY AUTO_INCREMENT,
  name        VARCHAR(50) NOT NULL
);


CREATE TABLE IF NOT EXISTS companies (
  company_id INT PRIMARY KEY AUTO_INCREMENT,
  name       VARCHAR(50) NOT NULL,
  address    VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS projects (
  project_id  INT AUTO_INCREMENT PRIMARY KEY,
  name        VARCHAR(50) NOT NULL,
  customer_id INT         NOT NULL,
  FOREIGN KEY (customer_id) REFERENCES customers (customer_id)
);

CREATE TABLE IF NOT EXISTS developers (
  developer_id INT PRIMARY KEY AUTO_INCREMENT,
  fname         VARCHAR(50)  NOT NULL,
  lname         VARCHAR(50),
  email         VARCHAR(100) NOT NULL,
  project_id    INT          NOT NULL,
  company_id    INT          NOT NULL,
  FOREIGN KEY (project_id) REFERENCES projects (project_id),
  FOREIGN KEY (company_id) REFERENCES companies (company_id),
  INDEX (email)
);

CREATE TABLE IF NOT EXISTS skills (
  skill_id INT PRIMARY KEY AUTO_INCREMENT,
  name     VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS developers_skills (
  developer_id INT NOT NULL,
  skill_id     INT NOT NULL,
  FOREIGN KEY (developer_id) REFERENCES developers (developer_id),
  FOREIGN KEY (skill_id) REFERENCES skills (skill_id),
  UNIQUE KEY (developer_id, skill_id)
);
