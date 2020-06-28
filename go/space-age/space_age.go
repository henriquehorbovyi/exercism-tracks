package space

// Planet is
type Planet string

// Age is
func Age(seconds float64, planet Planet) float64 {
	var orbitalPeriod float64

	if planet == "Earth" {
		orbitalPeriod = 1
	}
	if planet == "Mercury" {
		orbitalPeriod = 0.2408467
	}
	if planet == "Venus" {
		orbitalPeriod = 0.61519726
	}
	if planet == "Mars" {
		orbitalPeriod = 1.8808158
	}
	if planet == "Jupiter" {
		orbitalPeriod = 11.862615
	}
	if planet == "Saturn" {
		orbitalPeriod = 29.447498
	}
	if planet == "Uranus" {
		orbitalPeriod = 84.016846
	}
	if planet == "Neptune" {
		orbitalPeriod = 164.79132
	}

	return seconds / 60 / 60 / 24 / (orbitalPeriod * 365.25)
}
