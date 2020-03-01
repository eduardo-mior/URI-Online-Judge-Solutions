SELECT e.cpf, e.enome, d.dnome
FROM departamentos d INNER JOIN empregados e ON d.dnumero = e.dnumero 
                     LEFT JOIN trabalha t ON t.cpf_emp = e.cpf
                     LEFT JOIN projetos p ON t.pnumero = p.pnumero
WHERE p.pnumero IS NULL
ORDER BY e.cpf