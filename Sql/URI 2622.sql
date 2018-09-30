SELECT c.name
FROM customers c INNER JOIN legal_person l ON
     c.id = l.id_customers