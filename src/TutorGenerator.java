import java.util.Random;

public class TutorGenerator {
    private static Random random = new Random();
    private static String[] randomName = new String[]
            {"Крюков Александр Фёдорович",
             "Сычева Ксения Матвеевна",
            "Попов Михаил Юрьевич",
            "Климов Александр Матвеевич",
            "Михайлова Арина Леонидовна",
            "Романова Анастасия Макаровна",
            "Муравьев Юрий Кириллович",
            "Попова Екатерина Тимофеевна",
            "Сухова Милана Робертовна",
            "Воронов Андрей Всеволодович",
            "Добрынин Иван Ильич",
            "Широков Тимофей Русланович",
            "Блинов Тимофей Тимурович",
            "Горбачева Дарья Максимовна",
            "Пугачев Артём Дмитриевич",
            "Жданов Андрей Львович",
            "Климов Александр Павлович",
            "Баранов Владислав Борисович",
            "Горбунова Виктория Елисеевна",
            "Кондратова Арина Алексеевна"};
    private static String[] speciality = new String[]
            {
                "Математика",
                "Физика",
                "Англиский",
                "Химия"
            };

    public static Tutor[] generateTutor(int n){
        Tutor[] tutors = new Tutor[n];
        for (int i = 0; i < tutors.length; i++){
            tutors[i] = new Tutor(randomName[random.nextInt(18)],random.nextInt(31),speciality[random.nextInt(3)]);
          int x= 0;
        }
        return tutors;
    }
}
