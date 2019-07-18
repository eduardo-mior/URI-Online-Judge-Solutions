import Text.Printf

main :: IO ()
main = do
    x' <- getLine
    y' <- getLine

    let x = read x' :: Double
    let y = read y' :: Double
    let media = x / y :: Double

    putStrLn $ printf "%.3f km/l" media