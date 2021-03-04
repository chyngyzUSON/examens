import java.sql.*;

public class ForExamDB {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "5454";

//  Соединение с БД

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully(Подключено успешно)");
        }
        catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return conn;
    }

//  DML Методы

    public static void insertNews(){
        String SQL = "insert into news(id, news_headline, news_text, news_writer, publication_time) values(?, ?, ?, ?, ?)";

        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Биткойн в среду превысил 52000 долларов, а рыночная капитализация приблизилась к 1 триллиону долларов.\n" +
                    "\n" +
                    "Биткойн (BTC) торгуется около $ 52 231,69 на 21:00 UTC (16:00 по восточному времени). Рост на 7,16% за предыдущие 24 часа.\n" +
                    "\n" +
                    "24-часовой диапазон Биткойн: 48 430,80–52536,47 долларов (CoinDesk 20)\n" +
                    "\n" +
                    "BTC торгуется выше своих 10-часовых и 50-часовых средних значений на часовом графике, что является бычьим сигналом для рыночных техников.\n" +
                    "\n" +
                    "Биткойн находится на «неизведанной территории», сказал Хунаин Насир, старший редактор OKEx Insights, после того, как его цена выросла до нового рекордного максимума, превысив 52 000 долларов, всего через день после того, как он преодолел ключевой психологический порог в 50 000 долларов.\n" +
                    "\n" +
                    "Волатильность цен остается высокой по сравнению с основными макроактивами, включая индекс акций, золота и облигаций Standard & Poor's 500.");
            preparedStatement.setString(3, "Муяо Шен");
            preparedStatement.setString(4, "2021-02-18 03:40:00");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void selectNews(){
        String SQL = "select news_headline, news_text from news";

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);){

            while (rs.next()){
                System.out.println(rs.getString(1) + "\n " +
                        rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void updateNews(){
        String SQL = "update news set id = 5";

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);){

            while (rs.next()){
                System.out.println(rs.getString(1) + "\n " +
                        rs.getString(2));
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteNews(){
        String SQL = "delete from news where id = ?";

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);){


        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }








}
