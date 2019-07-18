import Text.Printf

main :: IO ()
main = do
    tempo' <- getLine
    velocidade' <- getLine

    let tempo = read tempo' :: Double
    let velocidade = read velocidade' :: Double
    let kilometros = tempo * velocidade :: Double
    let media = kilometros / 12 :: Double

    putStrLn $ printf "%.3f" media