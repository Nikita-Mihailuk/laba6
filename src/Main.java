class Reader{
    String fio;
    int numTicket;
    String faculty;
    String date;
    String telephone;
    Reader(String fio, int numTicket, String faculty, String date, String telephone){
        this.fio = fio;
        this.numTicket = numTicket;
        this.faculty = faculty;
        this.date = date;
        this.telephone = telephone;
    }
    public void takeBook(String ... books){
        System.out.print(fio + "  взял книги: ");
        for (String book : books){
            System.out.print(book +", ");
        }
        System.out.println();
    }
    public void takeBook(int x){
        System.out.println(fio + "  взял " + x + " книги");
    }
    public void returnBook(String ... books){
        System.out.print(fio + "  вернул книги: ");
        for (String book : books){
            System.out.print(book +", ");
        }
        System.out.println();
    }
    public void returnBook(int x){
        System.out.println(fio + "  ввернул " + x + " книги");
    }
}

public class Main {
    public static void main(String[] args) {

        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Иванов Иван Иванович", 12345, "Факультет информационных технологий", "01.01.2006", "+7(123)456-78-90");
        readers[1] = new Reader("Петров Петр Петрович", 23456, "Факультет экономики", "02.02.2007", "+7(234)567-89-01");
        readers[2] = new Reader("Сидоров Сидор Сидорович", 34567, "Факультет иностранных языков", "03.03.2008", "+7(345)678-90-12");
        readers[3] = new Reader("Кузнецова Анна Ивановна", 45678, "Факультет психологии", "04.04.2005", "+7(456)789-01-23");
        readers[4] = new Reader("Смирнов Алексей Петрович", 56789, "Факультет медицины", "05.05.2000", "+7(567)890-12-34");

        readers[0].takeBook(3);
        readers[1].takeBook("Словарь","Сказка","Приключения");
        readers[2].returnBook(10);
        readers[3].returnBook("Энциклопедия","Рассказ");
        readers[4].takeBook("Словарь","Сказка","Фантастика","Стихи");

    }
}