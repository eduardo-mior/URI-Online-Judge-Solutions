import Text.Printf

main = do
    n' <- getLine

    let n = read n' :: Double
    let resposta = ((n ** 4.0) - (6.0 * (n ** 3.0)) + (23.0 * (n ** 2.0)) - (18.0 * n) + 24.0 ) / 24.0 :: Double

    putStrLn $ printf "%.0f" resposta