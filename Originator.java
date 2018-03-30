import java.util.ArrayList;
/*
* Name: Ash Scarbrough
* Class: CSCI-C490
* Semester: Summer II, 2017
* Assignment: Lab 12
*/

class Originator
{
   private String state;

   public void set(String state)
   { 
       this.state = state; 
   }

   public Memento saveToMemento()
   { 
       return new Memento(this.state);
   }
   public void restoreFromMemento(Memento m)
   {
	   this.state = m.getSavedState();
   }
   
   public String getMystate()
   {
	   return state;
   }
}   

