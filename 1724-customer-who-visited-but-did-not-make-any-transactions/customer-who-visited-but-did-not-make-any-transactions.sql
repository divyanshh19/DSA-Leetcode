# Write your MySQL query statement below
select v.customer_id ,COUNT(*) as count_no_trans
from Visits v
left join Transactions t
On v.visit_id = t.visit_id
where t.visit_id Is null #give me the visits that have no transaction
group by v.customer_id;