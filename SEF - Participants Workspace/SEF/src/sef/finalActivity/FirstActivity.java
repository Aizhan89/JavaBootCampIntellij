public class FirstActivity {

   public static void main(String[] args) {
       Person p = new Person("Aizhan", 31);
       p.introduce();

       Employee e1 = new Employee( "Ivan", 21, "Developer", "Accenture", 1000);
       Employee e2 = new Employee( "Vlad", 22, "Tester", "Accenture", 1500);
       Employee e3 = new Employee( "Jana", 23, "Tester", "Accenture", 2000);
       Employee e4 = new Employee( "Sonya", 24, "Developer", "Accenture", 2500);
       Employee e5 = new Employee( "Igor", 25, "Developer", "Accenture", 1200);
   }
}
