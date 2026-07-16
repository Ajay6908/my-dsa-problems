# Write your MySQL query statement below
select max(salary) as 'SecondHighestSalary'
from Employee as e 
where salary < (select max(salary) from Employee) 


