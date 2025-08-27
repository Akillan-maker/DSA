# Write your MySQL query statement below
-- select e.name,b.bonus from Employee e Join Bonus b where b.bonus<1000
select e.name,b.bonus from Employee e left Join Bonus b on b.empId=e.empId where b.bonus<1000 or b.bonus is null