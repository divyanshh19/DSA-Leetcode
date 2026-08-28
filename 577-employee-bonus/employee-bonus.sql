# Write your MySQL query statement below
Select e.name , b.bonus
from Employee e
Left join Bonus b 
ON e.empId = b.empId
where b.Bonus < 1000 or b.Bonus Is NULL;