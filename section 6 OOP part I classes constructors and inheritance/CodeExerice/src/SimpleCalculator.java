    public class SimpleCalculator {

        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber(){
            return this.firstNumber;
        }

        public double getSecondNumber(){
            return this.secondNumber;
        }

        public void setFirstNumber(double number){
            this.firstNumber = number;
        }

        public void setSecondNumber(double number){
            this.secondNumber = number;
        }

        public double getAdditionResult(){
            double result = getFirstNumber() + getSecondNumber();
            return result;
        }

        public double getSubtractionResult(){
            double result = getFirstNumber() - getSecondNumber();
            return result;
        }

        public double getMultiplicationResult(){
            double result = getFirstNumber() * getSecondNumber();
            return result;
        }

        public double getDivisionResult(){

            if (this.secondNumber == 0){
                return 0;
            } else {
                double result = getFirstNumber() / getSecondNumber();
                return result;
            }
        }
    }
