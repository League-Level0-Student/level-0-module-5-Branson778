
void setup() {
  size(800,500);
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
  int size=200;
  for(int i = 0;i < 8; i++){
    if (i%2==0){
      fill(255,0,0);
    }
    else{
      fill(#FFFFFF);
    }
    ellipse(250,250,size,size);
    size-=25;
  }
}
