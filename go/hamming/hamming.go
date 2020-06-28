package hamming

import "errors"

// Distance calculates the the hamming :D
func Distance(a, b string) (int, error) {
	if len(a) != len(b) {
		return 0, errors.New("Can't calculate with two different DNA sizes")
	}

	var distance int

	for index := range a {
		if a[index] != b[index] {
			distance++
		}
	}

	return distance, nil
}
