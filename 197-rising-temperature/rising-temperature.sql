# Write your MySQL query statement below
select a.id from Weather a Join Weather b
on DATEDIFF(a.recordDate,b.recordDate)=1
where a.temperature > b.temperature;