 /*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 12
 */

import java.util.*;

class Memento
{
   private String state;

   public Memento(String stateToSave)
   {
	   state = stateToSave;
   }
   
   public String getSavedState()
   {
	   return state;
   }
}

