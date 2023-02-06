class Person{
   private int age;
  public Person(int age){
      this.age=age;
  }
   public void yearPasses(){
     age=age+1;
  }
  public void amIOld(){
    if(age<0){
   
      System.out.println("Age is not valid, setting age to 0.");
      age=0;
    }

   if(age>=13 && age<18){
      System.out.println("You are a teenager.");
    }
    else if(age<13){
      System.out.println("You are young.");
    }
    else{
      System.out.println("You are old.");
    }
  }

  
}
