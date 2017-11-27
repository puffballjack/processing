import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Pvec extends PApplet {

/*PVector location;
PVector velocity;

void setup(){
  size(640, 360);
  location = new PVector(100, 100);
  velocity = new PVector(2.5, 5);
  stroke(0);
  fill(175);
}

void draw(){
  background(255);

  location.add(velocity);

  if((location.x >= width) || (location.x <= 0)){
    velocity.x = velocity.x * -1;
  }
  if((location.y >= height) || (location.y <= 0)){
    velocity.y = velocity.y * -1;
  }

  ellipse(location.x, location.y, 16, 16);
}*/

public void draw() {
  background(255);

  PVector mouse = new PVector(mouseX,mouseY);
  PVector center = new PVector(width/2,height/2);
  mouse.sub(center);
 
  mouse.normalize();
  mouse.mult(50);
  translate(width/2,height/2);
  line(0,0,mouse.x,mouse.y);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Pvec" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
