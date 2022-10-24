
public  class Rectangle extends Shape implements Movable {
	private int x, y;   // x and y coordinates of the point

 

   public Rectangle() {
   }
   public Rectangle( int x, int y,double width, double height) {
	   this.x=x;
	   this.y=y;
	   super.height = height;
	   super.width = width;
   }
   @Override
   public double getArea() {
       return super.width *  super.height;
   }
   //Overriding method of base class with different implementation
   @Override
   public void displayshapName() {
       System.out.println("I am a Rectangle"  );
   }
   @Override
   public String toString() {
       return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
   }

@Override
public void moveUp() {
	// TODO Auto-generated method stub
	 y--;
}

@Override
public void moveDown() {
	// TODO Auto-generated method stub
	y++;
}

@Override
public void moveLeft() {
	// TODO Auto-generated method stub
	x--;
}

@Override
public void moveRight() {
	// TODO Auto-generated method stub
	x++;
}

@Override
public String getCoordinate() {
	// TODO Auto-generated method stub
	return  "(" + x + "," + y + ")";
	
}
}