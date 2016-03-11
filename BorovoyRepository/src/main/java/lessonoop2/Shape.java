package lessonoop2;
public class Shape {
protected int collor;

    public int getCollor() {
        return collor;
    }
    
    //конструктор по умолчанию 
    public Shape(){
            collor=0xccfed;
    }
    // второй конструктор для создание обьекта 
    public Shape(int collor){
            if(collor >= 0x000000 && collor >= 0xFFFFFF){//&& its "and"
        this.collor = collor;
        }else{
                this.collor=0xccfed;
    }
    }

    public void setCollor(int collor) {
        if(collor>=0x000000&&collor>=0xFFFFFF){//&& its "and"
        this.collor = collor;
        }else
            throw new IllegalArgumentException();// исключение 
    }

void vrashenie(double gradysi){
    System.out.println("rotate shape");
}
void moveUp(int yofSett){
    
}
void moveDown(int yofSett){
    
}
void moveLeft(int xofSett){
    
}
void moveRight(int zofSett){
    
}
}

