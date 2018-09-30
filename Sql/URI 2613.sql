SELECT m.id, m.name
FROM movies m INNER JOIN prices p ON
     m.id_prices = p.id
WHERE p.categorie = 'Promotion'