package vvce;

class Pen {
    private boolean capOpen = false;

    public void openCap() {
        capOpen = true;
        System.out.println("Pen cap opened.");
    }

    public void write() {
        if (capOpen) {
            System.out.println("Student is writing...");
        } else {
            System.out.println("Can't write. Open the pen cap first.");
        }
    }

    public void closeCap() {
        capOpen = false;
        System.out.println("Pen cap closed.");
    }
}

class Teacher{
	Pen pen;
	public void givesPen(Pen p) {
        this.pen = p;
        System.out.println("Teacher gives pen to student.");
    }
}

class Student {
    Pen pen;
    
    public void receivesPen(Pen p) {
        this.pen = p;
        System.out.println("Student receives pen from teacher.");
    }

    public void writeSomething() {
        pen.openCap();
        pen.write();
        pen.closeCap();
    }
}

public class TeacherStudent {
    public static void main(String[] args) {
    	Teacher t = new Teacher();
        Pen p = new Pen();
        t.givesPen(p);
        Student s = new Student();
        s.receivesPen(p);
        s.writeSomething();
    }
}