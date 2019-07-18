import Text.Printf

main :: IO ()
main = do
    raio' <- getLine

    let n = 3.14159
    let raio = read raio' :: Double
    let area = (n * raio * raio)

    putStrLn $ printf "A=%.4f" area