package diffsquares

// SquareOfSum is
func SquareOfSum(number int) int {
	sum := 0
	for i := 1; i <= number; i++ {
		sum += i
	}
	return sum * sum
}

// SumOfSquares is
func SumOfSquares(number int) int {
	sum := 0
	for i := 1; i <= number; i++ {
		sum += i * i
	}
	return sum
}

// Difference is
func Difference(number int) int {
	return SquareOfSum(number) - SumOfSquares(number)
}
