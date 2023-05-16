package javaStudy;

public interface Sort {

	public int ascending(int[] arr);
	public int descending(int[] arr);
	
	default void description() {
		System.out.println("입니다.");
	}
}
