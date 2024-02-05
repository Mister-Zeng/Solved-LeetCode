class FooBar {
    private int n;
    private boolean run;
    
    public FooBar(int n) {
        this.n = n;
        this.run = true;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        synchronized(this) {
            for (int i = 0; i < n; i++) {
                if(!run) {
                    wait();
                } 
                
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                run = !run; 
                notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        synchronized(this) {
            for (int i = 0; i < n; i++) {
                if(run) {
                    wait();
                }
                
                // printBar.run() outputs "bar". Do not change or remove this line.
        	    printBar.run();
                run = !run;
                notifyAll();
            }
        }
    }
}
