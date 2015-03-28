create table quotation
(ref_no varchar(30) primary key not null,
date_prepared date,
cust_name varchar(30) not null,
product varchar(50) not null,
pack_dim varchar(30),
pack_weight varchar(30),
pack_cube varchar(30),
date_est_ship date,
ship_from varchar(30),
ship_to varchar(30),
dest_country varchar(30),
term_of_pay varchar(50),
mode_of_transport varchar(30),
price_total_sale double (10,2),
price_special_packing double (10,2),
special_price_quoted_by varchar(30),
price_inland_freight double (10,2),
inland_price_quoted_by varchar(30),
inland_unloading varchar(1),
inland_Pier_deliver varchar(1),
inland_terminal_handle varchar(1),
inland_other varchar(50),
price1_int_freight double(10,2),
price2_int_freight double (10,2),
int_freight_quoted_by varchar(30),
Air_fuel_adj  varchar(1),
air_container  varchar(1),
air_other  varchar(50),
price_insurance double (10,2),
insurance_all_risk  varchar(1), 
insurance_srcc  varchar(1),
insurance_warrisk  varchar(1),
fees_fwd double(10,2),
fees_consular double(10,2),
fees_bank double(10,2),
fees_other1_name varchar(50),
fees_other1 double(10,2),
fees_other2_name varchar(50),
fees_other2 double(10,2));

Create table customer
(cust_id varchar(20) primary key not null,
 Name varchar(50) not null,
 addr_1 varchar(50) not null,
 addr_2 varchar(60),
City varchar(40) not null, 
 country varchar(40) not null
);


CREATE TABLE `acsms`.`order` (
  `transid` INT NOT NULL,
  `orderid` VARCHAR(45) NOT NULL,
  `quotationid` VARCHAR(45) NULL,
  `invoiceid` VARCHAR(45) NULL,
  `clearanceid` VARCHAR(45) NULL,
  `awbid` VARCHAR(45) NULL,
  `userid` VARCHAR(45) NULL,
  `lasttransdt` DATE NULL,
  PRIMARY KEY (`transid`, `orderid`));
  
  
CREATE TABLE staff(
 staff_id varchar(20) primary key not null,
 staff_name varchar(150) not null,
 staff_email varchar(150) not null,
 staff_phone varchar(60) not null,
 staff_isAdmin tinyint not null
);


CREATE TABLE `status` (
  `StatusId` int(11) NOT NULL,
  `StatusDesc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`StatusId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('1', 'Quotation Created');
INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('2', 'Order Created');
INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('3', 'Proforma Invoice Created');
INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('4', 'Customs Clearance Completed');
INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('5', 'AWB Certificate Generated');
INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('6', 'Transport / Carrier Booked');
INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('7', 'Shipment Recieved');
INSERT INTO `acsms`.`status` (`StatusId`, `StatusDesc`) VALUES ('8', 'Order Completed');




CREATE TABLE `order` (
  `transid` int(11) NOT NULL AUTO_INCREMENT,
  `orderid` varchar(45) NOT NULL,
  `quotationid` varchar(45) DEFAULT NULL,
  `invoiceid` varchar(45) DEFAULT NULL,
  `clearanceid` varchar(45) DEFAULT NULL,
  `awbid` varchar(45) DEFAULT NULL,
  `userid` varchar(45) DEFAULT NULL,
  `lasttransdt` date DEFAULT NULL,
  `orderstatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`transid`,`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
  
  CREATE TABLE `acsms`.`custom_clearance` (
  `clearance_id` VARCHAR(45) NOT NULL,
  `orderid` VARCHAR(45) unique NOT NULL,
  `bill_of_lading` INT NOT NULL,
  `commercial_invoice` INT NOT NULL,
  `certificate_of_origin` INT NOT NULL,
  `canada_customs_invoice` INT NOT NULL,
  PRIMARY KEY (`clearance_id`)  
    );

  