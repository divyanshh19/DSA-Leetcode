# Write your MySQL query statement below
SELECT user_id , COUNT(follower_id) As followers_count
from Followers
Group by user_id
Order by user_id ASC;