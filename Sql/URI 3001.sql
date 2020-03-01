SELECT name, CASE WHEN type = 'A' THEN 20.0 WHEN type = 'B' THEN 70.0 ELSE 530.5 END AS price
FROM products
ORDER BY price ASC, id DESC