import javax.swing.*;
import java.awt.*;

/**
 1.Создайте Swing-приложение на размещение заказов на покупку велосипедов.
 Оно должно содержать два текстовых поля - Модель велосипеда и Количество,
 кнопку Разместить заказ и сообщение для подтверждения заказа.
 2. Используйте код из примеров с OrderWindow и TooManyBikesException.
 Попробуйте несколько комбинаций моделей велосипедов и количества, которые
 вызывали бы исключение.
 3. Измените приложение из предыдущего задания, заменив текстовое поле
 Модель велосипеда выпадающим меню с несколькими моделями, чтобы
 пользователь мог выбрать из списка, вместо того, чтобы вводить с клавиатуры.
 4. Прочитайте в Интернете про Swing- компоненты JComboBox и ItemListener
 для обработки событий, когда пользователь выбирает модель велосипеда.
 */

public class Buying_Bikes {
    public static void main(String[] args) {
        //Создаем панель приложения
        JPanel buying_Bikes_panel = new JPanel();
        //Задаем менеджер расположения для этой панели
        FlowLayout fl = new FlowLayout();
        buying_Bikes_panel.setLayout(fl);
        //Создаем компоненты в памяти (создаем текстовые поля, кнопку и сообщение
        // о подтверждении заказа)
        JLabel model_Bike = new JLabel("The model of the bike: ");
        JTextField model_Text = new JTextField(7);//текстовое поле"Модель В."
        JLabel number_Bike = new JLabel("The number of bikes: ");
        JTextField number_Text = new JTextField(3);//текстовое поле "Кол-во В."
        JButton button_order = new JButton("To place an order");// кнопка "Разместить заказ"
        //выдаем сообщение о подтверждении заказа
        Buing_BikesEngine bikesEngine = new Buing_BikesEngine();
        button_order.addActionListener(bikesEngine);
        //слушатель
        //добавляем компоненты на панель
        buying_Bikes_panel.add(model_Bike);
        buying_Bikes_panel.add(model_Text);
        buying_Bikes_panel.add(number_Bike);
        buying_Bikes_panel.add(number_Text);
        buying_Bikes_panel.add(button_order);

        //создаем фрейм и задаем для него панель
        JFrame frame = new JFrame("Buying bikes");
        frame.setContentPane(buying_Bikes_panel);
        //делаем размер окна достаточным для того, чтобы вместить все компоненты
        frame.setSize(450, 100);
        //отображаем окно
        frame.setVisible(true);


        //создаем выпадающее меню: Сначала создается массив с элементами,
        // которые мы хотим увидеть в будущем выпадающем списке, а затем
        // передаем ссылку на этот массив создаваемому JComboBox в конструктор.
        String[] menu_Bikes = {
                "Big",
                "Little",
                "Children"
        };

        JComboBox comboBox = new JComboBox(menu_Bikes);
        //есть два типа JComboBox — редактируемый и нередактируемый.
        // По умолчанию комбобокс нередактируемый. Для того, чтобы сделать
        // его редактируемым необходимо вызвать метод setEditable и передать
        // туда true в качестве параметра.
      //  comboBox.setEditable(true);
        //добавдяем слушателя
        comboBox.addActionListener(bikesEngine);
        }

    }


