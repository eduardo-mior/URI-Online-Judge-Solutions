SELECT id, name
FROM customers c
WHERE NOT EXISTS (SELECT id_customers 
				  FROM locations l
				  WHERE c.id = l.id_customers)

--------- OUTRA POSSIVEL SOLUÇÃO -----------

SELECT id, name
FROM customers
WHERE id NOT IN (SELECT id_customers
				   FROM locations)