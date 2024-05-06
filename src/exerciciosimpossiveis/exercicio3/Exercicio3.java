package exerciciosimpossiveis.exercicio3;

class MnopA {
    static int x = 10, y = 10, z = 10;
    
    public MnopA() {
        System.out.println("a");
        System.out.println("pre: x= "+x+" y= "+y+" z= "+z);
        x *= 2;
        System.out.println("pos: x= "+x+" y= "+y+" z= "+z);
        System.out.println("==========================");
        
    }
    
    {
        System.out.println("b");
        System.out.println("pre: x= "+x+" y= "+y+" z= "+z);
        y+=5;
        z+=10;
        System.out.println("pos: x= "+x+" y= "+y+" z= "+z);
        System.out.println("==========================");
    }
}

class MnopB extends MnopA {
    public MnopB(int c) {
        System.out.println("c");
        System.out.println("pre: x= "+x+" y= "+y+" z= "+z);
        y *= c;
        System.out.println("pos: x= "+x+" y= "+y+" z= "+z);
        System.out.println("==========================");
    }
    {
        System.out.println("d");
        System.out.println("pre: x= "+x+" y= "+y+" z= "+z);
        z+=y;
        System.out.println("pos: x= "+x+" y= "+y+" z= "+z);
        System.out.println("==========================");
    }
    
    static {
        System.out.println("e");
        System.out.println("pre: x= "+x+" y= "+y+" z= "+z);
        x=y=z=1;
        System.out.println("pos: x= "+x+" y= "+y+" z= "+z);
        System.out.println("==========================");
    }
}

public class Exercicio3 {
    public Exercicio3() {
        
    }
    
    public void init() {
        MnopB o = new MnopB(2);
        System.out.println(MnopB.x+MnopB.y+MnopB.z);
    }
}
