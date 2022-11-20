import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;






public class Main {

    public static void main(String args[]) throws SQLException {
            DBConnect connect = new DBConnect();
            String query = "select * from book";


        try {


            
            Statement statement = connect.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {
                Book book = new Book();
                book.setId(resultSet.getInt(1));
                book.setTitle(resultSet.getString(2));
                book.setAuthor(resultSet.getString(3));
                book.setPrice(resultSet.getInt(4));
                book.setAmount(resultSet.getInt(5));

                System.out.println(book);

            }


        } catch (SQLException e)
        {
         e.printStackTrace();
        }


    }

}