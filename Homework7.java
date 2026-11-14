abstract class Printer{
    protected String model;
    protected int printedCount;
    protected int availableCount;

    Printer(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }

    public abstract boolean print();
}

class InkjetPrinter extends Printer{
    InkjetPrinter (String model, int availableCount){
        super(model, availableCount);
    }

    @Override
    public boolean print(){
        if(availableCount == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", model, printedCount+1);
            return false;
        }
        else if(availableCount >= 1){
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
        return false;
    }
}

class LaserPrinter extends Printer{

    LaserPrinter (String model, int availableCount){
        super(model, availableCount);
    }

    @Override
    public boolean print(){
        if(availableCount == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", model, printedCount+1);
            return false;
        }
        else if(availableCount >= 1){
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
        return false;
    }
}

public class Homework7 {
    public static void main(String[] args){
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
