# Write your MySQL query statement below
SELECT activity_date As day , COUNT(DISTINCT user_id) As active_users
From Activity 
WHERE activity_date >= '2019-06-28' 
AND activity_date <= '2019-07-27'
Group by activity_date
order by day;