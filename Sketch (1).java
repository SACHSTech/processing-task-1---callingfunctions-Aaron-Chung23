import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(32, 131, 266);
    stroke(54);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
  //Ground
    fill(0, 100, 0);
    rect(0, 300, 445, 260);

  //Sun
    fill(255, 255, 0);
    ellipse(0, 0, 180, 180);

  //Chimney
    fill(128, 128, 128);
    rect(200, 40, 50, 70);
  //Building #1
    fill(255, 0, 0);
    ellipse(280, 150, 200, 190);
  
    fill(255, 0, 0);
    rect(180,150,200,190);

  //Door
    fill (128, 64, 0);
    rect(250, 250, 60, 90);
  //Doorknob
    fill (128, 128, 128);
    ellipse(290, 300, 10, 10);
  //Windows
    fill(255,255,255);
    rect(320, 160, 50, 50);
    rect(200, 160, 50, 50);
    line(200, 185, 250, 185);
    line(225, 160, 225, 210);
    line(320, 185, 370, 185);
    line(345, 160, 345, 210);
  //Garage
    fill(255, 0, 0);
    rect(30, 210, 150, 130);
    fill (128, 128, 128);
    rect(60, 230, 100, 110);
    stroke(0, 0, 0);
    line(60, 240, 160, 240);
    line(60, 260, 160, 260);
    line(60, 280, 160, 280);
    line(60, 300, 160, 300);
    line(60, 320, 160, 320);

  }
  
  // define other methods down here.
}