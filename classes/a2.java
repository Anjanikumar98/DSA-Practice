public class a2 {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Anjanikumar");

        System.out.println(sb);

        // set char at index
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        sb.insert(0, 's');
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);

        // add char at end
        sb.append("r");
        System.out.println(sb);
    }
}