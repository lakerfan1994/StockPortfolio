CREATE TABLE sandp (
  `Symbol` VARCHAR(100) NOT NULL,
  `Name` VARCHAR(100) NOT NULL,
  `Sector` VARCHAR(100) NOT NULL,
  `Price` FLOAT NOT NULL,
  `Price/Earnings` FLOAT NOT NULL,
  `Earnings/Share` FLOAT NOT NULL,
  `52 Week High` FLOAT NOT NULL,
  `52 Week Low` FLOAT NOT NULL,
    PRIMARY KEY (`Date`));
LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/sample_data.csv'
INTO TABLE sandp
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;
SELECT * FROM sandp;


