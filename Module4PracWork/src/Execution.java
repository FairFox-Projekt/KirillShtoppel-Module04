import java.util.*;
public class Execution {
    public static void main(String[] args) {

        
//        DocumentCreator[] creators = new DocumentCreator[] {
//                new ReportCreator(),
//                new ResumeCreator(),
//                new LetterCreator()
//        };
//        for (DocumentCreator creator : creators) {
//            Document doc = creator.CreateDocument();
//            doc.Open();
//        } - до ввода пользователя.


        Scanner scan = new Scanner(System.in);
        List<DocumentCreator> creators = new ArrayList<DocumentCreator>();
        boolean working = true;
        while (working) {
            System.out.println("Ready: " + creators.size());
            System.out.println("Create document: ");
            System.out.println("1 - Report ");
            System.out.println("2 - Resume ");
            System.out.println("3 - Letter ");
            System.out.println("4 - Check ");
            System.out.println("0 - Stop ");
            int choose = scan.nextInt();
            switch(choose) {
                case 1: creators.add(new ReportCreator()); break;
                case 2: creators.add(new ResumeCreator()); break;
                case 3: creators.add(new LetterCreator()); break;
                case 4: creators.add(new CheckCreator()); break;
                case 0: working = false; break;
                default: System.out.println("Not that."); break;
            }
        }
        for (DocumentCreator creator : creators) {
            Document doc = creator.CreateDocument();;
            doc.Open();
        }
    }
}
