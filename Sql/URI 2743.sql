SELECT name, char_length(name) AS length
FROM people
ORDER BY length DESC