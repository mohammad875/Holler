public class TestCase

{
    public static void main(String[] args)
    {
        // create an employee object

        Groups gp = new Groups();
       
        List<?> groups = grouping(Arrays.asList(1,2,3), Arrays.asList(4,1,5));
        System.out.println(groups.size());
        System.out.println(groups);

        
    }
}