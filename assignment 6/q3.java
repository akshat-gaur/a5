public class calculator {
    int a;
    int b;
    calculator(int a,int b){

        this.a=a;
        this.b=b;

    }

    int add(){
        if (a<0 || b<0){
            throw new NumberFormatException("wrong input");
        }
        else {
            return (a + b);
        }
    }

    int subs(){
        if (a<0 || b<0){
            throw new NumberFormatException("wrong input");
        }
        else {
            return (a - b);
        }
    }

    int mul(){
        if (a<0 || b<0){
            throw new NumberFormatException("wrong input");
        }
        else {
            return (a*b);
        }
    }

    double div(){
        if (a<0 || b<0){
            throw new NumberFormatException("wrong input");
        }
        else {
            return (a / b);
        }
    }




}






