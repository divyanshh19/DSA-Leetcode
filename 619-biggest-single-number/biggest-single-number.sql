# Write your MySQL query statement below
SELECT MAX(num) As num
From (SELECT num 
      from MyNumbers
      GROUP BY num
      HAVING COUNT(num) = 1
) As t;