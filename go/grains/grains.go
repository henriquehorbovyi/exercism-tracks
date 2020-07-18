package grains

import (
	"errors"
	"math"
)

// Square returns the amount of grains for a given chessboard square position
func Square(number int) (uint64, error) {
	if number <= 0 || number > 64 {
		return 0, errors.New("Not valid position")
	}
	r := math.Pow(2, float64(number-1))
	return uint64(r), nil
}

// Total sums the amount of all grains in the chessboard
func Total() uint64 {
	total := 0
	for n := 1; n <= 64; n++ {
		grains, _ := Square(n)
		total += int(grains)
	}
	return uint64(total)
}
