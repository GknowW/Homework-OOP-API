import org.example.FormDate;
import org.example.Post;

public class Main {

    public static void main(String[] args) {
        Post Post = new Post();
        Post.name = "Иван";
        Post.passport = "4444 № 44444444";
        Post.patronymic = "Иванович";
        Post.phone = "+7 (999)-999-99-99";
        Post.surname = "Иванов";
        Post.subscryption = true;
        Post.birthday = new FormDate();
        Post.birthday.day = 13;
        Post.birthday.month = 6;
        Post.birthday.year = 1999;

    }
}