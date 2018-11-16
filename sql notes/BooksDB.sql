CREATE TABLE Book(ISBN Number(6) CONSTRAINT ISBN_ID PRIMARY KEY,
Title Varchar2(20),
Price Number(6),
Pages Number(8),
Coverimg Varchar2(30));


CREATE TABLE Customer(CUSTID Number(6)CONSTRAINT CUST_ID PRIMARY KEY,
Name varchar2(20),
Email varchar2(70),
Country varchar2(20),
Address varchar2(40),
Address1 varchar2(40),
Zipcode Number(9),
City varchar2(40));


CREATE TABLE Orders(OrderID Number(6) CONSTRAINT ORDER_Id PRIMARY KEY,
Timestamp TIMESTAMP(2),
Total Number(10),
TotalQUantity Number(20),
Status_in_progress varchar2(20),
CUSTID Number(6),
ISBN Number(6),
CONSTRAINT CUSID FOREIGN KEY (CUSTID) REFERENCES Customer(CUSTID),
CONSTRAINT ISBID FOREIGN KEY (ISBN) REFERENCES Customer(ISBN));


CREATE TABLE Status(StatusID Number(6) CONSTRAINT STATUS_Id PRIMARY KEY,
Status_name varchar2(30),
ORDERID NUMBER(6),
CONSTRAINT ORDID FOREIGN KEY (ORDERID) REFERENCES Orders (ORDERID));


DESCRIBE Books

DESCRIBE Customer

DESCRIBE Orders

DESCRIBE Status


Select ISBN,Title, price from Book ORDER BY price;

Select ISBN,Title, pages from Book ORDER BY pages;