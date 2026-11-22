# Write your MySQL query statement below
SELECT Department ,Employee ,Salary
        from  (SELECT d.name As Department , e.name As Employee , e.salary As Salary,
                RANK() OVER(Partition by d.name
                            Order by e.salary DESC
                            ) As rnk
                from Employee e
                INNER JOIN Department d on e.departmentId = d.id
            ) t

        where rnk = 1;
