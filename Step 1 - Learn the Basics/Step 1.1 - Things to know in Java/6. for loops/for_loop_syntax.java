// 1. Simple for loop

for(initialization : condition : updation) {
    // Some code to be executed
}

// Example of simple for loop
// Print table of 10

for(int i=1 ; i<11 ; i++) {
    int res = 10 * i ;
    System.out.println("10 X " + i + " = " + res);
}

// 2. Range based for loop

for(int item : array) {
    System.out.println(item);
}