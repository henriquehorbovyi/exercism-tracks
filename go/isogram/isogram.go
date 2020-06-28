package isogram

import (
	"strings"
	"unicode"
)

// IsIsogram is a function that checks if the passed word is an isogram
func IsIsogram(word string) bool {
	word = strings.ToLower(word)
	for _, l := range word {
		if strings.Count(word, string(l)) > 1 && unicode.IsLetter(l) {
			return false
		}
	}
	return true
}
