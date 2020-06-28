// This is a "stub" file.  It's a little start on your solution.
// It's not a complete solution though; you have to write some code.

// Package acronym should have a package comment that summarizes what it's about.
// https://golang.org/doc/effective_go.html#commentary
package acronym

import (
	"strings"
)

// Abbreviate should have a comment documenting it.
func Abbreviate(s string) string {
	s = strings.ReplaceAll(s, "_", "")
	s = strings.ReplaceAll(s, "- ", "")
	s = strings.ReplaceAll(s, " ", "#")

	abbreviation := string(s[0])

	for index, char := range s {
		if char == '#' || char == '-' {
			abbreviation += string(s[index+1])
		}
	}

	return strings.ToUpper(abbreviation)
}
