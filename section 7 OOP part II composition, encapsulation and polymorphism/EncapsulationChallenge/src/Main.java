public class Main {

    public static void main(String[] args) {

        Printer printerDuplex = new Printer(100,0, true);
        Printer printerSimple = new Printer(100,0,false);


        printerDuplex.print(75);
        System.out.println(printerDuplex.getTonerLevel());
        printerDuplex.print(20);
        System.out.println(printerDuplex.getTonerLevel());
        printerDuplex.fillToner(20);
        System.out.println(printerDuplex.getTonerLevel());
        printerDuplex.fillToner(40);
        System.out.println(printerDuplex.getTonerLevel());
        System.out.println(printerDuplex.getPagePrinted());

        System.out.println("++++++++++++++++++++++");

        printerSimple.print(75);
        System.out.println(printerSimple.getTonerLevel());
        printerSimple.print(20);
        System.out.println(printerSimple.getTonerLevel());
        printerSimple.fillToner(20);
        System.out.println(printerSimple.getTonerLevel());
        printerSimple.fillToner(100);
        System.out.println(printerSimple.getTonerLevel());
        System.out.println(printerSimple.getPagePrinted());


    }
}
