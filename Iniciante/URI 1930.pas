var
    T1 : int64;
    T2 : int64;
    T3 : int64;
    T4 : int64;
    totalTomadas : int64;

begin
    readLn(T1, T2, T3, T4);
    totalTomadas := (T1 + T2 + T3 + T4) - 3;
    writeln(totalTomadas);
end.