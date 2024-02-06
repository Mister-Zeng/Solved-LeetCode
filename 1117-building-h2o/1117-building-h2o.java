class H2O {

    int o;
    int h; 
    
    public H2O() {
        this.o = 0;
        this.h = 0;
    }

    private void reset() {
        if(this.o == 1 && this.h == 2) {
            this.o = 0;
            this.h = 0;
        }
    }
    
    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
        synchronized(this) {
            while(this.h == 2 && this.o == 0) {
                wait();
            }
            
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            this.h++;
            reset();
            notifyAll();   
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        synchronized(this) {
            
            while(this.h < 2 && this.o == 1) {
                wait();
            }
            
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            this.o++;
            reset();
            notifyAll();
        }
    }
}