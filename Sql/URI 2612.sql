SELECT m.id, m.name
FROM genres g INNER JOIN movies m ON
     g.id = m.id_genres INNER JOIN movies_actors ma ON
	 ma.id_movies = m.id INNER JOIN actors a ON
	 a.id = ma.id_actors
WHERE LOWER(a.name) LIKE '%silva' AND LOWER(g.description) = 'action'