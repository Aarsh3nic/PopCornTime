package popcorntime;

import java.util.ArrayList;

public class DatabaseList {

public DatabaseList(){

	}


SeatDetails sd = new SeatDetails();
PayeeDetails pd = new PayeeDetails();

protected ArrayList<SeatDetails> seatList = new ArrayList();
protected ArrayList<PayeeDetails> payeeList = new ArrayList();

public void addSeat(SeatDetails seat){
	seatList.add(seat);
}

public int lengthofSeats(){
	return seatList.size();
}

public SeatDetails getSeat(int index){
	return seatList.get(index);
}

public void addPayee(PayeeDetails payee){
	payeeList.add(payee);
}

public int lengthofPayees(){
	return payeeList.size();
}

public PayeeDetails getPayee(int index){
	return payeeList.get(index);
}

}//class ends
