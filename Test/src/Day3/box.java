package Day3;

class box {
 double width, height, depth;

 
 box(double w, double h, double d) {
     width = w;
     height = h;
     depth = d;
 }
 double getVolume() {
     return width * height * depth;
 }

 
 public static void main(String[] args) {
     box mybox = new box(5.0, 3.0, 2.0);

     System.out.println("Volume of the box is: " + mybox.getVolume());
 }
}
