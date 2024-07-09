SELECT x.queue, x.left, x.right
FROM (
   SELECT queue, id as "left", available as "left_available", LEAD(id, 1) OVER(PARTITION BY queue) as "right", LEAD(available, 1) OVER(PARTITION BY queue) as "right_available"
   FROM chairs
) as x