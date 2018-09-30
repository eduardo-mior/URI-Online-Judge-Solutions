SELECT concat('Approved: ', name) as name, grade
FROM students
WHERE grade >= 7
ORDER BY grade DESC