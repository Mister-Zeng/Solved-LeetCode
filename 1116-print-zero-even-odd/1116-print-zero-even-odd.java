class ZeroEvenOdd {
    private int n;
    private int currentNumber; 
    private int currentNumberPrinted; 
    
    public ZeroEvenOdd(int n) {
        this.n = n;
        this.currentNumber = 1; 
        this.currentNumberPrinted = 0;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        synchronized(this) {
            while(currentNumberPrinted <= n) {
                while(currentNumberPrinted != 0) {
                    wait();
                }

                if(currentNumber <= n) {
                    printNumber.accept(0);
                }
                currentNumberPrinted = currentNumber; 
                notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        synchronized(this) {
            while(currentNumber <= n) {
                while(currentNumberPrinted == 0 || currentNumber % 2 != 0) {
                    wait();
                }
                
                if(currentNumberPrinted <= n) {
                    printNumber.accept(currentNumberPrinted);
                }
                
                
                currentNumber++; 
                currentNumberPrinted = 0;
                notifyAll();
            }   
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        synchronized(this) {
            while(currentNumber <= n) {
                while(currentNumberPrinted == 0 || currentNumber % 2 == 0) {
                    wait();
                }
                
                if(currentNumberPrinted <= n) {
                    printNumber.accept(currentNumberPrinted);
                }
                

                currentNumber++; 
                currentNumberPrinted = 0;
                notifyAll();
            }   
        }
    }
}