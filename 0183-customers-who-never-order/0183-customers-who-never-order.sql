# Write your MySQL query statement below
select name as Customers from Customers where id not in (select c.id as ID from Customers c inner join Orders o
on c.id = o.customerId ); 