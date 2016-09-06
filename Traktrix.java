public class Traktrix { 
  public static void main(String[] args) throws InterruptedException {
    World w = new World(400,400);
    Turtle t1 = new Turtle(w);
    Turtle t2 = new Turtle(w);
    Turtle t3 = new Turtle(w);
    Turtle t4 = new Turtle(w);
    t1.disablePath();
    t2.disablePath();
    t3.disablePath();
    t4.disablePath();
    t1.moveTo(380,380);
    t2.moveTo(20,20);
    t3.moveTo(20,380);
    t4.moveTo(380,20);
    t1.enablePath();
    t2.enablePath();
    t3.enablePath();
    t4.enablePath();
    while (t1.distanceTo(200,200)>20) {
      t1.turnTo(t3);
      t1.move(20);
      t2.turnTo(t4);
      t2.move(20);
      t3.turnTo(t2);
      t3.move(20);
      t4.turnTo(t1);
      t4.move(20);   
      Thread.sleep(200);

    }
  }
}