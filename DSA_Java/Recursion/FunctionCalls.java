class FunctionCalls {
    // Static counters to track function calls
    static int mangoCount = 0;
    static int bananaCount = 0;
    static int appleCount = 0;

    public static void mango() {
        mangoCount++; // Increment mango counter
        System.out.println("Hi, I am in mango for " + mangoCount + " times");
    }

    public static void banana() {
        bananaCount++; // Increment banana counter
        System.out.println("Hi, I am in banana for " + bananaCount + " times");
        mango(); // Call mango from banana
    }

    public static void apple() {
        appleCount++; // Increment apple counter
        System.out.println("Hi, I am in apple for " + appleCount + " times");
        banana(); // Call banana from apple
        mango();  // Call mango from apple
    }

    public static void main(String[] args) {
        System.out.println("Starting function calls...");
        apple(); // Start the chain of calls
        System.out.println("Function calls completed.");
        System.out.println("Mango was called " + mangoCount + " times.");
        System.out.println("Banana was called " + bananaCount + " times.");
        System.out.println("Apple was called " + appleCount + " times.");
    }
}
