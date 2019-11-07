package popcorntime;

import java.io.File;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class TicketWindowController {

	Scanner in ;

	@FXML private Button btnreceipt;
	@FXML private Button btnclose;
	@FXML private TextArea txtreceipt;

	@FXML private void initialize(){
		btnclose.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				onbtncloseClicked();
			}
		});

		btnreceipt.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				onbtnreceiptClicked();
			}
		});
	}//initialize method ends

	private void onbtncloseClicked(){
				Stage stage = (Stage) btnclose.getScene().getWindow();
				stage.close();
				System.exit(0);
	}

	private void onbtnreceiptClicked(){

		try{
			in = new Scanner(new File("Receipts.txt"));
		}

		catch(Exception e){
			System.out.print("not working");

		}

		while(in.hasNext()){

			txtreceipt.appendText(in.nextLine() + "\n");

		}
	}

}//class ends
