public class YourLastName_Java1 {
  //Notice that the class name is written in 'Camel case'. The file name for java should match the class name.
  //So if my last name is Davis, I would create a new file Davis_Java1.java
   public static void main(String[] args) {
      // here, we'll call on methods - like we created in the Arduino Morse code - to write out a message
    sayName("George");
    /*Notice that we call the method sayName that we created below. We also passed a String to it. We will create other methods and pass
      data such as integeres to them. */
    printAge(100);
      //Notice we used quotes with the String but not the integer
      /* !! Now working off of these examples - change the examples and create 8 more methods to describe anything about you. 4 should have
      Strings, 4 should have integers. */
   }


static void sayName(String something){ //this takes a String
  System.out.printf("My name is %s. ", something);
  //notice we used printf and not just print or println
  }
static void printAge(int i){ //this takes an integer
  System.out.printf("I am %d years old. ", i);
}

//Add your 8 methods here - and add a brief code comment for each ecplaining what it does.




}
