class Raiz {
    private double num1;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public Raiz(double num1, double num2){
        this.num1 = num1;
    }

    public void calcular(){
        System.out.println("Resultado: " + Math.sqrt(num1));
    }
}