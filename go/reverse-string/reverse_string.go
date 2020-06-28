package reverse

// Reverse returns the passed string reversed
func Reverse(s string) string {
	reversed := ""
	for _, c := range s {
		reversed = string(c) + reversed
	}
	return reversed
}
