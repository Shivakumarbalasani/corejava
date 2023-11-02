class EmployApplication
{
     public static void main(String[] args)
     {
       String name="Shiva";
       int id=252525;
       String designation="Team Leader";
       String department="App development";
       int totalworkingdays=30;
       int totalpresentdays=20;
       int totalabsentdays=10;
       double salarydaywise=1000.50;
       double salarycredited=totalpresentdays*salarydaywise;
       double actualsalary=totalworkingdays*salarydaywise;



       System.out.println(name);
       System.out.println(id);
       System.out.println(designation);
       System.out.println(department);
       System.out.println(totalworkingdays);
       System.out.println(totalpresentdays);
       System.out.println(totalabsentdays);
       System.out.println(salarydaywise);
       System.out.println(salarycredited);
       System.out.println(actualsalary);


     }




}