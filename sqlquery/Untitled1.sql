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
Drop sequence book_sequence


CREATE TABLE Customer(CUSTID Number(6)CONSTRAINT CUST_ID PRIMARY KEY,
C_Name varchar2(20) not null,
Email varchar(320),
Country varchar2(20),
Address Number(4),
Address1 varchar2(35) NOT NULL,
Zipcode Number(9),
City varchar2(40));

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
insert into Customer VALUES (Customer_sequence.nextval, 'Anan', 'Anan@gmail.com', 'UnitedStates', 4455 , 'Mayfair Drive', 600030,'Chennai');

Drop table Customer;
Drop sequence Customer_sequence;
Select * from Customer;

CREATE TABLE Orders(OrderID Number(6) CONSTRAINT ORDER_Id PRIMARY KEY,
CUSTID Number(6),
ISBN Number(6),
CONSTRAINT FK_CUSID FOREIGN KEY (CUSTID) REFERENCES Customer(CUSTID),
CONSTRAINT FK_ISBID FOREIGN KEY (ISBN) REFERENCES Book(ISBN));

Create sequence Orders_sequence start with 11
increment by 1
minvalue 11
maxvalue 100000;

Create sequence Orders_sequence1 start with 100
increment by 1
minvalue 100
maxvalue 100000;
insert into orders values(Orders_sequence1.nextval, 102,3);

insert into orders VALUES (Orders_sequence.nextval,102, 2);
insert into orders VALUES (Orders_sequence.nextval, 101, 3);
insert into orders VALUES (Orders_sequence.nextval, 103, 1);
insert into orders VALUES (Orders_sequence.nextval, 104, 4);
insert into orders VALUES (Orders_sequence.nextval, 105, 7);
insert into orders VALUES (Orders_sequence.nextval, 106, 6);
insert into orders VALUES (Orders_sequence.nextval, 107, 5);
insert into orders VALUES (Orders_sequence.nextval, 108, 9);
insert into orders VALUES (Orders_sequence.nextval, 109, 8);
insert into orders VALUES (Orders_sequence.nextval, 101, 1);
insert into orders VALUES (Orders_sequence.nextval, 102, 2);



desc Orders;
Drop table Orders;
Drop sequence Orders_sequence;
select * from Orders;

CREATE TABLE Order_item(order_item_id Number(6) CONSTRAINT ORIT_Id PRIMARY KEY,
OrderID Number(6),
Quantity Number(6),
Status_id Number(6),
CONSTRAINT FK_ORDID FOREIGN KEY (orderID) REFERENCES Orders(orderID),
CONSTRAINT FK_STAID FOREIGN KEY (Status_id) REFERENCES Status(Status_id));


Create sequence Order_item_sequence11 start with 1
increment by 1
minvalue 1
maxvalue 100000;

Drop table order_item;
Drop sequence Order_item_sequence1;
select * from Order_item;

insert into ORDER_ITEM values(Order_item_sequence1.nextval,11, 2, 1);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,13, 3, 0);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,12, 1, 1);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,14, 2, 1);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,17, 3, 0);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,13, 4, 0);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,14, 0, 1);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,19, 1, 1);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,18, 0, 0);
insert into ORDER_ITEM values(Order_item_sequence1.nextval,14, 0, 1);

CREATE TABLE Status(Status_id Number(6)CONSTRAINT STAT_Id PRIMARY KEY, 
Stat_name varchar(10));

insert into Status values(1, 'Inprogress');
insert into Status values(0, 'COmpleted');

Drop table Status;
select * from Status;

Select ISBN,Title, price from Book ORDER BY price;
Select ISBN,Title, pages from Book ORDER BY pages;

SELECT c.CUSTID, c.c_name,c.EMAIL,o.ORDERID,i.quantity,s.STAT_NAME,s.STATUS_ID
from CUSTOMER c
Inner JOIN Orders o
ON c.CUSTID = o.CUSTID
inner join Order_item i
on o.OrderID=i.OrderID
inner join Status s
on s.status_id=i.status_id;
where quantity= 0;


--SELECT max(C_NAME)as Loyal_customer ,Count(TOTALQUANTITY) as Total_No_of_orders,SUM(TotalQuantity*Price) as total_revenue,
--max(timestamp) as Recent_order, MAX(Title)as popular_book
--FROM Book Inner JOIN Orders
--ON Orders.ORDERIDid = Book.ORDERIDid
--Inner join Customer
--On Orders.CUSTID=Customer.CUSTID

select ISBN, Count(*) from Orders
group by ISBN
Order by Count(*) Desc;

--select count(OrderID),Count(Quantity) ,CUSTID from Order_Item
--group by CUSTID;
 
--SELECT c.CUSTID,c.c_name as loyal_customer,b.TITLE AS POPULAR_BOOK, ,Count(QUANTITY) as Total_No_of_orders,SUM(Quantity*Price) as total_revenue
--FROM Orders o Inner JOIN Book b
--ON o.ISBN = b.ISBN
--Inner join Order_item oi
--On oi.Orderid=o.Orderid
--inner JOIN CUSTOMER c
--on c.CUSTID = o.CUSTID
--group by c.CUSTID,c.C_NAME,b.TITLE 
--Having count(quantity)=(select max (count(QUANTITY))  from Orders group by CUSTID);


SELECT c.CUSTID,c.c_name as loyal_customer,b.TITLE AS POPULAR_BOOK,Count(*) as Total_No_of_orders,SUM(Quantity*Price) as total_revenue
FROM Orders o Inner JOIN Book b
ON o.ISBN = b.ISBN
Inner join Order_item oi
On oi.Orderid=o.Orderid
inner JOIN CUSTOMER c
on c.CUSTID = o.CUSTID
group by c.CUSTID,c.C_NAME,b.TITLE 
Having count(quantity)=(select max (count(*))  from Orders group by CUSTID);

--SELECT c.CUSTID,c.c_name as loyal_customer from CUSTOMER c, Orders o, Book b, Order_item oi where o.ISBN = b.ISBN AND oi.Orderid = o.Orderid AND c.CUSTID=o.CUSTID
--group by c.CUSTID,c.C_NAME,b.TITLE 
--Having (count(quantity)=(select max (count(*))  from Orders group by CUSTID)) AND (select max (SUM(Quantity*Price)) from Orders group by CUSTID);