class Foo {

    private boolean firstDone;
    private boolean secondDone;
    
    public Foo() {
        this.firstDone = false;
        this.secondDone = false;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        synchronized(this) {
            printFirst.run();
            firstDone = true;
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        synchronized(this) {
            while(!firstDone) {
                wait();
            }
            
            printSecond.run();
            secondDone = true;
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        synchronized(this) {
            while(!secondDone) {
                wait();
            }
            
            printThird.run();
        }
    }
}