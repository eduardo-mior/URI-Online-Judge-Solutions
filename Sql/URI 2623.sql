SELECT p.name, c.name
FROM products p INNER JOIN categories c ON
     p.id_categories = c.id
WHERE p.amount > 100 AND p.id_categories IN(1, 2, 3, 6, 9)