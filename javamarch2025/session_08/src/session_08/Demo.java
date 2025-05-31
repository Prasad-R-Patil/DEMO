package session_08;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getThreadGroup()
				.getName());//main
		System.out.println(Thread.currentThread().getThreadGroup()
				.getParent().getName());//system
	}

}

/*System

Main

main*/