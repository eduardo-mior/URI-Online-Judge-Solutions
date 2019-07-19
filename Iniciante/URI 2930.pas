var
    e : int64;
    d : int64;

begin
    readLn(e, d);    

    if (e > d) then
        writeln('Eu odeio a professora!')
    else if ((d - e) >= 3) then
        writeln('Muito bem! Apresenta antes do Natal!')
    else if ((e + 2) < 24) then
        writeln('Parece o trabalho do meu filho!'#10'TCC Apresentado!')
    else
        writeln('Parece o trabalho do meu filho!'#10'Fail! Entao eh nataaaaal!')
end.