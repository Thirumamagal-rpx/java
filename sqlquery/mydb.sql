CREATE Table Book(ISBN Number(6) CONSTRAINT ISBN_ID PRIMARY KEY,
Title Varchar2(20),
Price Number(6),
Pages Number(8),
Coverimg varchar2(40));

Create sequence Book_sequence start with 1
increment by 1
minvalue 1
maxvalue 10000;

insert into Book VALUES (Book_sequence.nextval, 'An Autobiography', 750, 300, 'Book.png') ;
insert into Book Values(Book_sequence.nextval, 'Discovery of India', 1500,500, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'Malgudi Days', 800,1000, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'Wings Of fire', 2000,1500, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'Gullivers travels', 750,2000, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'Hard Choices', 500,350, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'Jaws', 1000,2000, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'Final chapters', 1000,750, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'I am Malala', 1000,700, 'Book.png');
insert into Book Values(Book_sequence.nextval, 'Enid Blyton', 750,700, 'Book.png');

DESCRIBE Book
Select * from Book;
Drop table Book;
Drop sequence book_sequence;


CREATE TABLE Customer(CUSTID Number(6)CONSTRAINT CUST_ID PRIMARY KEY,
C_Name varchar2(20) not null,
Email varchar(320),
Country varchar2(20),
Address Number(4),
Address1 varchar2(35) NOT NULL,
Zipcode Number(9),
City varchar2(40));

alter table 
   Customer
modify 
( 
   C_Name    varchar2(30)
);
Create sequence Customer_sequence start with 100
increment by 1
minvalue 100
maxvalue 100000;

insert into Customer VALUES (Customer_sequence.nextval, 'Joe', 'Smith@gmail.com', 'India', 45 , 'gajapathi street Shenoynagar', 600030,'Chennai');
insert into Customer VALUES (Customer_sequence.nextval, 'Thiru', 'Thiru@gmail.com', 'UnitedStates', 5522 , 'parklane avenue', 75024,'Texas');
insert into Customer VALUES (Customer_sequence.nextval, 'Sri', 'Sri@gmail.com', 'UnitedStates', 5522 , 'countryside hills', 6575,'Texas');
insert into Customer VALUES (Customer_sequence.nextval, 'Ram', 'Ram@gmail.com', 'India', 67 , 'Thiru Nagar Annanagar', 600040,'Hyderabed');
insert into Customer VALUES (Customer_sequence.nextval, 'Bala', 'Bala@gmail.com', 'India', 20 , 'Mylapore', 600004,'Chennai');
insert into Customer VALUES (Customer_sequence.nextval, 'Mann', 'Mann@gmail.com', 'India', 35 , '7th cross street Adyar', 600045,'Chennai');
insert into Customer VALUES (Customer_sequence.nextval, 'Rock', 'Rock@gmail.com', 'India', 89, 'Ashonagar', 600083,'Chennai');
insert into Customer VALUES (Customer_sequence.nextval, 'Vedha', 'Vedha@gmail.com', 'India', 28 , 'Tank bund road', 600034,'Hyderabed');
insert into Customer VALUES (Customer_sequence.nextval, 'Chith', 'Chith@gmail.com', 'India', 67 , 'gajapathi street Shenoynagar', 600030,'Chennai');
insert into Customer VALUES (Customer_sequence.nextval, 'Anan', 'Anan@gmail.com', 'UnitedStates', 4455 , 'Mayfair Drive', 600030,'Chennai');
insert into Customer VALUES (Customer_sequence.nextval, 'Chith', 'Chith@gmail.com', 'India', 67 , 'gajapai street Shenoynagar', 600030,'Chennai');
insert into Customer VALUES (Customer_sequence.nextval, 'Anan', 'Anan@gmail.com', 'UnitedStates', 4455 , 'Mfair Drive', 600030,'Chennai');

Drop table Customer;
Drop sequence Customer_sequence;
Select * from Customer;

CREATE TABLE Orders(OrderID Number(6) CONSTRAINT ORDER_Id PRIMARY KEY,
Timestamp TIMESTAMP(2),
TotalQUantity Number(20),
Status_in_progress varchar2(20),
CUSTID Number(6),
ISBN Number(6) ,
CONSTRAINT FK_CUSID FOREIGN KEY (CUSTID) REFERENCES Customer(CUSTID),
CONSTRAINT FK_ISBID FOREIGN KEY (ISBN) REFERENCES Book(ISBN));


Create sequence Orders_sequence start with 11
increment by 1
minvalue 11
maxvalue 100000;

insert into orders VALUES (Orders_sequence.nextval, current_timestamp, 2, 'Inprogress',100,2);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('10-SEP-14 10.10.12.3000'), 3, 'Completed',100,1);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('03-JUN-17 1.15.45.2000'), 0, 'Completed',101,5);
insert into orders VALUES (Orders_sequence.nextval,TO_TIMESTAMP('20-APR-17 3.30.12.8000'), 3, 'Completed',101,2);
INsert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('06-NOV-18 2.15.12.6000'), 2, 'Inprogress',102,3);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('07-JAN-18 6.23.21.2000'), 1, 'Inprogress',102,5);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('10-SEP-17 7.18.12.5000'), 1, 'Inprogress',103,4);
insert into orders VALUES (Orders_sequence.nextval, current_timestamp, 3, 'Inprogress',104,1);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('12-APR-18 7.45.12.2200'), 2, 'Completed',104,3);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('14-SEP-15 3.45.45.2200'), 4, 'Completed',104,7);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('23-Nov-16 3.45.45.2200'), 0, 'Completed',104,10);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('09-JUN-18 3.45.45.2200'), 4, 'Completed',104,8);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('20-DEC-15 3.45.45.2200'), 0, 'Completed',104,9);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('25-JUN-18 5.55.55.5500'), 3, 'Inprogress',103,10);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('22-Mar-16 11.23.23.3400'), 2, 'Completed',105,8);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('05-Mar-18 12.56.55.4500'), 0, 'Completed',106,4);
insert into orders VALUES (Orders_sequence.nextval, TO_TIMESTAMP('10-Apr-18 01.45.35.6500'), 0, 'Completed',105,7);

Drop table Orders;
Drop sequence Orders_sequence;
select * from Orders;

Select OrderID,Status_in_progress from Orders where Status_in_progress='Completed';
Select OrderID,Status_in_progress from Orders where Status_in_progress='Inprogress';

Select ISBN,Title, price from Book ORDER BY price;
Select ISBN,Title, pages from Book ORDER BY pages;

SELECT c.CUSTID, c.c_name,c.EMAIL, o.TotalQUantity AS WITHORDER
FROM Customer c 
Inner JOIN Orders o 
ON c.CUSTID = o.CUSTID
where TOTALQUANTITY>0;  

SELECT c.CUSTID, c.c_name,c.EMAIL, o.TotalQUantity AS WITHOUTORDER
FROM Customer c 
Inner JOIN Orders o 
ON c.CUSTID = o.CUSTID
where TOTALQUANTITY=0;  

--select title ,b.price,o.Totalquantity from Book b join Orders o
--on b.ISBN=O.ISBN;

SELECT max(C_NAME)as Loyal_customer ,Count(TOTALQUANTITY) as Total_No_of_orders,SUM(TotalQuantity*Price) as total_revenue,
max(timestamp) as Recent_order, MAX(Title)as popular_book
FROM Book Inner JOIN Orders
ON Orders.ISBN = Book.ISBN
Inner join Customer
On Orders.CUSTID=Customer.CUSTID
where (TOTALQUANTITY)>0;

select ISBN, Count(*) from Orders
group by ISBN
Order by Count(*) Desc;