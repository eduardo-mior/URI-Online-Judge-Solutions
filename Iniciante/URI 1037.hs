main :: IO ()
main = do
    valor' <- getLine
    let valor = read valor' :: Double

    if valor >= 0 && valor <= 25
        then putStrLn $ "Intervalo [0,25]"
    else if valor > 25 && valor <= 50
        then putStrLn $ "Intervalo (25,50]"
    else if valor > 50 && valor <= 75
        then putStrLn $ "Intervalo (50,75]"
    else if valor > 75 && valor <= 100
        then putStrLn $ "Intervalo (75,100]"
    else
        putStrLn $ "Fora de intervalo"