public class StrollingTurtles { 
public static void main(String[] args) throws InterruptedException {
Turtle t6;
t6.move(50);
      int kollisioner = 0;
      int steg = 0;
      World w = new World(400,400);
      Turtle t1 = new Turtle(w);
      Turtle t2 = new Turtle(w);
      t1.moveTo(175,200);
      t2.moveTo(225,200);
      t1.moveRandom();
      t2.moveRandom();
      steg +=1;
        while (t1.distance(t2)>200){
        t1.moveRandom();
        t2.moveRandom();
        Thread.sleep(200);
        steg +=1;
          if (t1.distance(t2)<20) {
          System.out.println("Krock!");
          kollisioner +=1;
          
      }
          
     }
     System.out.println("Antal krockar: " + kollisioner);
     System.out.println("Antal steg: " + steg);
  }

}
