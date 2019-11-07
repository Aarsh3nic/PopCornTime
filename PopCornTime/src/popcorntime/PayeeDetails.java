package popcorntime;

public class PayeeDetails {

	public PayeeDetails(){

	}

	private String name;
	private int age;
	private String mob;
	private String email;
	private String card;
	private String payment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.isEmpty() || (name.trim()).isEmpty()) {

			throw new NullPointerException("You must enter an your name.");

		} else {
			this.name = name;
		}


	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age == 0) {

			throw new NullPointerException("You must enter an your age.");

		} else {
			this.age = age;
		}

		this.age = age;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		if (mob.isEmpty() || (mob.trim()).isEmpty()) {

			throw new NullPointerException("You must enter an your phone number.");

		} else {
			if(mob.matches("[0-9]{10}"))
			{
				this.mob = mob;
			}
			else
			{
				throw new IllegalArgumentException("Phone number must be of 10 digits.");
			}
		}


	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.isEmpty() || (email.trim()).isEmpty()) {

			throw new NullPointerException("You must enter an your email.");

		} else {
			this.email = email;
		}

	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		if (card.isEmpty() || (card.trim()).isEmpty()) {

			throw new NullPointerException("You must enter an your card number to proceed.");

		} else {
			if(card.matches("[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}") || card.matches("[0-9]{4}[0-9]{4}[0-9]{4}[0-9]{4}")){
				this.card = card;
			}else{
				throw new IllegalArgumentException("Card number must be of 16 digits.");
			}

		}

	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {

			this.payment = payment;



	}



}
