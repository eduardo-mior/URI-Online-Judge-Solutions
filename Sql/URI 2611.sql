SELECT m.id, m.name
FROM movies m INNER JOIN genres g ON
     m.id_genres = g.id	
WHERE LOWER(g.description) = 'action'