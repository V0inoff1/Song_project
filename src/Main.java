import com.sun.source.tree.NewArrayTree;

public class Main {
    public static void main(String[] args) throws Exception{

        Instrument [] instruments={
          new Guitar(),
          new Piano(),
          new Flute(),
          new Guitar(),
        };

        boolean [][] shouldPlay ={ // благодаря данному типу массива boolean мы сможем вывадить на экран определенные знаки при зачении в массиве true,
                { false, true, true, true, true, false},
                { true, false, true, false, true,false },
                { false, false, true, true, false, false },
                { false, true, true, true, true, false },
        };
Song song = new Song (instruments,shouldPlay); // передаем в метод параметры instruments,shouldPlay для того, что бы можно было
        song.play();
    }
}