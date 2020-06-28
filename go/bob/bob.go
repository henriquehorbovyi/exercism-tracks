// This is a "stub" file.  It's a little start on your solution.
// It's not a complete solution though; you have to write some code.

// Package bob should have a package comment that summarizes what it's about.
// https://golang.org/doc/effective_go.html#commentary
package bob

import (
	"strings"
	"unicode"
)

// Hey should have a comment documenting it.
func Hey(remark string) string {

	transform := func(r rune) rune {
		if !unicode.IsLetter(r) && r != '?' {
			return '#'
		}
		return r
	}

	var answer string = ""
	remark = strings.Map(transform, remark)
	remark = strings.ReplaceAll(remark, "#", "")

	println(remark)

	if strings.HasSuffix(remark, "?") {
		if strings.ToUpper(remark) == remark && remark != "?" {
			answer = "Calm down, I know what I'm doing!"
		} else {
			answer = "Sure."
		}
	} else if strings.TrimSpace(remark) == "" {
		answer = "Fine. Be that way!"
	} else if strings.ToUpper(remark) == remark {
		answer = "Whoa, chill out!"
	} else {
		answer = "Whatever."
	}

	return answer
}
