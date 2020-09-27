int x1 = 250;
  int x2 = 500;
void setup() {
  size(800,500);
}

void draw() {
background(#FFFFFF);
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
  int size=200;
  for(int i = 20;i > 0; i--){
    if (i%2==0){
      noFill();
    }
    else{
      noFill();
    }
    ellipse(x1,250,size,size);
    size-=10;
  }
    int size2=200;
  for(int i = 20;i > 0; i--){
    if (i%2==0){
     noFill();
    }
    else{
     noFill();
    }
    ellipse(x2,250,size2,size2);
    size2-=10;
  }
 x1++;
  x2--;
  if(x1>800){
    x1=0;
    x2=800;
  }
}
