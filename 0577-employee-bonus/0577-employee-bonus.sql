# Write your MySQL query statement below
select E.name as name , B.bonus as bonus from Employee as E left join Bonus B on
E.empID = B.empId where B.bonus < 1000 OR B.bonus is null