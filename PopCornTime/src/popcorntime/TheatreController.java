/*package popcorntime;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class MainController {

	 @FXML private RadioButton rd1;
	 @FXML private RadioButton rd2;
	 @FXML private RadioButton rd3;
	 @FXML private ChoiceBox<String>  city;
	 @FXML private ChoiceBox<String> theatre;
	 @FXML private ChoiceBox<String> movies;
	 @FXML private ImageView ia1;
	 @FXML private CheckBox a1;
	 @FXML private ImageView ia2;
	 @FXML private CheckBox a2;
	 @FXML private ImageView ia3;
	 @FXML private CheckBox a3;
	 @FXML private ImageView ia4;
	 @FXML private CheckBox a4;
	 @FXML private ImageView ia5;
	 @FXML private CheckBox a5;
	 @FXML private ImageView ia6;
	 @FXML private CheckBox a6;
	 @FXML private ImageView ia7;
	 @FXML private CheckBox a7;
	 @FXML private ImageView ia8;
	 @FXML private CheckBox a8;
	 @FXML private ImageView ia9;
	 @FXML private CheckBox a9;
	 @FXML private ImageView ia10;
	 @FXML private CheckBox a10;
	 @FXML private ImageView ia11;
	 @FXML private CheckBox a11;

	 Image image = new Image ("images/green_seat.PNG");

	 Image image1 = new Image ("images/red_seat.PNG");

	 @FXML private void initialize(){
		city.setValue("-Select your city");
		 city.getItems().add("-Select your city");
		 city.getItems().add("Brampton");
		 city.getItems().add("Mississauga");
		 city.getItems().add("Oakville");
		 city.getItems().add("Etobicoke");

		 theatre.setValue("-Select your theatre");
		 theatre.getItems().add("-Select your theatre");
		 theatre.getItems().add("Courtney Park");
		 theatre.getItems().add("Eglinton");
		 theatre.getItems().add("Yorkdale");

		 movies.setValue("-Select your movie");
		 movies.getItems().add("-Select your movie");
		 movies.getItems().add("Spiderman: Far from Home");
		 movies.getItems().add("Kabir Singh");
		 movies.getItems().add("Stuber");
		 movies.getItems().add("Crawl");
		 movies.getItems().add("Shazam!");


		 a1.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a1.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a1.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a2.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a2.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a2.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a3.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a3.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a3.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a4.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a4.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a4.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a5.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a5.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a5.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a6.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a6.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a6.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a7.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a7.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a7.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a8.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a8.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a8.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a9.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a9.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a9.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a10.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a10.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a10.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });
		 a11.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 onmousedragged();
			 }
		 });
		 a11.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseexited();
			 }
		 });
		 a11.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 onmouseclicked();
			 }
		 });


	 }//ends intialize methods


	private void onmousedragged(){
		 ia1.setImage(image1);
	 }
	 private void onmouseexited(){
		 if(!a1.isSelected()){
			 ia1.setImage(image);
		 }

	 }
	 private void onmouseclicked(){

		 if(a1.isSelected()){
			 ia1.setImage(image1);
		 }

		 else if (!a1.isSelected()) {
			 ia1.setImage(image);
		 }
	 }



}//ends the class*/

package popcorntime;

import java.awt.Checkbox;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.scene.Node;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class TheatreController {


	SeatDetails sd = new SeatDetails();
	//PayeeDetails pd = new PayeeDetails();
	DatabaseList dl = new DatabaseList();



	int enter = 0; int exit=0; int click = 0;
	 @FXML private RadioButton rd1;
	 @FXML private RadioButton rd2;
	 @FXML private RadioButton rd3;
	 @FXML private ChoiceBox<String>  city;
	 @FXML private ChoiceBox<String> theatre;
	 @FXML private ChoiceBox<String> movies;
	 @FXML private ImageView ia1,ia2,ia3,ia4,ia5,ia6,ia7,ia8,ia9,ia10,ia11,ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic10,id1,id2,id3,id4,id5,id6,id7,id8;
	 @FXML private CheckBox a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,d1,d2,d3,d4,d5,d6,d7,d8;
	 @FXML private Button btnseat;
	 @FXML private Button btnbook;
	 @FXML private DatePicker date;
	 @FXML private AnchorPane seatpreview;

	 Image image = new Image ("images/green_seat.PNG");

	 Image image1 = new Image ("images/red_seat.PNG");

	 @FXML private void initialize(){
		city.setValue("-Select your city");
		 city.getItems().add("-Select your city");
		 city.getItems().add("Brampton");
		 city.getItems().add("Mississauga");
		 city.getItems().add("Oakville");
		 city.getItems().add("Etobicoke");

		 theatre.setValue("-Select your theatre");
		 theatre.getItems().add("-Select your theatre");
		 theatre.getItems().add("Courtney Park");
		 theatre.getItems().add("Eglinton");
		 theatre.getItems().add("Yorkdale");

		 movies.setValue("-Select your movie");
		 movies.getItems().add("-Select your movie");
		 movies.getItems().add("Spiderman: Far from Home");
		 movies.getItems().add("Kabir Singh");
		 movies.getItems().add("Stuber");
		 movies.getItems().add("Crawl");
		 movies.getItems().add("Shazam!");


		 btnbook.setOnAction( new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					int newWindow = onBookClicked();
					Parent payee_details_parent;
					try {
						payee_details_parent = FXMLLoader.load(getClass().getResource("PayeeWindow.fxml"));
						Scene payee_details = new Scene(payee_details_parent);
					    Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();

					    if(newWindow == 1){
							app_stage.hide();
					        app_stage.setScene(payee_details);
					        app_stage.show();
						}

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
		 btnseat.setOnAction( new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					onSeatClicked();

				}
			});



		 a1.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =1;
				 onmousedragged();
				 }
		 });
		 a1.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=1;
				 onmouseexited();

			 }
		 });
		 a1.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =1;
				 onmouseclicked();

			 }
		 });
		 a2.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =2;
				 onmousedragged();

			 }
		 });
		 a2.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=2;
				 onmouseexited();

			 }
		 });
		 a2.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =2;
				 onmouseclicked();

			 }
		 });
		 a3.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =3;
				 onmousedragged();

			 }
		 });
		 a3.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=3;
				 onmouseexited();

			 }
		 });
		 a3.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =3;
				 onmouseclicked();

			 }
		 });
		 a4.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =4;
				 onmousedragged();

			 }
		 });
		 a4.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=4;
				 onmouseexited();

			 }
		 });
		 a4.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =4;
				 onmouseclicked();

			 }
		 });
		 a5.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =5;
				 onmousedragged();

			 }
		 });
		 a5.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=5;
				 onmouseexited();

			 }
		 });
		 a5.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =5;
				 onmouseclicked();

			 }
		 });
		 a6.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =6;
				 onmousedragged();

			 }
		 });
		 a6.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=6;
				 onmouseexited();

			 }
		 });
		 a6.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =6;
				 onmouseclicked();

			 }
		 });
		 a7.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =7;
				 onmousedragged();

			 }
		 });
		 a7.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=7;
				 onmouseexited();

			 }
		 });
		 a7.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =7;
				 onmouseclicked();

			 }
		 });
		 a8.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =8;
				 onmousedragged();

			 }
		 });
		 a8.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=8;
				 onmouseexited();

			 }
		 });
		 a8.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =8;
				 onmouseclicked();

			 }
		 });
		 a9.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =9;
				 onmousedragged();

			 }
		 });
		 a9.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=9;
				 onmouseexited();

			 }
		 });
		 a9.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =9;
				 onmouseclicked();

			 }
		 });
		 a10.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =10;
				 onmousedragged();

			 }
		 });
		 a10.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=10;
				 onmouseexited();

			 }
		 });
		 a10.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =10;
				 onmouseclicked();

			 }
		 });
		 a11.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =11;
				 onmousedragged();

			 }
		 });
		 a11.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=11;
				 onmouseexited();

			 }
		 });
		 a11.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =11;
				 onmouseclicked();

			 }
		 });

		 b1.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =12;
				 onmousedragged();

			 }
		 });
		 b1.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=12;
				 onmouseexited();

			 }
		 });
		 b1.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =12;
				 onmouseclicked();

			 }
		 });


		 b2.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =13;
				 onmousedragged();

			 }
		 });
		 b2.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=13;
				 onmouseexited();

			 }
		 });
		 b2.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =13;
				 onmouseclicked();

			 }
		 });


		 b3.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =14;
				 onmousedragged();

			 }
		 });
		 b3.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=14;
				 onmouseexited();

			 }
		 });
		 b3.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =14;
				 onmouseclicked();

			 }
		 });


		 b4.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =15;
				 onmousedragged();

			 }
		 });
		 b4.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=15;
				 onmouseexited();

			 }
		 });
		 b4.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =15;
				 onmouseclicked();

			 }
		 });
		 b5.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =16;
				 onmousedragged();

			 }
		 });
		 b5.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=16;
				 onmouseexited();

			 }
		 });
		 b5.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =16;
				 onmouseclicked();

			 }
		 });
		 b6.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =17;
				 onmousedragged();

			 }
		 });
		 b6.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=17;
				 onmouseexited();

			 }
		 });
		 b6.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =17;
				 onmouseclicked();

			 }
		 });

		 b7.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =18;
				 onmousedragged();

			 }
		 });
		 b7.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=18;
				 onmouseexited();

			 }
		 });
		 b7.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =18;
				 onmouseclicked();

			 }
		 });

		 b8.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =19;
				 onmousedragged();

			 }
		 });
		 b8.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=19;
				 onmouseexited();

			 }
		 });
		 b8.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =19;
				 onmouseclicked();

			 }
		 });

		 b9.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =20;
				 onmousedragged();

			 }
		 });
		 b9.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=20;
				 onmouseexited();

			 }
		 });
		 b9.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =20;
				 onmouseclicked();

			 }
		 });

		 b10.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =21;
				 onmousedragged();

			 }
		 });
		 b10.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=21;
				 onmouseexited();

			 }
		 });
		 b10.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =21;
				 onmouseclicked();

			 }
		 });
		 c1.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =22;
				 onmousedragged();

			 }
		 });
		 c1.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=22;
				 onmouseexited();

			 }
		 });
		 c1.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =22;
				 onmouseclicked();

			 }
		 });


		 c2.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =23;
				 onmousedragged();

			 }
		 });
		 c2.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=23;
				 onmouseexited();

			 }
		 });
		 c2.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =23;
				 onmouseclicked();

			 }
		 });


		 c3.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =24;
				 onmousedragged();

			 }
		 });
		 c3.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=24;
				 onmouseexited();

			 }
		 });
		 c3.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =24;
				 onmouseclicked();

			 }
		 });

		 c4.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =25;
				 onmousedragged();

			 }
		 });
		 c4.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=25;
				 onmouseexited();

			 }
		 });
		 c4.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =25;
				 onmouseclicked();

			 }
		 });
		 c5.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =26;
				 onmousedragged();

			 }
		 });
		 c5.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=26;
				 onmouseexited();

			 }
		 });
		 c5.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =26;
				 onmouseclicked();

			 }
		 });
		 c6.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =27;
				 onmousedragged();

			 }
		 });
		 c6.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=27;
				 onmouseexited();

			 }
		 });
		 c6.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =27;
				 onmouseclicked();

			 }
		 });

		 c7.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =28;
				 onmousedragged();

			 }
		 });
		 c7.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=28;
				 onmouseexited();

			 }
		 });
		 c7.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =28;
				 onmouseclicked();

			 }
		 });

		 c8.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =29;
				 onmousedragged();

			 }
		 });
		 c8.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=29;
				 onmouseexited();

			 }
		 });
		 c8.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =29;
				 onmouseclicked();

			 }
		 });

		 c9.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =30;
				 onmousedragged();

			 }
		 });
		 c9.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=30;
				 onmouseexited();

			 }
		 });
		 c9.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =30;
				 onmouseclicked();

			 }
		 });

		 c10.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =31;
				 onmousedragged();

			 }
		 });
		 c10.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=31;
				 onmouseexited();

			 }
		 });
		 c10.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =31;
				 onmouseclicked();

			 }
		 });
		 d1.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =32;
				 onmousedragged();

			 }
		 });
		 d1.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=32;
				 onmouseexited();

			 }
		 });
		 d1.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =32;
				 onmouseclicked();

			 }
		 });


		 d2.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =33;
				 onmousedragged();

			 }
		 });
		 d2.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=33;
				 onmouseexited();

			 }
		 });
		 d2.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =33;
				 onmouseclicked();

			 }
		 });

		 d3.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =34;
				 onmousedragged();

			 }
		 });

		 d3.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=34;
				 onmouseexited();

			 }
		 });
		 d3.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =34;
				 onmouseclicked();

			 }
		 });


		 d4.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =35;
				 onmousedragged();

			 }
		 });
		 d4.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=35;
				 onmouseexited();

			 }
		 });
		 d4.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =35;
				 onmouseclicked();

			 }
		 });
		 d5.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =36;
				 onmousedragged();

			 }
		 });
		 d5.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=36;
				 onmouseexited();

			 }
		 });
		 d5.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =36;
				 onmouseclicked();

			 }
		 });
		 d6.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =37;
				 onmousedragged();

			 }
		 });
		 d6.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=37;
				 onmouseexited();

			 }
		 });
		 d6.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =37;
				 onmouseclicked();

			 }
		 });

		 d7.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =38;
				 onmousedragged();

			 }
		 });
		 d7.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=38;
				 onmouseexited();

			 }
		 });
		 d7.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =38;
				 onmouseclicked();

			 }
		 });

		 d8.setOnMouseEntered(new EventHandler<MouseEvent>(){
			 @Override
			 public void handle(MouseEvent event){
				 enter =39;
				 onmousedragged();

			 }
		 });
		 d8.setOnMouseExited(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 exit=39;
				 onmouseexited();

			 }
		 });
		 d8.setOnMouseClicked(new EventHandler<MouseEvent>(){
			 @Override
			 public void	handle(MouseEvent event){
				 click =39;
				 onmouseclicked();

			 }
		 });
	 }//ends intialize methods


	private void onmousedragged(){
		switch(enter){
		case 0 :System.out.print("not working");
		break;
		case 1 :
			if(!a1.isSelected())
			ia1.setImage(image1);
		break;
		case 2 :
			if(!a2.isSelected())
			ia2.setImage(image1);
		break;
		case 3 :
			if(!a3.isSelected())
			ia3.setImage(image1);
		break;
		case 4 :
			if(!a4.isSelected())
				ia4.setImage(image1);
		break;
		case 5 :
			if(!a5.isSelected())
			ia5.setImage(image1);
		break;
		case 6 :
			if(!a6.isSelected())
			ia6.setImage(image1);
		break;
		case 7 :
			if(!a7.isSelected())
			ia7.setImage(image1);
		break;
		case 8 :
			if(!a8.isSelected())
			ia8.setImage(image1);
		break;
		case 9 :
			if(!a9.isSelected())
			ia9.setImage(image1);
		break;
		case 10 :
			if(!a10.isSelected())
			ia10.setImage(image1);
		break;
		case 11 :
			if(!a11.isSelected())
			ia11.setImage(image1);
		break;
		case 12 :
			if(!b1.isSelected())
			ib1.setImage(image1);
		break;
		case 13 :
			if(!b2.isSelected())
			ib2.setImage(image1);
		break;
		case 14 :
			if(!b3.isSelected())
			ib3.setImage(image1);
		break;
		case 15 :
			if(!b4.isSelected())
			ib4.setImage(image1);
		break;
		case 16 :
			if(!b5.isSelected())
			ib5.setImage(image1);
		break;
		case 17 :
			if(!b6.isSelected())
			ib6.setImage(image1);
		break;
		case 18 :
			if(!b7.isSelected())
			ib7.setImage(image1);
		break;
		case 19 :
			if(!b8.isSelected())
			ib8.setImage(image1);
		break;
		case 20 :
			if(!b9.isSelected())
			ib9.setImage(image1);
		break;
		case 21 :
			if(!b10.isSelected())
			ib10.setImage(image1);
		break;
		case 22 :
			if(!c1.isSelected())
			ic1.setImage(image1);
		break;
		case 23 :
			if(!c2.isSelected())
			ic2.setImage(image1);
		break;
		case 24 :
			if(!c3.isSelected())
			ic3.setImage(image1);
		break;
		case 25 :
			if(!c4.isSelected())
				ic4.setImage(image1);
		break;
		case 26 :
			if(!c5.isSelected())
				ic5.setImage(image1);
		break;
		case 27 :
			if(!c6.isSelected())
				ic6.setImage(image1);
		break;
		case 28 :
			if(!c7.isSelected())
				ic7.setImage(image1);
		break;
		case 29 :
			if(!c8.isSelected())
				ic8.setImage(image1);
		break;
		case 30 :
			if(!c9.isSelected())
				ic9.setImage(image1);
		break;
		case 31 :
			if(!c10.isSelected())
				ic10.setImage(image1);
		break;
		case 32 :
			if(!d1.isSelected())
				id1.setImage(image1);
		break;
		case 33 :
			if(!d2.isSelected())
				id2.setImage(image1);
		break;
		case 34 :
			if(!d3.isSelected())
				id3.setImage(image1);
		break;
		case 35 :
			if(!d4.isSelected())
				id4.setImage(image1);
		break;
		case 36 :
			if(!d5.isSelected())
				id5.setImage(image1);
		break;
		case 37 :
			if(!d6.isSelected())
				id6.setImage(image1);
		break;
		case 38 :
			if(!d7.isSelected())
				id7.setImage(image1);
		break;
		case 39 :
			if(!d8.isSelected())
				id8.setImage(image1);
		break;


		}

	}//onmousedragged method ends
	 private void onmouseexited(){

			 switch(exit){
			 case 0 :System.out.print("not working");
				break;
				case 1 :
					if(!a1.isSelected())
					ia1.setImage(image);
				break;
				case 2 :
					if(!a2.isSelected())
						ia2.setImage(image);
				break;
				case 3 :
					if(!a3.isSelected())
						ia3.setImage(image);
				break;
				case 4 :
					if(!a4.isSelected())
						ia4.setImage(image);
				break;
				case 5 :
					if(!a5.isSelected())
						ia5.setImage(image);
				break;
				case 6 :
					if(!a6.isSelected())
						ia6.setImage(image);
				break;
				case 7 :
					if(!a7.isSelected())
						ia7.setImage(image);
				break;
				case 8 :
					if(!a8.isSelected())
						ia8.setImage(image);
				break;
				case 9 :
					if(!a9.isSelected())
						ia9.setImage(image);
				break;
				case 10 :
					if(!a4.isSelected())
						ia10.setImage(image);
				break;
				case 11 :
					if(!a11.isSelected())
						ia11.setImage(image);
				break;
				case 12 :
					if(!b1.isSelected())
						ib1.setImage(image);
				break;
				case 13 :
					if(!b2.isSelected())
						ib2.setImage(image);
				break;
				case 14 :
					if(!b3.isSelected())
						ib3.setImage(image);
				break;
				case 15 :
					if(!b4.isSelected())
						ib4.setImage(image);
				break;
				case 16 :
					if(!b5.isSelected())
						ib5.setImage(image);
				break;
				case 17 :
					if(!b6.isSelected())
						ib6.setImage(image);
				break;
				case 18 :
					if(!b7.isSelected())
						ib7.setImage(image);
				break;
				case 19 :
					if(!b8.isSelected())
						ib8.setImage(image);
				break;
				case 20 :
					if(!b9.isSelected())
						ib9.setImage(image);
				break;
				case 21 :
					if(!b10.isSelected())
						ib10.setImage(image);
				break;
				case 22 :
					if(!c1.isSelected())
						ic1.setImage(image);
				break;
				case 23 :
					if(!c2.isSelected())
						ic2.setImage(image);
				break;
				case 24 :
					if(!c3.isSelected())
						ic3.setImage(image);
				break;
				case 25 :
					if(!c4.isSelected())
						ic4.setImage(image);
				break;
				case 26 :
					if(!c5.isSelected())
						ic5.setImage(image);
				break;
				case 27 :
					if(!c6.isSelected())
						ic6.setImage(image);
				break;
				case 28 :
					if(!c7.isSelected())
						ic7.setImage(image);
				break;
				case 29 :
					if(!c8.isSelected())
						ic8.setImage(image);
				break;
				case 30 :
					if(!c9.isSelected())
						ic9.setImage(image);
				break;
				case 31 :
					if(!c10.isSelected())
						ic10.setImage(image);
				break;
				case 32 :
					if(!d1.isSelected())
						id1.setImage(image);
				break;
				case 33 :
					if(!d2.isSelected())
						id2.setImage(image);
				break;
				case 34 :
					if(!d3.isSelected())
						id3.setImage(image);
				break;
				case 35 :
					if(!d4.isSelected())
						id4.setImage(image);
				break;
				case 36 :
					if(!d5.isSelected())
						id5.setImage(image);
				break;
				case 37 :
					if(!d6.isSelected())
						id6.setImage(image);
				break;
				case 38 :
					if(!d7.isSelected())
						id7.setImage(image);
				break;
				case 39 :
					if(!d8.isSelected())
						id8.setImage(image);
				break;
				}

		 }


	 private void onmouseclicked(){
		switch(click){
		 case 0 :System.out.print("not working");
			break;
			case 1 :
				if(!a1.isSelected()){
				ia1.setImage(image);
				}else{
					ia1.setImage(image1);
				}
			break;
			case 2 :
				if(!a2.isSelected())
					ia2.setImage(image);
				else{
					ia2.setImage(image1);
				}
			break;
			case 3 :
				if(!a3.isSelected())
					ia3.setImage(image);
				else{
					ia3.setImage(image1);
				}
			break;
			case 4 :
				if(!a4.isSelected())
					ia4.setImage(image);
				else{
					ia4.setImage(image1);
				}
			break;
			case 5 :
				if(!a5.isSelected())
					ia5.setImage(image);
				else{
					ia5.setImage(image1);
				}
				break;
			case 6 :
				if(!a6.isSelected())
					ia6.setImage(image);
				else{
					ia6.setImage(image1);
				}
				break;
			case 7 :
				if(!a7.isSelected())
					ia7.setImage(image);
				else{
					ia7.setImage(image1);
				}
				break;
			case 8 :
				if(!a8.isSelected())
					ia8.setImage(image);
				else{
					ia8.setImage(image1);
				}
				break;
			case 9 :
				if(!a9.isSelected())
					ia9.setImage(image);
				else{
					ia9.setImage(image1);
				}
				break;
			case 10 :
				if(!a4.isSelected())
					ia10.setImage(image);
				else{
					ia10.setImage(image1);
				}
				break;
			case 11 :
				if(!a11.isSelected())
					ia11.setImage(image);
				else{
					ia11.setImage(image1);
				}
				break;
			case 12 :
				if(!b1.isSelected())
					ib1.setImage(image);
				else{
					ib1.setImage(image1);
				}
				break;
			case 13 :
				if(!b2.isSelected())
					ib2.setImage(image);
				else{
					ib2.setImage(image1);
				}
				break;
			case 14 :
				if(!b3.isSelected())
					ib3.setImage(image);
				else{
					ib3.setImage(image1);
				}
				break;
			case 15 :
				if(!b4.isSelected())
					ib4.setImage(image);
				else{
					ib4.setImage(image1);
				}
				break;
			case 16 :
				if(!b5.isSelected())
					ib5.setImage(image);
				else{
					ib5.setImage(image1);
				}
				break;
			case 17 :
				if(!b6.isSelected())
					ib6.setImage(image);
				else{
					ib6.setImage(image1);
				}
				break;
			case 18 :
				if(!b7.isSelected())
					ib7.setImage(image);
				else{
					ib7.setImage(image1);
				}
				break;
			case 19 :
				if(!b8.isSelected())
					ib8.setImage(image);
				else{
					ib8.setImage(image1);
				}
				break;
			case 20 :
				if(!b9.isSelected())
					ib9.setImage(image);
				else{
					ib9.setImage(image1);
				}
				break;
			case 21 :
				if(!b10.isSelected())
					ib10.setImage(image);
				else{
					ib10.setImage(image1);
				}
				break;
			case 22 :
				if(!c1.isSelected())
					ic1.setImage(image);
				else{
					ic1.setImage(image1);
				}
				break;
			case 23 :
				if(!c2.isSelected())
					ic2.setImage(image);
				else{
					ic2.setImage(image1);
				}
				break;
			case 24 :
				if(!c3.isSelected())
					ic3.setImage(image);
				else{
					ic3.setImage(image1);
				}
				break;
			case 25 :
				if(!c4.isSelected())
					ic4.setImage(image);
				else{
					ic4.setImage(image1);
				}
				break;
			case 26 :
				if(!c5.isSelected())
					ic5.setImage(image);
				else{
					ic5.setImage(image1);
				}
				break;
			case 27 :
				if(!c6.isSelected())
					ic6.setImage(image);
				else{
					ic6.setImage(image1);
				}
				break;
			case 28 :
				if(!c7.isSelected())
					ic7.setImage(image);
				else{
					ic7.setImage(image1);
				}
				break;
			case 29 :
				if(!c8.isSelected())
					ic8.setImage(image);
				else{
					ic8.setImage(image1);
				}
				break;
			case 30 :
				if(!c9.isSelected())
					ic9.setImage(image);
				else{
					ic9.setImage(image1);
				}
				break;
			case 31 :
				if(!c10.isSelected())
					ic10.setImage(image);
				else{
					ic10.setImage(image1);
				}
				break;
			case 32 :
				if(!d1.isSelected())
					id1.setImage(image);
				else{
					id1.setImage(image1);
				}
				break;
			case 33 :
				if(!d2.isSelected())
					id2.setImage(image);
				else{
					id2.setImage(image1);
				}
				break;
			case 34 :
				if(!d3.isSelected())
					id3.setImage(image);
				else{
					id3.setImage(image1);
				}
				break;
			case 35 :
				if(!d4.isSelected())
					id4.setImage(image);
				else{
					id4.setImage(image1);
				}
				break;
			case 36 :
				if(!d5.isSelected())
					id5.setImage(image);
				else{
					id5.setImage(image1);
				}
				break;
			case 37 :
				if(!d6.isSelected())
					id6.setImage(image);
				else{
					id6.setImage(image1);
				}
				break;
			case 38 :
				if(!d7.isSelected())
					id7.setImage(image);
				else{
					id7.setImage(image1);
				}
				break;
			case 39 :
				if(!d8.isSelected())
					id8.setImage(image);
				else{
					id8.setImage(image1);
				}
				break;

		}
	 }//onmouseexited ends

public int onBookClicked(){
	int temp = 0;
	try{
		sd.setCity(city.getValue());
	}

	catch (NullPointerException e) {
		temp = 1;
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("Error: you haven't choose your city,Please choose it.");
		alert.show();}

	try{
		sd.setTheatre(theatre.getValue());
	}

	catch (NullPointerException e) {
		temp = 1;
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("Error: you haven't choose your theatre,Please choose it.");
		alert.show();}

	try{
		sd.setMovies(movies.getValue());
	}

	catch (NullPointerException e) {
		temp = 1;
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("Error: you haven't choose your movie,Please choose it.");
		alert.show();}

	try{
		sd.setDate(date.getValue());;
	}

	catch (NullPointerException e) {
		temp = 1;
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("Error: you haven't choose your date,Please choose it.");
		alert.show();}

	int temp2 = 0;
	int num = 0;
	String label = "";
	if(a1.isSelected()){
		label += "A1"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a2.isSelected()){
		label += "A2" +", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(a3.isSelected()){
		label += "A3" +", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(a4.isSelected()){
		label += "A4"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a5.isSelected()){
		label += "A5"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a6.isSelected()){
		label += "A6"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a7.isSelected()){
		label += "A7"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a8.isSelected()){
		label += "A8"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a9.isSelected()){
		label += "A9"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a10.isSelected()){
		label += "A10"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(a11.isSelected()){
		label += "A11"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(b1.isSelected()){
		label += "B1"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(b2.isSelected()){
		label += "B2"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(b3.isSelected()){
		label += "B3"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(b4.isSelected()){
		label += "B4"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(b5.isSelected()){
		label += "B5"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(b6.isSelected()){
		label += "B6"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(b7.isSelected()){
		label += "B7"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(b8.isSelected()){
		label += "B8"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(b9.isSelected()){
		label += "B9"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(b10.isSelected()){
		label += "B10"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(c1.isSelected()){
		label += "C1"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(c2.isSelected()){
		label += "C2"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(c3.isSelected()){
		label += "C3"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(c4.isSelected()){
		label += "C4"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(c5.isSelected()){
		label += "C5"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(c6.isSelected()){
		label += "C6"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(c7.isSelected()){
		label += "C7"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(c8.isSelected()){
		label += "C8"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(c9.isSelected()){
		label += "C9"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(c10.isSelected()){
		label += "C10"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(d1.isSelected()){
		label += "D1"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(d2.isSelected()){
		label += "D2"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(d3.isSelected()){
		label += "D3"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(d4.isSelected()){
		label += "D4"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(d5.isSelected()){
		label += "D5"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(d6.isSelected()){
		label += "D6"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(d7.isSelected()){
		label += "D7"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}
	if(d8.isSelected()){
		label += "D8"+", ";
		sd.setTicketName(label);
		temp2 = 1;
		num++;
	}

	if(num>=1){
		sd.setNumTickets(num);
	}

	if(temp2==0){
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("Error: you haven't choose your seat/s,Please choose it.");
		alert.show();}
int temp3 =0;
	if(rd1.isSelected()){
		sd.setShowtime("10:00 AM");
		temp3 = 1;
	}
	if(rd2.isSelected()){
		sd.setShowtime("3:00 PM");
		temp3 = 1;
	}
	if(rd3.isSelected()){
		sd.setShowtime("10:30 PM");
		temp3 = 1;
	}

	if(temp3 == 0){
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText("Error: you haven't choose your showtime,Please choose it.");
		alert.show();
	}



	if(temp == 0 && temp2==1 && num>=1 && temp3 ==1){
		File file = new File("Receipts.txt");
		try {
			PrintWriter out = new PrintWriter("Receipts.txt");

			    out.print("-----------------Seat Details----------------");
				out.println();
				out.print("City : "+ sd.getCity());
				out.println();
				out.print("Theatre: "+ sd.getTheatre());
				out.println();
				out.print("Movie : "+ sd.getMovies());
				out.println();
				out.print("Showtime: "+ sd.getShowtime() );
				out.println();
				out.print("Number of Tickets: "+ sd.getNumTickets() );
				out.println();
				out.print("Tickets: "+ sd.getTicketName().substring(0,sd.getTicketName().length()-2));
				out.println();
				out.print("------------------Payee Details--------------------");


			out.close();
		}
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		dl.addSeat(sd);
		dl = new DatabaseList();

    return 1;
	}//if ends
	else{
		return 0;
	}

}//onBookClicked ends

private void onSeatClicked(){
	if(!seatpreview.isVisible()){
		seatpreview.setVisible(true);
	}
	else{
		seatpreview.setVisible(false);
	}
}


}//ends the class

