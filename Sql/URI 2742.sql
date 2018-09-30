SELECT l.name, round((l.omega * 1.618), 3) AS "Fator N" 
FROM life_registry l JOIN dimensions d ON 
	 l.dimensions_id = d.id 
WHERE d.name in ('C875', 'C774') AND l.name LIKE 'Richard%'
ORDER BY l.omega ASC