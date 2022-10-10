class MethodOverloading {
    void display (int x){
        System.out.println("Method 1");
    }
    void display (int x, double y, double z){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        MethodOverloading mol = new MethodOverloading();
        mol.display(3,45.64,343.33);
        mol.display(5);
    }
}
