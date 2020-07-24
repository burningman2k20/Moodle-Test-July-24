//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args)// throws IOException
    {
        List<Book> books = new ArrayList<Book>();
        Book book;
        String input = "1";
        String _bookName = "";
        String _isbn = "";
        String _author = "";
        String _publisher = "";
        int count = 2000;
        
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //= new Book("Hello Java Book","ISBN00000012","Me","Myself");

        //book.DisplayDescription();
                while (count < 2030){
                        //!input.equals("")){

            //System.out.printf("Leave blank and press enter to exit.\nBook Name: \n");
            //input = String.format("Hello Java %d",count);
            //input = reader.readLine();
            //if (input.equals("")) break;
            _bookName = String.format("Hello Java %d",count);

            //System.out.printf("ISBN: \n");
            //input = reader.readLine();
            _isbn =   String.format("ISBN%d", count);

//            System.out.printf("Author: \n");
//            input = reader.readLine();
            _author = "Me";

            //System.out.printf("Publisher: \n");
            //input = reader.readLine();
            _publisher = "Myself";
            book = new Book(_bookName, _isbn, _author, _publisher);
            books.add(book);

            count++;

        }

                for (Book dbook : books){
                    dbook.DisplayDescription();
                }
    }
}
