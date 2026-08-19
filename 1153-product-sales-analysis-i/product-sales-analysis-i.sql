# Write your MySQL query statement below
SELECT p.product_name ,s.year,s.price
from Product p
Inner join Sales s
On p.product_id = s.product_id;