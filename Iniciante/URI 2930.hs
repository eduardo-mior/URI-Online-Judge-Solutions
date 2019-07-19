main :: IO ()
main = do
    line <- getLine
    let (e:d:_) = map (read :: String -> Double) $ words line
    if e > d
        then putStrLn $ "Eu odeio a professora!"
    else if (d - e) >= 3
        then putStrLn $ "Muito bem! Apresenta antes do Natal!"
    else if (e + 2) < 24
        then putStrLn $ "Parece o trabalho do meu filho!\nTCC Apresentado!"
    else
        putStrLn $ "Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!"