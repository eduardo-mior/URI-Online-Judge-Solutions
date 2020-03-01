SELECT amount 
FROM value_table 
GROUP BY amount 
ORDER BY count(amount) DESC
LIMIT 1