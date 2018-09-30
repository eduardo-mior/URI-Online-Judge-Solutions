SELECT p.name, f.name, c.name
FROM categories c INNER JOIN products p ON
     p.id_categories = c.id INNER JOIN providers f ON
     p.id_providers = f.id
WHERE c.name = 'Imported' AND f.name = 'Sansul SA'