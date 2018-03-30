 /*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 12
 */

class MementoDemo
{
   public static void main(String[] args)
   {
       Caretaker caretaker = new Caretaker();
       Originator originator = new Originator();
       
       originator.set("State1");
       System.out.println("I am in: " + originator.getMystate());
       
       originator.set("State2");
       System.out.println("I am in: " + originator.getMystate());
       
       caretaker.addMemento( originator.saveToMemento() );
       originator.set("State3");
       System.out.println("I am in: " + originator.getMystate());
       
       caretaker.addMemento( originator.saveToMemento() );
       originator.set("State4");
       System.out.println("I am in: " + originator.getMystate());

       originator.restoreFromMemento( caretaker.getMemento(1) );
       System.out.println("I am in: " + originator.getMystate());
       
       originator.restoreFromMemento( caretaker.getMemento(0) );
       System.out.println("I am in: " + originator.getMystate());
   }
}