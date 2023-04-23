import java.util.regex.Pattern;

public class Contact {
    private String name;
    private String number;
    private String email;

    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Имя не должно содержать пробелы
        if (!name.contains(" ")) {
            this.name = name;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        // Номер должен начинаться со знака + и быть длиной 12 символов
        if (number.startsWith("+") && number.length() == 12) {
            this.number = number;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // E-mail должен соответствовать шаблону
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(email).matches()) {
            this.email = email;
        }
    }


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
