package popcorntime;

import java.time.LocalDate;

public class SeatDetails {

public SeatDetails(){
}

private String city;
private String theatre;
private String movies;
private String ticketName;
private int numTickets;
private String time;
private LocalDate date;
private String showtime;

public String getShowtime() {
	return showtime;
}
public void setShowtime(String showtime) {
	this.showtime = showtime;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	if (date.equals(null)) {

		throw new NullPointerException("You must choose a date");

	} else {
		this.date = date;
	}
	this.date = date;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	if (city.equals("-Select your city")) {

		throw new NullPointerException("You must choose a city");

	} else {
		this.city = city;
	}

}
public String getTheatre() {
	return theatre;
}
public void setTheatre(String theatre) {
	if (theatre.equals("-Select your theatre")) {

		throw new NullPointerException("You must choose a theatre");

	} else {
		this.theatre = theatre;
	}

}
public String getMovies() {
	return movies;
}
public void setMovies(String movies) {
	if (movies.equals("-Select your movie")) {

		throw new NullPointerException("You must choose a movie.");

	} else {
		this.movies = movies;
	}

}
public String getTicketName() {
	return ticketName;
}
public void setTicketName(String ticketName) {
		this.ticketName = ticketName;

}
public int getNumTickets() {
	return numTickets;
}
public void setNumTickets(int numTickets) {
	this.numTickets = numTickets;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	if (time.isEmpty() || (time.trim()).isEmpty()) {

		throw new NullPointerException("You must choose a time");

	} else {
		this.time = time;
	}

}

}//ends class
