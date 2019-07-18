import Text.Printf

main :: IO ()
main = do
    km' <- getLine
    let km = read km' :: Double
    let minutos = (60 * km / 30) :: Double
    putStrLn $ printf "%.0f minutos" minutos