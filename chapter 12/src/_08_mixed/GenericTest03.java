package _08_mixed;

import java.util.ArrayList;
import java.util.List;

public class GenericTest03 {

    public static void main(String[] args) {

        List<Computer> computerList=new ArrayList<>();
        addElement(computerList);

        List<RAM> ramList=new ArrayList<>();
        List<HDD> hddList=new ArrayList<>();

        addElementObject(computerList);
        addElementObject(ramList);
        addElementObject(hddList);

        addElementObject2(computerList);
        addElementObject2(ramList);
      //  addElementObject2(hddList);

    }

    public static void addElement(List<Computer> computerList){

        computerList.add(new RAM());
        computerList.add(new HDD());
    }

    public static void addElementObject(List<? extends Computer> computerList){

        //? extends Computer,Object söz konusu olduğunda buraya sadece null eklenebilir.
    }

    public static void addElementObject2(List<? super RAM> computerList){

        //? extends Computer,Object söz konusu olduğunda buraya sadece null eklenebilir.

        computerList.add(new HDD());
      //  computerList.add(new Computer());   //Computer IS-A NOT ram
        computerList.add(new RAM());
    }
}

class Computer{


}

class RAM extends Computer{


}

class HDD extends RAM{


}
