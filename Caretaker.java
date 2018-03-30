 /*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 12
 */

import java.util.ArrayList;

class Caretaker
{
   private ArrayList<Memento> savedStates = new ArrayList<Memento>();

   public void addMemento(Memento m)
   {
	   savedStates.add(m);
   }
   
   public Memento getMemento(int i) 
   {
	   return savedStates.get(i);
   }
}   
