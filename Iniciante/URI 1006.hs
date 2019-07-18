import Text.Printf

main :: IO ()
main = do
    a' <- getLine
    b' <- getLine
    c' <- getLine

    let a = read a' :: Double
    let b = read b' :: Double
    let c = read c' :: Double
    let media = ((a * 2) + (b * 3) + (c * 5)) / 10

    putStrLn $ printf "MEDIA = %.1f" media