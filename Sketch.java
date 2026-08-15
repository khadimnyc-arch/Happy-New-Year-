import processing.core.PApplet;

public class Sketch extends PApplet {
    int y =50;
    int screen =1;

    public void settings() {
        size(600, 600);
        
    }

    public void setup() {
        background(0);
        
    }
    //need two screens
    //need to have a ball drop
    //need countdown
    //need confettti
    //need happy new year text
    public void draw() {
        //System.out.println(mouseX+" , "+ mouseY);
        if(screen==1){
            Ball();
            fill(0);
            rect(350,200,300,300);
            fill(random(255),random(255),random(255));
            count();
            if(y>620){
                screen++;
            }
        }
        else{
            confetti();
            textSize(60);
            text("HAPPY NEW YEAR",80,300);
        }

        
    }

    public void confetti(){
        fill(random(255),random(255),random(255));
        rect(10+random(550),10+random(550),20,20);
    }

    public void Ball(){
        fill(0);
        ellipse(50,y-10,80,80);
        fill(random(255),random(255),random(255));
        ellipse(50,y,80,80);
        y+=3;
    }
    public void count(){
        String[] countdown = {"3","2","1"};
        textSize(200);
        if(y<200){
            text(countdown[0],350,350);
        }
        else if(y<400){
            text(countdown[1],350,350);
        }
        else if(y<550){
            text(countdown[2],350,350);
        }
    }
}
