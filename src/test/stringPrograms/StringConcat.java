public class StringConcat {
    public static void main(String args[])
    {
        String name="pranita tanmay mule";
        String [] sArr=name.split(" ");
       String finalS="";
        for(String s:sArr)
        {
            String newS="";
          newS=  s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
          finalS+=newS+" ";
          newS="";
        }
        System.out.println(finalS);
    }
}
