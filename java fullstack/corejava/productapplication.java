class Productapplication
{

     public static void main(String []args)
     {
         String name="Nivea";
         char code='B';
         int id=2525;
         double actualprice=80.6;
         double sellingprice=70.1;
         int quantity=5;
         double totalcost=sellingprice*quantity;
         double discount=(25.0/100)*totalcost;
         double totalpackage=totalcost-discount;
         
        System.out.println(name);
         System.out.println(code);
          System.out.println(id);
           System.out.println(actualprice);
            System.out.println(sellingprice);
             System.out.println(quantity);
              System.out.println(totalcost);
               System.out.println(discount);
                System.out.println(totalpackage);
     }
}