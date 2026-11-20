# Write your MySQL query statement below
SELECT employee_id ,
        CASE
            When employee_id % 2 = 1 AND name NOT LIKE 'M%' Then salary
            ELSE 0
        END As bonus
From Employees
Group By employee_id
ORDER BY employee_id ASC;