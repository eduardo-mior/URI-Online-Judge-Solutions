import Text.Printf

main :: IO ()
main = do
    n' <- getLine

    let n = read n' :: Double
    let resposta = (n * (n - 3)) / 2 :: Double

    putStrLn $ printf "%.0f" resposta