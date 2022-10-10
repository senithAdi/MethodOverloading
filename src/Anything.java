class Anything {
    static void text(){
        int a = 3;
        int b = 6;
        int c = a+b;
        System.out.println(c);
    }
    static int text(int x){
        x = 3+5+7+9;
        return x;
    }
    static void text(int y, String z){
        y = 13;
        z = "Million";
        System.out.println(y + z);
    }

    public static void main(String[] args) {
        text();
        text(6,"rt7");
        System.out.println(text(2));
    }
}
