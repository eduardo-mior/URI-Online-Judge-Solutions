SELECT p.name, f.name
FROM providers f INNER JOIN products p ON 
     f.id = p.id_providers
WHERE f.name = 'Ajax SA'