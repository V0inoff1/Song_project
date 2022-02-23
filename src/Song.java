public class Song {
    protected  Instrument[] instruments;// список инструментов
    protected boolean [][] shouldPlay;// последовательность игры инструменов в определенную секунду

    public Song (Instrument[] instruments,boolean [][] shouldPlay){// конструктор принимает данные из Instrument[] instruments,boolean [][] shouldPlay

        this.instruments=instruments;
        this.shouldPlay=shouldPlay;
    }
    public void play() throws Exception{
        int time =shouldPlay[0].length; //  узнаем длинну массива, начиная с индекса 0
        for ( int t =0; t< time; t++){
                for (int i=0; i< instruments.length;i++) {
                    if (shouldPlay[i][t]) {
                        Instrument instrument = instruments[i];
                        char c = instrument.playSound();
                        System.out.print(c + " ");
                    }else {
                        System.out.print("  ");
                    }
                }
            System.out.println();
                Thread.sleep(1000);
            }
        }
    }
