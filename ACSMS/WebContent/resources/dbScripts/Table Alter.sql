--Alter the customer Table to fit the Customer Creation UI
ALTER TABLE `acsms`.`customer` 
CHANGE COLUMN `addr_1` `company` VARCHAR(50) NOT NULL ,
CHANGE COLUMN `addr_2` `street` VARCHAR(60) NULL ,
ADD COLUMN `title` VARCHAR(45) NOT NULL AFTER `cust_id`,
ADD COLUMN `province` VARCHAR(45) NULL AFTER `City`,
ADD COLUMN `postal code` VARCHAR(45) NULL AFTER `province`,
ADD COLUMN `phone` VARCHAR(45) NULL AFTER `country`,
ADD COLUMN `email` VARCHAR(45) NULL AFTER `phone`;

