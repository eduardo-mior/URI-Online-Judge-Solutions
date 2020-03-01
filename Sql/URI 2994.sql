SELECT d.name, round(sum((a.hours * 150.0) + (((a.hours * 150.0) * w.bonus) / 100.0)), 1) as salary
FROM doctors d INNER JOIN attendances a ON d.id = a.id_doctor
               INNER JOIN work_shifts w ON w.id = a.id_work_shift 
GROUP BY d.id
ORDER BY salary DESC