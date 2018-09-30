SELECT p.name, f.name
FROM products p INNER JOIN providers f ON
     p.id_providers	= f.id
WHERE p.id_categories = 6