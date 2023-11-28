import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class Foot {
    private FootShape shape;

    public Foot(FootShape shape){
        this.shape = shape;
    }

    public void draw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What to draw? 1. Ellipse, 2. Rectangle ");
        int inp = sc.nextInt();
        switch(inp){
            case 1:{
                System.out.println(shape.drawAsElipse());
                break;
            }
            case 2:{
                System.out.println(shape.drawAsRectangle());
                break;
            }
            default:{
                System.out.println("IDK");
                break;
            }
        }
    }

    public static void main(String[] args){
        FootShape shape = new FootShape();
        Foot foot = new Foot(shape);

        foot.draw();
    }
}



