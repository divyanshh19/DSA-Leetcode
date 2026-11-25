# Write your MySQL query statement below
SELECT DISTINCT teacher_id , COUNT(DISTINCT subject_id) As cnt
from Teacher
Group by teacher_id
order by cnt ASC;