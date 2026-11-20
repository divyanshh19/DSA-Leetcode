# Write your MySQL query statement below
SELECT x , y , z , 
        CASE 
            When x + y > z AND y + z > x AND z + x > y THEN 'Yes'
            Else 'No'
        END As triangle
from triangle