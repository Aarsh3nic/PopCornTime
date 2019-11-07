package popcorntime;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PayeeWindowController  {

	private Scanner in;

	@FXML private Button btnback;
	@FXML private Button btnconfirm;
	@FXML private TextField txtname;
	@FXML private TextField txtage;
	@FXML private TextField txtmob;
	@FXML private TextField txtemail;
	@FXML private TextField txtcard;
	@FXML private RadioButton credit;
	@FXML private RadioButton scene;
	@FXML private Label alertname;
	@FXML private Label alertage;
	@FXML private Label alertmob;
	@FXML private Label alertemail;
	@FXML private Label alertcard;
	@FXML private Label alertpayment;
	@FXML private TextArea display;

	PayeeDetails pd = new PayeeDetails();
	DatabaseList dl = new DatabaseList();


	@FXML private void initialize(){
		btnconfirm.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {

					int newWindow = onConfirmClicked();

					Parent ticket_window;
					try {
						ticket_window = FXMLLoader.load(getClass().getResource("TicketWindow.fxml"));
						Scene payee_details = new Scene(ticket_window);
					    Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();

					    if(newWindow == 1){
							app_stage.hide();
					        app_stage.setScene(payee_details);
					        app_stage.show();
					    }

					} catch (IOException e1) {

						e1.printStackTrace();
					}


			}
		});

		btnback.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Parent payee_details_parent;
				try {
					payee_details_parent = FXMLLoader.load(getClass().getResource("Theatre.fxml"));
					Scene payee_details = new Scene(payee_details_parent);
				    Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();

						app_stage.hide();
				        app_stage.setScene(payee_details);
				        app_stage.show();


				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
		});


	}//initialize method ends

	private int onConfirmClicked(){



		/*alertemail.setText("");
		alertmob.setText("");
		alertage.setText("");
		alertname.setText("");*/
		int temp =0;
		try{
		pd.setName(txtname.getText());

		}

		catch (NullPointerException e) {
			temp = 1;
			alertname.setText("You must enter your name.");
			}

		try{
			pd.setAge(Integer.parseInt(txtage.getText()));

			}

			catch (Exception e) {
				temp = 1;
				alertage.setText("You must enter your age.");
				}
		try{
			pd.setMob(txtmob.getText());

			}

			catch (NullPointerException e) {
				temp = 1;
				alertmob.setText("You must enter your mobile number.");
				}
			catch (IllegalArgumentException e) {
			temp = 1;
			alertmob.setText("Phone number must be of 10 digits.");
		}

		try{
			pd.setEmail(txtemail.getText());

			}

			catch (NullPointerException e) {
				temp = 1;
				alertemail.setText("You must enter your email.");
				}

		try{
			pd.setCard(txtcard.getText());

			}

			catch (NullPointerException e) {
				temp = 1;
				alertcard.setText("You must enter your card details");
				}

		catch (IllegalArgumentException e) {
			temp = 1;
			alertcard.setText("Card number must be of 16 digits.");
		}

		int temp2 =0;
			if(credit.isSelected()){
				pd.setPayment("Paid by Credit/Debit Card");
				temp2 =1;

			}
			if(scene.isSelected()){
				pd.setPayment("Paid by Scene Card");
				temp2 =1;

			}
			if (temp2 ==0){
				alertpayment.setText("You must enter your card details to proceed.");
				temp = 1;
			}

 if(temp == 0){

		try {
			FileWriter out = new FileWriter("Receipts.txt",true);

			    
				out.write("\r\nName : "+ pd.getName());
				out.write("\r\n");
				out.write("Age: "+ pd.getAge());
				out.write("\r\n");
				out.write("Mobile Number : "+ pd.getMob());
				out.write("\r\n");
				out.write("Email: "+ pd.getEmail() );
				out.write("\r\n");
				out.write("Payment Method : "+ pd.getPayment());
				out.write("\r\n");
				out.write("Card Number :"+ "xxxx-xxxx-xxxx-"+ pd.getCard().substring(12,pd.getCard().length()));
				out.write("\r\n");
				out.write("------------------------------------------------");

			out.close();

		}
		catch (Exception e) {

			e.printStackTrace();
		}
		return 1;

 }//if ends
 else{
	 return 0;
 }

	}//confirm method ends


}
