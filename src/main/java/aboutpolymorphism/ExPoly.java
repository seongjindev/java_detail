package aboutpolymorphism;

interface Keyboard {
}

class MechanicalKeyboardImpl implements Keyboard{
    //기계식 키보드
}

class CapacitiveKeyboardImpl implements Keyboard{
    //무접점키보드
}

class NormalKeyboardImpl implements Keyboard {
    //일반키보드
}

class Worker {
    private Keyboard keyboard;
    public Worker(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}

public class ExPoly {
    public static void main(String[] args) {
//        Keyboard keyboard = new MechanicalKeyboardImpl();
//        Keyboard keyboard = new CapacitiveKeyboardImpl();
        Keyboard keyboard = new NormalKeyboardImpl(); //OCP 원칙에 위배됨 - 키보드를 바꾸기 위해 클라이언트 코드를 수정하기 때문

        Worker worker = new Worker(keyboard); //worker에 영향을 주지 않고 keyboard를 바꿀 수 있다
    }
}
