DELIMITER $$
CREATE PROCEDURE insert_quotation
(in ref_no varchar(30) ,
in date_prepared date,
in cust_name varchar(30) ,
in product varchar(50) ,
in pack_dim varchar(30),
in pack_weight varchar(30),
in pack_cube varchar(30),
in date_est_ship date,
in ship_from varchar(30),
in ship_to varchar(30),
in dest_country varchar(30),
in term_of_pay varchar(50),
in mode_of_transport varchar(30),
in price_total_sale double (10,2),
in price_special_packing double (10,2),
in special_price_quoted_by varchar(30),
in price_inland_freight double (10,2),
in inland_price_quoted_by varchar(30),
in inland_unloading varchar(1),
in inland_Pier_deliver varchar(1),
in inland_terminal_handle varchar(1),
in inland_other varchar(50),
in price1_int_freight double(10,2),
in price2_int_freight double (10,2),
in int_freight_quoted_by varchar(30),
in Air_fuel_adj  varchar(1),
in air_container  varchar(1),
in air_other  varchar(50),
in price_insurance double (10,2),
in insurance_all_risk  varchar(1), 
in insurance_srcc  varchar(1),
in insurance_warrisk  varchar(1),
in fees_fwd double(10,2),
in fees_consular double(10,2),
in fees_bank double(10,2),
in fees_other1_name varchar(50),
in fees_other1 double(10,2),
in fees_other2_name varchar(50),
in fees_other2 double(10,2))

BEGIN
insert into quotation 
(ref_no  ,
date_prepared,
cust_name  ,
product  ,
pack_dim ,
pack_weight ,
pack_cube ,
date_est_ship,
ship_from ,
ship_to ,
dest_country ,
term_of_pay ,
mode_of_transport ,
price_total_sale ,
price_special_packing ,
special_price_quoted_by ,
price_inland_freight ,
inland_price_quoted_by ,
inland_unloading ,
inland_Pier_deliver ,
inland_terminal_handle ,
inland_other ,
price1_int_freight ,
price2_int_freight ,
int_freight_quoted_by ,
Air_fuel_adj  ,
air_container  ,
air_other  ,
price_insurance ,
insurance_all_risk  , 
insurance_srcc  ,
insurance_warrisk  ,
fees_fwd ,
fees_consular ,
fees_bank ,
fees_other1_name ,
fees_other1 ,
fees_other2_name ,
fees_other2 )  values
(ref_no  ,
date_prepared,
cust_name  ,
product  ,
pack_dim ,
pack_weight ,
pack_cube ,
date_est_ship,
ship_from ,
ship_to ,
dest_country ,
term_of_pay ,
mode_of_transport ,
price_total_sale ,
price_special_packing ,
special_price_quoted_by ,
price_inland_freight ,
inland_price_quoted_by ,
inland_unloading ,
inland_Pier_deliver ,
inland_terminal_handle ,
inland_other ,
price1_int_freight ,
price2_int_freight ,
int_freight_quoted_by ,
Air_fuel_adj  ,
air_container  ,
air_other  ,
price_insurance ,
insurance_all_risk  , 
insurance_srcc  ,
insurance_warrisk  ,
fees_fwd ,
fees_consular ,
fees_bank ,
fees_other1_name ,
fees_other1 ,
fees_other2_name ,
fees_other2 ) ;
END$$
DELIMITER ;


=================

DELIMITER $$
CREATE PROCEDURE get_quotation(IN ref_no varchar(50))
BEGIN
select
ref_no  ,
date_prepared,
cust_name  ,
product  ,
pack_dim ,
pack_weight ,
pack_cube ,
date_est_ship,
ship_from ,
ship_to ,
dest_country ,
term_of_pay ,
mode_of_transport ,
price_total_sale ,
price_special_packing ,
special_price_quoted_by ,
price_inland_freight ,
inland_price_quoted_by ,
inland_unloading ,
inland_Pier_deliver ,
inland_terminal_handle ,
inland_other ,
price1_int_freight ,
price2_int_freight ,
int_freight_quoted_by ,
Air_fuel_adj  ,
air_container  ,
air_other  ,
price_insurance ,
insurance_all_risk  , 
insurance_srcc  ,
insurance_warrisk  ,
fees_fwd ,
fees_consular ,
fees_bank ,
fees_other1_name ,
fees_other1 ,
fees_other2_name ,
fees_other2 from quotation;
END$$
DELIMITER ;



DELIMITER $$

create procedure insert_customer( 
 IN cust_id varchar(20) ,
 IN Name varchar(50),
 IN addr_1 varchar(50),
 IN addr_2 varchar(60),
 IN City varchar(40) , 
 IN country varchar(40))
 
  Begin
  insert into customer (CUST_ID,name,addr_1,addr_2, city,country)values
   (CUST_ID,name,addr_1,addr_2, city,country);
END$$
DELIMITER ;


DELIMITER $$

create procedure get_customer( IN cust_id varchar(20))
 
  Begin
  select CUST_ID,name,addr_1,addr_2, city,country from customer where cust_id= cust_id;
  
END$$
DELIMITER ;


