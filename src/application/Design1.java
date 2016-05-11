package application;
	
import com.sun.javafx.css.converters.ColorConverter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
public class Design1 extends Application{
 static double x=150,y=150,widthlistner,heightlistner=800;
Button 
b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,pluse,del,c,mince,mul,div,mod,equl,log,openp,closep,squer,root,dot;
	String lineSeparator = System.getProperty("line.separator");//down line
	double btnwidth;
    double btnheight;
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		
		Rectangle2D rect=Screen.getPrimary().getVisualBounds();
		widthlistner=rect.getWidth();//widthlistner=800;
		heightlistner=rect.getHeight();	//heightlistner=800;
		btnwidth=(widthlistner-35)/6;// set space horizin
        btnheight=(heightlistner-30)/6; // set space  vertical
   Label t1= new Label("");
	        b0=new Button("0");        	    
	        b1=new Button("1");  
	        b2=new Button("2");
	        b3=new Button("3");
	        b4=new Button("4");
	        b5=new Button("5");  
	        b6=new Button("6");
	        b7=new Button("7");
	        b8=new Button("8");
	        b9=new Button("9");
	        pluse=new Button("+");
	        mince=new Button("-");
	        div=new Button("/");
	        mul=new Button("x");
	        mod=new Button("%");
	        c = new Button("C");
	        del=new Button("<-"); 
	        equl=new Button("=");
	        log=new Button("log");
	        openp=new Button("(");
	        closep=new Button(")");
	        squer=new Button("^");
	        root=new Button("√");
	        dot=new Button(".");
	 Pane pane=new Pane();
     HBox text=new HBox();
pane.getChildren().addAll(text,b7,b8,b9,c,log,div,b4,b5,b6,mul,openp,closep,b1,b2,b3,mince,squer,root,b0,dot,mod,pluse,equl);
	        text.setPrefSize(widthlistner,2*heightlistner/6);

	        t1.setPrefSize(btnwidth*5+20,2*btnheight);//5 btn pluse 5 for each space =20
			   c.setPrefSize(btnwidth,btnheight);
			   del.setPrefSize(btnwidth,2*btnheight);
			   b7.setPrefSize(btnwidth,btnheight);
			   b6.setPrefSize(btnwidth,btnheight);
			   b5.setPrefSize(btnwidth,btnheight);
			   b4.setPrefSize(btnwidth,btnheight);
			   b3.setPrefSize(btnwidth,btnheight);
			   b2.setPrefSize(btnwidth,btnheight);
			   b1.setPrefSize(btnwidth,btnheight);
			   b0.setPrefSize(btnwidth,btnheight);
			   b8.setPrefSize(btnwidth,btnheight);
			   b9.setPrefSize(btnwidth,btnheight);
			   log.setPrefSize(btnwidth,btnheight);
			   div.setPrefSize(btnwidth,btnheight);
			   mul.setPrefSize(btnwidth,btnheight);
			   openp.setPrefSize(btnwidth,btnheight);
			   closep.setPrefSize(btnwidth,btnheight);
			   mince.setPrefSize(btnwidth,btnheight);
			   root.setPrefSize(btnwidth,btnheight);
			   equl.setPrefSize(btnwidth*2+5,btnheight);
			   pluse.setPrefSize(btnwidth,btnheight);
			   mod.setPrefSize(btnwidth,btnheight);
			   squer.setPrefSize(btnwidth,btnheight);
			   dot.setPrefSize(btnwidth,btnheight);
			   text.relocate(0,0); // the location of btn
			   b7.relocate(5,2*btnheight+10);
			   b4.relocate(5,3*btnheight+15);
			   b1.relocate(5,4*btnheight+20);
			   b0.relocate(5,5*btnheight+25);
			   b8.relocate(10+btnwidth,2*btnheight+10);
			   b5.relocate(10+btnwidth,3*btnheight+15);
			   b2.relocate(10+btnwidth,4*btnheight+20);
			   dot.relocate(10+btnwidth,5*btnheight+25);
			   b9.relocate(15+btnwidth*2,2*btnheight+10);
			   b6.relocate(15+btnwidth*2,3*btnheight+15);
			   b3.relocate(15+btnwidth*2,4*btnheight+20);
			   mod.relocate(15+btnwidth*2,5*btnheight+25);
			   div.relocate(20+btnwidth*3,2*btnheight+10);
			   mince.relocate(20+btnwidth*3,3*btnheight+15);
			   mul.relocate(20+btnwidth*3,4*btnheight+20);
			   pluse.relocate(20+btnwidth*3,5*btnheight+25);
			   c.relocate(25+4*btnwidth,2*btnheight+10);
			   openp.relocate(25+4*btnwidth,3*btnheight+15);
			   squer.relocate(25+4*btnwidth,4*btnheight+20);
			   equl.relocate(25+4*btnwidth,5*btnheight+25);
			   log.relocate(30+5*btnwidth,2*btnheight+10);
			   closep.relocate(30+5*btnwidth,3*btnheight+15);
			   root.relocate(30+5*btnwidth,4*btnheight+20);
			   
			   Scene scene = new Scene(pane);
		       text.getChildren().addAll(t1,del);
		       
		       
			  primaryStage.widthProperty().addListener(ov ->
				  {
					  heightlistner=primaryStage.getHeight();
					  widthlistner=primaryStage.getWidth();
				        text.setPrefSize(widthlistner,2*heightlistner/6);
				         btnwidth=(widthlistner-35)/6;
				         btnheight=(heightlistner-30)/6;
				        t1.setPrefSize(btnwidth*5+20,2*btnheight);
						   c.setPrefSize(btnwidth,btnheight);
						   del.setPrefSize(btnwidth,2*btnheight);
						   b7.setPrefSize(btnwidth,btnheight);
						   b6.setPrefSize(btnwidth,btnheight);
						   b5.setPrefSize(btnwidth,btnheight);
						   b4.setPrefSize(btnwidth,btnheight);
						   b3.setPrefSize(btnwidth,btnheight);
						   b2.setPrefSize(btnwidth,btnheight);
						   b1.setPrefSize(btnwidth,btnheight);
						   b0.setPrefSize(btnwidth,btnheight);
						   b8.setPrefSize(btnwidth,btnheight);
						   b9.setPrefSize(btnwidth,btnheight);
						   log.setPrefSize(btnwidth,btnheight);
						   div.setPrefSize(btnwidth,btnheight);
						   mul.setPrefSize(btnwidth,btnheight);
						   openp.setPrefSize(btnwidth,btnheight);
						   closep.setPrefSize(btnwidth,btnheight);
						   mince.setPrefSize(btnwidth,btnheight);
						   root.setPrefSize(btnwidth,btnheight);
						   equl.setPrefSize(btnwidth*2+5,btnheight);
						   pluse.setPrefSize(btnwidth,btnheight);
						   mod.setPrefSize(btnwidth,btnheight);
						   squer.setPrefSize(btnwidth,btnheight);
						   dot.setPrefSize(btnwidth,btnheight);
						   text.relocate(0,0);
						   b7.relocate(5,2*btnheight+10);
						   b4.relocate(5,3*btnheight+15);
						   b1.relocate(5,4*btnheight+20);
						   b0.relocate(5,5*btnheight+25);
						   b8.relocate(10+btnwidth,2*btnheight+10);
						   b5.relocate(10+btnwidth,3*btnheight+15);
						   b2.relocate(10+btnwidth,4*btnheight+20);
						   dot.relocate(10+btnwidth,5*btnheight+25);
						   b9.relocate(15+btnwidth*2,2*btnheight+10);
						   b6.relocate(15+btnwidth*2,3*btnheight+15);
						   b3.relocate(15+btnwidth*2,4*btnheight+20);
						   mod.relocate(15+btnwidth*2,5*btnheight+25);
						   div.relocate(20+btnwidth*3,2*btnheight+10);
						   mince.relocate(20+btnwidth*3,3*btnheight+15);
						   mul.relocate(20+btnwidth*3,4*btnheight+20);
						   pluse.relocate(20+btnwidth*3,5*btnheight+25);
						   c.relocate(25+4*btnwidth,2*btnheight+10);
						   openp.relocate(25+4*btnwidth,3*btnheight+15);
						   squer.relocate(25+4*btnwidth,4*btnheight+20);
						   equl.relocate(25+4*btnwidth,5*btnheight+25);
						   log.relocate(30+5*btnwidth,2*btnheight+10);
						   closep.relocate(30+5*btnwidth,3*btnheight+15);
						   root.relocate(30+5*btnwidth,4*btnheight+20);
						   }
				  
				 );
	        
			   primaryStage.heightProperty().addListener(ov ->
				  {
					  heightlistner=primaryStage.getHeight();
					  widthlistner=primaryStage.getWidth();
				        text.setPrefSize(widthlistner,2*heightlistner/6);
				         btnwidth=(widthlistner-35)/6;
				         btnheight=(heightlistner-30)/6;
				        t1.setPrefSize(btnwidth*5+20,2*btnheight);
						   c.setPrefSize(btnwidth,btnheight);
						   del.setPrefSize(btnwidth,2*btnheight);
						   b7.setPrefSize(btnwidth,btnheight);
						   b6.setPrefSize(btnwidth,btnheight);
						   b5.setPrefSize(btnwidth,btnheight);
						   b4.setPrefSize(btnwidth,btnheight);
						   b3.setPrefSize(btnwidth,btnheight);
						   b2.setPrefSize(btnwidth,btnheight);
						   b1.setPrefSize(btnwidth,btnheight);
						   b0.setPrefSize(btnwidth,btnheight);
						   b8.setPrefSize(btnwidth,btnheight);
						   b9.setPrefSize(btnwidth,btnheight);
						   log.setPrefSize(btnwidth,btnheight);
						   div.setPrefSize(btnwidth,btnheight);
						   mul.setPrefSize(btnwidth,btnheight);
						   openp.setPrefSize(btnwidth,btnheight);
						   closep.setPrefSize(btnwidth,btnheight);
						   mince.setPrefSize(btnwidth,btnheight);
						   root.setPrefSize(btnwidth,btnheight);
						   equl.setPrefSize(btnwidth*2+5,btnheight);
						   pluse.setPrefSize(btnwidth,btnheight);
						   mod.setPrefSize(btnwidth,btnheight);
						   squer.setPrefSize(btnwidth,btnheight);
						   dot.setPrefSize(btnwidth,btnheight);
						   text.relocate(0,0);
						   b7.relocate(5,2*btnheight+10);
						   b4.relocate(5,3*btnheight+15);
						   b1.relocate(5,4*btnheight+20);
						   b0.relocate(5,5*btnheight+25);
						   b8.relocate(10+btnwidth,2*btnheight+10);
						   b5.relocate(10+btnwidth,3*btnheight+15);
						   b2.relocate(10+btnwidth,4*btnheight+20);
						   dot.relocate(10+btnwidth,5*btnheight+25);
						   b9.relocate(15+btnwidth*2,2*btnheight+10);
						   b6.relocate(15+btnwidth*2,3*btnheight+15);
						   b3.relocate(15+btnwidth*2,4*btnheight+20);
						   mod.relocate(15+btnwidth*2,5*btnheight+25);
						   div.relocate(20+btnwidth*3,2*btnheight+10);
						   mince.relocate(20+btnwidth*3,3*btnheight+15);
						   mul.relocate(20+btnwidth*3,4*btnheight+20);
						   pluse.relocate(20+btnwidth*3,5*btnheight+25);
						   c.relocate(25+4*btnwidth,2*btnheight+10);
						   openp.relocate(25+4*btnwidth,3*btnheight+15);
						   squer.relocate(25+4*btnwidth,4*btnheight+20);
						   equl.relocate(25+4*btnwidth,5*btnheight+25);
						   log.relocate(30+5*btnwidth,2*btnheight+10);
						   closep.relocate(30+5*btnwidth,3*btnheight+15);
						   root.relocate(30+5*btnwidth,4*btnheight+20);
						   }
				  
				 );
			   ///////////////////////////////////////////////////////////
			 pane.setStyle("-fx-background:#a73a8a;");
			 HBox.setMargin(t1,new Insets(5)); // left space for all sides
			 HBox.setMargin(del,new Insets(5,0,0,0));
			 ////////////////////////////////////////////////////////////
			 
			 primaryStage.setTitle("test"); // Set the stage title
	        primaryStage.setScene(scene); // Place the scene in the stage
		    primaryStage.show();
	}
	public static void main(String[] args)
	{ 
		Application.launch();
	}
}
