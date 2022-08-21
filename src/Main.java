public class Main {
    public static void main(String[] args) {
        sub su= new sub(5);
        su.display();
    }

    private static class sup {
        protected int a;

        public sup() {
            System.out.println("super Default ");
        }

        public sup(int a) {
            System.out.println("accessed A value in super class");
            this.a = a;
        }
    }
    private static class sub extends sup{
        public sub() {
        }

        public sub(int a) {
            super(a);
        }
        public void display()
        {
            System.out.println("Subclas " + a);
        }
    }
}

