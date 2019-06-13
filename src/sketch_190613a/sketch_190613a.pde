int size = 600;
int ring = 1;
void setup() {
  size(600,600);
}

void draw() {
  if (size > 0) {
    if(ring % 2 ==1) {
  fill(255,0,0);}
  else {
    fill(0,0,0);
  }
  ellipse(300,300,size,size);
  ring ++;
  size-=100;
  
  }
}