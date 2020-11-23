public class Printer {

    private double tonerLevel;
    private double pagePrinted;
    private boolean duplex;

    public Printer(double tonerLevel, double pagePrinted, boolean duplex) {

        if(tonerLevel >- 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public void fillToner(double pageAdded) {

        double tonerfilled = tonerLevel + pageAdded;

        if (tonerfilled <= 100) {
            this.tonerLevel = tonerfilled;
            System.out.println("Toner is filled at " + tonerLevel);
        } else {
            System.out.println("too much paper in the toner ! reduce charge");

        }
    }

        public void print(double pageToPrint) {

            double pageNeeded = 0;

            if (this.duplex == true) {

                if ((pageToPrint % 2) == 1) {
                    pageNeeded = pageToPrint / 2 + 0.5;
                } else {
                    pageNeeded = pageToPrint / 2;
                }
            } else { pageNeeded = pageToPrint;}

                if (tonerLevel < pageNeeded) {
                    System.out.println("No enough paper ! please fill toner");
                } else {

                    this.pagePrinted  += pageNeeded;
                    System.out.println("You have printed " + pagePrinted + " pages so far");

                }

                this.tonerLevel = tonerLevel - pageNeeded;
                System.out.println("You have " + tonerLevel + " pages left in the printer");
            }

    public double getPagePrinted() {
        return pagePrinted;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}

