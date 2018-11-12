public class Printer {


    private int numberOfPages;
    private int volumeOfToner;


    public Printer(int numberOfPages, int volumeOfToner) {
        this.numberOfPages = numberOfPages;
        this.volumeOfToner = volumeOfToner;
    }

    public int checkNumberOfPages(){
        return this.numberOfPages;
    }

    public int checkVolumeOfToner(){
        return this.volumeOfToner;
    }

    public int print(int pages, int copies){
        int totalPaper = pages * copies;
        if (totalPaper >= numberOfPages){
            return 0;
        }
        return (numberOfPages - totalPaper);

    }

    public int refillPaper(){
        int fill = 100;

        return this.numberOfPages = fill;
    }




}
